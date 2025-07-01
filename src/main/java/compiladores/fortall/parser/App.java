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
            
            parser.removeErrorListeners();
            FortallErrorListener fortallErrorListener = new FortallErrorListener();
            parser.addErrorListener(fortallErrorListener);
            ParseTree tree = parser.programa();

            if (fortallErrorListener.getErros().isEmpty()) {
                FortallVisitorImpl fortallVisitorV1 = new FortallVisitorImpl(System.in);
                try {
                    fortallVisitorV1.visit(tree);
                } catch (RuntimeException runtimeException) {
                    System.out.println("Erro ao executar: " + runtimeException.getMessage());
                }
            } else {
                for (String erro: fortallErrorListener.getErros()) {
                    System.out.println(erro);
                }
            }
        } else {
            System.out.println("Informe nome do arquivo contendo código fonte em fortall");
        }
    }
}
