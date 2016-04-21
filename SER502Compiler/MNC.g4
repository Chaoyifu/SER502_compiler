/**
 * Define a grammar called Hello
 */
grammar MNC;
WS : [ \t\r]+ -> skip ; // skip spaces, tabs, newlines

program : MAIN EOD body END;

body : START (EOD)+ statements END (EOD)*;

statements : (statement EOD)*|(EOD)*;

statement : arithmetic|assignment|functioncall|conditional|loop|funcdeclaration|printcall;

arithmetic : type ':' IDENTIFIER;

type : NUM | BOOLT;

bool : TRUE | FALSE;

assignment : IDENTIFIER EQUALS expr | IDENTIFIER EQUALS READ;

expr : term ((ADD|SUB) term)*;

term : factor ((MUL|DIV) factor)*;

factor : IDENTIFIER|number;

number : (DIGIT)+|(sign)(DIGIT)+ ;

conditional : IF OPENPAR(boolcheck|bool)CLOSEPAR(EOD body)(ELSE(EOD body))?;

loop : LOOP OPENPAR(IDENTIFIER|number)CLOSEPAR TO OPENPAR(IDENTIFIER|number)CLOSEPAR WITH number EOD body;

funcdeclaration : FUNCTION IDENTIFIER OPENPAR((instatement)* (outstatement)?) CLOSEPAR EOD body;

instatement : IN type IDENTIFIER;

outstatement : OUT type IDENTIFIER;

printcall : PRINT (IDENTIFIER|bool|number);

functioncall : IDENTIFIER OPENPAR(IDENTIFIER((SEPERATOR)IDENTIFIER)*)*CLOSEPAR;

boolcheck : expr CONDITIONS expr; 

sign : OPENPAR ADD CLOSEPAR | OPENPAR SUB CLOSEPAR;

MAIN : 'main';

START : 'start';

END : 'end';

NUM : 'number';

BOOLT : 'boolean';

TRUE : 'true';

FALSE : 'false';

IF : 'if';

ELSE : 'else';

LOOP : 'loop:';

TO : 'to';

WITH : 'with';

FUNCTION : 'function:';

IN : 'in:';

OUT : 'out:';

PRINT : 'print:';

READ : 'readInput';

EOD : '\n';

EQUALS : '=';

DIGIT : [0-9];

CONDITIONS : '=='|'!='|'<='|'>='|'<'|'>';

ADD : '+';

SUB : '-';

MUL : '*';

DIV : '/';

OPENPAR : '(';

CLOSEPAR : ')';

SEPERATOR : ',';

IDENTIFIER : ([a-z]|[A-Z]|'_')([a-z]|[A-Z]|'_'|[0-9])*;