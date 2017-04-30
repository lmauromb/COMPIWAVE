grammar Compiwave;

compiwave
    : 'begin' (var_declaration|list_declaration|vector_declaration|matrix_declaration|function_declaration)* main_function 'end'
    ;

var_declaration
    : cwtype ID (ASSIGN expr)? ';'
    ;

list_declaration
    : 'list' ID '(' cwtype ')' ';'
    ;

vector_declaration
    : cwtype ID '[' expr ']' ';'
    ;

matrix_declaration
    : cwtype ID '[' expr ']' '[' expr ']' ';'
    ;

function_declaration
    : 'function' (cwtype|'void') ID '(' function_params? ')' block
    ;

function_params
    : numberOfParams+=function_param (',' numberOfParams+=function_param)*
    ;

function_param
    : cwtype ID
    ;

cwtype
    : T_FLOAT | T_INT | T_BOOL | T_STRING
    ;

vector_assignment
    : ID '[' expr ']' ASSIGN expr ';'
    ;

matrix_assignment
    : ID '[' expr ']' '[' expr ']' ASSIGN expr ';'
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
    : block
    | var_declaration
    | list_declaration
    | vector_declaration
    | matrix_declaration
    | if_statement
    | while_statement
    | do_while_statement
    | return_statement
    | print_statement
    | var_assignment
    | vector_assignment
    | matrix_assignment
    | list_push
    | list_pop ';'
    | function_statement ';'
    ;

function_statement
    : ID '(' arguments? ')'
    ;

arguments
	: numberOfArguments+=expr (',' numberOfArguments+=expr)*
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
    : 'do' block 'while' '(' do_if_expr ')' ';'
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

print_statement
    : 'print' '(' expr ')' ';'
    ;

expr
    : function_statement            #FunctionCall // get parent to use this expr node
    | ID '[' expr ']'               #VectorIndex
    | ID '[' expr ']' '[' expr ']'  #MatrixIndex
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
    | expr (AND | OR) expr                      #AndOr
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
AND : '&&';
OR : '||';

T_FLOAT : 'float';
T_INT : 'int';
T_BOOL : 'boolean';
T_STRING : 'string';

ID  : LOWERCASE (LETTER | DIGIT)* ;

BOOLEAN
    : 'True'
    | 'False'
    ;

INT : '-'?DIGIT+ ;

FLOAT
	: '-'?DIGIT+ '.' DIGIT*
	| '-'?'.' DIGIT+
	;

STRING : '"' (ESC|.)*? '"' ;

fragment
LOWERCASE : [a-z] ;

fragment
LETTER : [a-zA-Z_] ;

fragment
DIGIT : [0-9] ;

fragment
ESC : '\\"' | '\\\\' ;

WS  : [ \t\n\r]+ -> skip ;

SL_COMMENT
    : '#' .*? '\n' -> skip ;