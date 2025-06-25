package compiladores.fortall.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        String input = "1 + 2 + 3";
        SimpleExprLexer lexer = new SimpleExprLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleExprParser parser = new SimpleExprParser(tokens);
        ParseTree tree = parser.expr();
        System.out.println(tree.toStringTree(parser));
    }
}
