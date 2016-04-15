/**
 * Define a grammar called Hello
 */
grammar MNC;
WS : [ \t\r]+ -> skip ; // skip spaces, tabs, newlines

program : MAIN EOD body;

body : START (EOD)+ statements END (EOD)*;

statements : (statement EOD)*|('\n')*;

statement : arithmetic|assignment|functioncall|conditional|loop|funcdeclaration|(EOD)*;

arithmetic : type ':' IDENTIFIER;

type : (num) | (boolt);

bool : TRUE | FALSE;

assignment : IDENTIFIER EQUALS expr;

expr : expr ADD expr|expr MUL expr|factor;

factor : IDENTIFIER|number;

number : (SIGN)(DIGIT)+|(DIGIT)+;

functioncall : IDENTIFIER OPENPAR(IDENTIFIER((SEPERATOR)IDENTIFIER)*)*CLOSEPAR(EOD);

conditional : IF OPENPAR(boolcheck|bool)CLOSEPAR(body)(ELSE(body))?;

boolcheck : expr CONDITIONS expr; 

loop : LOOP OPENPAR(IDENTIFIER|DIGIT)CLOSEPAR TO OPENPAR(IDENTIFIER|DIGIT)CLOSEPAR WITH DIGIT body;

funcdeclaration : FUNCTION IDENTIFIER OPENPAR(IN(IDENTIFIER)* OUT(IDENTIFIER)*)body;

MAIN : 'main';

START : 'start';

END : 'end';

PROGRAMEND : 'mainEnd';

IDENTIFIER : ([a-z]|[A-Z]|'_')([a-z]|[A-Z]|'_'|[0-9])*;

EOD : '\n';

EQUALS : '=';

SIGN : '+'|'-';

DIGIT : [0-9];

num : 'number';

boolt : 'boolean';

TRUE : 'true';

FALSE : 'false';

CONDITIONS : '=='|'!='|'<='|'>='|'<'|'>';

ADD : '+'|'-';

MUL : '*'|'/';

OPENPAR : '(';

CLOSEPAR : ')';

SEPERATOR : ',';

IF : 'if';

ELSE : 'else';

LOOP : 'loop:';

TO : 'to';

WITH : 'with';

FUNCTION : 'function:';

IN : 'in:';

OUT : 'out:';