package decorator;

public class CompressaoDecorator extends GeradorDecorator {

    public CompressaoDecorator(Gerador g) {
        super(g);
    }

    public String gerar() {
        System.out.println("[DECORATOR - COMPRESSAO] Comprimindo conteúdo...");
        return "COMPRESSED(" + wrappee.gerar() + ")";
    }
}
