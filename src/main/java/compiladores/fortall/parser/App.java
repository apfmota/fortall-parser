package compiladores.fortall.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            FortallLexer lexer = new FortallLexer(CharStreams.fromPath(Paths.get(args[0]), StandardCharsets.UTF_8));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FortallParser parser = new FortallParser(tokens);
            ParseTree tree = parser.programa();

            FortallVisitor_V1 fortallVisitorV1 = new FortallVisitor_V1(System.in);

            try {
                fortallVisitorV1.visit(tree);
            } catch (RuntimeException runtimeException) {
                System.out.println("Erro ao executar: " + runtimeException.getMessage());
            }
        } else {
            System.out.println("Informe nome do arquivo contendo código fonte em fortall");
        }
    }
}
