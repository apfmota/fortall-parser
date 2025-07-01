grammar Fortall;

programa : PROGRAMA ID PV declaracoes corpo ;
declaracoes : VAR variaveis
    |
    ;
variaveis : ids DP TIPO PV mais_variaveis ;
mais_variaveis : variaveis
    |
    ;
ids : ID mais_ids ;
mais_ids : VR  ids
    |
    ;
corpo : INICIO comandos FIM ;
comandos : comando PV mais_comandos ;
mais_comandos : comandos
    |
    ;
comando : escrita
    | leitura
    | atribuicao
    | se
    | loop
    ;
escrita : ESCREVER AP valores_string FP ;
valores_string : valor_string mais_valores_string ;
valor_string : STRING 
    | expressao
    ;
mais_valores_string : VR valores_string
    |
    ;
leitura : LER AP ids FP ;
atribuicao : ID ATR expressao
    | ID ATR BOOLEANO ;
se : SE expressao ENTAO comandos senao FIM ;
senao : SENAO se
    | SENAO comandos
    |
    ;
loop : ENQUANTO expressao FACA comandos FIM ;

expressao : expressao_aritmetica | expressao_logica ;
expressao_aritmetica : aritmetica fator ;
expressao_logica : aritmetica relacao ;
relacao : EQ aritmetica
    | NE aritmetica
    | GT aritmetica
    | GE aritmetica
    | LT aritmetica
    | LE aritmetica
    |
    ; 

aritmetica : precedente termo ;
termo : MAIS precedente termo
    | MENOS precedente termo
    |
    ;
precedente : sinalizador fator ;
fator : MULT sinalizador fator
    | DIV sinalizador fator
    |
    ;
sinalizador : MENOS valor
    | valor
    ;
valor : AP aritmetica FP
    | ID
    | NUM
    ;

// palavras reservadas

ATR : ':=' ;
AP : '(' ;
FP : ')' ;
VR : ',' ;
PV : ';' ;
DP : ':' ;
VAR : 'var' ;
PROGRAMA: 'programa' ;
TIPO : 'inteiro' | 'lógico' ;
INICIO : 'início' ;
FIM : 'fim' ;
ESCREVER : 'escrever' ;
LER : 'ler' ;
SE :  'se' ;
ENTAO : 'então';
SENAO : 'senão' ;
ENQUANTO : 'enquanto' ;
FACA : 'faça' ;
EQ : '=' ;
NE : '<>' ;
GT : '>' ;
GE : '>=' ;
LT : '<' ;
LE : '<=' ;
MAIS : '+' ;
MENOS : '-' ;
MULT : '*' ;
DIV : '/' ;
BOOLEANO : 'verdadeiro' | 'falso' ;

// tokens variaveis

STRING : '"' (~["\r\n])* '"' ;
ID : [a-zA-Z][a-zA-Z0-9]* ;
NUM : [0-9]+ ;

// ignorando whitespaces
WS : [ \t\r\n]+ -> skip ;
COMENTARIO: '/*' .*? '*/' -> skip ;
