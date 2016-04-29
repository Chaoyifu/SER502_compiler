/**
 * Define a grammar called Hello
 */
grammar MNC;
WS : [\t\r]+ -> skip ; // skip spaces, tabs, newlines

program : ((funcdeclaration|arithmetic) EOL)* MAIN EOL body EOL ((funcdeclaration|arithmetic) EOL)*;

body : START (EOL)+ statements END (EOL)*;

statements : (statement EOL)*|(EOL)*;

statement : arithmetic|assignment|functioncall|conditional|loop|printcall;

arithmetic : type COLON var;

var : IDENTIFIER | array;

array : IDENTIFIER ARRAYOPEN ((DIGIT)+|IDENTIFIER) ARRAYCLOSE;

type : NUM | BOOLT;

bool : TRUE | FALSE;

assignment : var EQUALS expr | var EQUALS READ;

expr : term | (term (ADD|SUB) expr);

term : factor | (factor (MUL|DIV) term);

factor : element | OPENPAR expr CLOSEPAR;

element : var|number|bool;

number : (DIGIT)+|(sign)(DIGIT)+ ;

conditional : IF OPENPAR(boolcheck|var)CLOSEPAR(EOL body)(ELSE(EOL body))?;

loop : LOOP OPENPAR(startlooppar)CLOSEPAR TO OPENPAR(looppar)CLOSEPAR WITH number EOL body;

startlooppar: IDENTIFIER|number;

looppar: var|number;

funcdeclaration : FUNCTION IDENTIFIER OPENPAR((instatement)* (outstatement)?) CLOSEPAR EOL body;

instatement : IN type var;

outstatement : OUT type IDENTIFIER;

printcall : PRINT (var|bool|number);

functioncall : IDENTIFIER OPENPAR var?(SEPERATOR var)* CLOSEPAR;

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

EOL : '\n';

EQUALS : '=';

DIGIT : [0-9];

CONDITIONS : '=='|'!='|'<='|'>='|'<'|'>';

ADD : '+';

SUB : '-';

MUL : '*';

DIV : '/';

OPENPAR : '(';

CLOSEPAR : ')';

ARRAYOPEN : '[';

ARRAYCLOSE : ']';

SEPERATOR : ',';

COLON : ':';

IDENTIFIER : ([a-z]|[A-Z]|'_')([a-z]|[A-Z]|'_'|[0-9])*;