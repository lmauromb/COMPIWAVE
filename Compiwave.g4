grammar Compiwave;

compiwave
    : 'begin' (var_declaration|list_declaration|function_declaration)* main_function 'end'
    ;

var_declaration
    : type ID (ASSIGN expr)? ';'
    ;

list_declaration
    : 'list' ID '(' type ')' ';'
    ;

function_declaration
    : 'function' (type|'void') ID '(' function_params? ')' block
    ;

function_params
    : function_param (',' function_param)*
    ;

function_param
    : type ID
    ;

type
    : T_FLOAT | T_INT | T_BOOL | T_STRING
    ;

list_assignment
    : ID '[' expr ']' ASSIGN expr ';'
    ;

list_push
    : ID PUSH expr ';'
    ;

list_pop
    : ID POP
    ;

var_assignment
    : ID ASSIGN (ID ASSIGN)* expr ';'
    ;

block
    : '{' statement* '}'
    ;

main_function
    : 'main' block
    ;

statement
    : var_declaration
    | list_declaration
    | if_statement
    | while_statement
    | do_while_statement
    | return_statement
    | var_assignment
    | list_assignment
    | list_push
    | list_pop ';'
    | function_statement ';'
    ;

function_statement
    : ID '(' arguments? ')'
    ;

arguments
	: expr (',' expr)*
	;

if_statement
    : 'if' '(' if_expr ')' block (else_statement)?
    ;
else_statement
    : 'else'  block
    ;

while_statement
    : 'while' '(' if_expr ')' block
    ;

do_while_statement
    : 'do' block 'while' '(' do_if_expr ')'
    ;

if_expr
    : expr
    ;

do_if_expr
    : expr
    ;

return_statement
    : 'return' expr ';'
    ;

expr
    : function_statement            #FunctionCall // get parent to use this expr node
    | ID '[' expr ']'               #ListIndex
    | list_pop                      #ListPop
    | ID                            #VarReference
    | INT                           #IntConst
    | FLOAT                         #FloatConst
    | BOOLEAN                       #BoolConst
    | STRING                        #StringConst
    | '(' expr ')'                  #Paren
    | expr (MULT | DIV ) expr 		#MultDiv
    | expr (ADD | MINUS) expr                   #AddSub
    | expr (LT | GT | LEQUAL | GEQUAL) expr     #LTGT
    | expr (EQUALS | NOTEQUAL) expr             #EqualityNot
    ;

PUSH : '<<';
POP : '>>';

ASSIGN : '=';
ADD : '+';
MINUS : '-' ;
MULT : '*';
DIV : '/';

EQUALS : '==';
NOTEQUAL : '!=';
LT : '<';
GT : '>';
LEQUAL : '<=';
GEQUAL : '>=';

T_FLOAT : 'float';
T_INT : 'int';
T_BOOL : 'boolean';
T_STRING : 'string';

ID  : LETTER (LETTER | DIGIT)* ;

BOOLEAN : ('true' | 'false');

INT : DIGIT+ ;

FLOAT
	: DIGIT+ '.' DIGIT*
	| '.' DIGIT+
	;

STRING : '"' (ESC|.)*? '"' ;

fragment
LETTER : [a-zA-Z_] ;

fragment
DIGIT : [0-9] ;

fragment
ESC : '\\"' | '\\\\' ;

WS  : [ \t\n\r]+ -> skip ;

SL_COMMENT
    : '#' .*? '\n' -> skip ;