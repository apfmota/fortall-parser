grammar SimpleExpr;

expr   : term (PLUS term)* ;
term   : INT ;
PLUS   : '+' ;
INT    : [0-9]+ ;
WS     : [ \t\r\n]+ -> skip ;