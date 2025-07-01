package compiladores.fortall.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;

public class FortallErrorListener extends BaseErrorListener {

    private final List<String> erros = new ArrayList<>();

    @Override
    public void syntaxError(
        Recognizer<?, ?> recognizer,
        Object offendingSymbol,
        int line,
        int charPositionInLine,
        String msg,
        RecognitionException e
    ) {
       erros.add("Erro encontrado ao relizar o parse: \"" + msg + "\". Linha " + line);
    }

    public List<String> getErros() {
        return erros;
    }
}
