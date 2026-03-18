package compiladores.fortall.parser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class AppTest {

    @Test
    void testaFatorial() {
        String entrada = "5";
        String saidaEsperada = "fatorial de 5 = 120\n";
        String programa = "examples/fatorial.4tall";

        String saida = executaPrograma(programa, entrada);
        Assertions.assertTrue(saida.contains(saidaEsperada));
    }

    @Test
    void testaIsEven() {
        String entrada = "23";
        String saidaEsperada = "23 é par\n";
        String programa = "examples/isEven.4tall";

        String saida = executaPrograma(programa, entrada);
        Assertions.assertFalse(saida.contains(saidaEsperada));
    }

    @Test
    void testaLogico() {
        String entrada = "122";
        String programa = "examples/logico.4tall";
        Integer linhasEsperadasSaida = (Integer.valueOf(entrada) * 2) - 1;
        String saida = executaPrograma(programa, entrada);
        Assertions.assertEquals(linhasEsperadasSaida, saida.split("\n").length);
    }

    static String executaPrograma(String programa, String entrada) {
        InputStream isEntrada = new ByteArrayInputStream(entrada.getBytes());
        OutputStream osSaida = new ByteArrayOutputStream();
        Exception ex = null;
        try {
            App.main(new String[]{programa}, isEntrada, osSaida);
            return osSaida.toString();
        } catch (Exception e) {
            ex = e;
        }
        Assertions.assertNull(ex);
        return "";
    }
}