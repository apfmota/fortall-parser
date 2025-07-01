package compiladores.fortall.parser;

import java.util.Scanner;

public class Variavel {

    private Object valor;
    private final String tipo;
    private final String id;

    public Variavel(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public void ler(Scanner scanner) {
        //REFATORAR
        if (tipo.equals("inteiro")) {
            this.valor = scanner.nextInt();
        } else if (tipo.equals("lógico")) {
            String valor = scanner.next();
            if (valor.equalsIgnoreCase("verdadeiro") || valor.equalsIgnoreCase("falso")) {
                this.valor = valor.equalsIgnoreCase("verdadeiro");
            } else {
                throw new RuntimeException("Valor lógico inválido: " + valor);
            }
        } else {
            throw new RuntimeException("Tipo de variável desconhecido: " + tipo);
        }
    }
}
