grammar Libro;


programa: (funcion)+ ;
funcion : FN ID LPAREN (parametros)? RPAREN LCURLY instrucciones RCURLY ;
parametros : ID (COMMA ID)* ;
instrucciones : (leer | escribir | asignacion)* ;
leer : READ LPAREN ID RPAREN SEMI ;
escribir : WRITE LPAREN expresion RPAREN SEMI ;
asignacion : ID EQ expresion SEMI ;
expresion : INT | STRING | ID ;


FN : 'funcion' ;
READ : 'leer' ;
WRITE : 'escribir' ;
EQ : '=' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;
COMMA : ',' ;
SEMI : ';' ;

ID : [a-zA-Z_] [a-zA-Z0-9_]* ;
INT : [0-9]+ ;
STRING : '"' (~["\r\n])* '"' ;

WS : [ \t\r\n\f]+ -> skip ;