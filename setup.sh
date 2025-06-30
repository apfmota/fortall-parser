java -Dfile.encoding=UTF-8 -jar antlr-4.13.2-complete.jar -visitor -package compiladores.fortall.parser src/main/java/compiladores/fortall/parser/Fortall.g4 -o src/main/java/compiladores/fortall/parser/
mvn clean package
echo 'Setup finalizado'
echo 'Para rodar o programa utilize: java -Dfile.encoding=UTF-8 -jar target/fortall-parser-1.0.jar <arquivo_input>'