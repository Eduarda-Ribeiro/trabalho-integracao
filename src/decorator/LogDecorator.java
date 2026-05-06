package decorator;

public class LogDecorator extends GeradorDecorator {

    public LogDecorator (Gerador g) {
        super(g);
    }

    public String gerar() {
        System.out.println("[DECORATOR - LOG] Antes de gerar");
        String resultado = wrappee.gerar();
        System.out.println("[DECORATOR - LOG] Depois de gerar");
        return resultado;
    }
}
