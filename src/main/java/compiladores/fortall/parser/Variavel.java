package compiladores.fortall.parser;

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
}
