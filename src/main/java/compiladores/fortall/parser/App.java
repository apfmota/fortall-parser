package compiladores.fortall.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {
    public static void main(String[] args) throws Exception {
        String input = "programa codiguinho; \n" +
                "início" +
                "escrever(\"oi\"); \n" +
                "a := 1 + 1 - (23); \n" +
                "fim \n";
        FortallLexer lexer = new FortallLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FortallParser parser = new FortallParser(tokens);
        ParseTree tree = parser.programa();

        FortallBaseVisitor fortallBaseVisitor = new FortallBaseVisitor<>();
        fortallBaseVisitor.visit(tree);
    }
}
