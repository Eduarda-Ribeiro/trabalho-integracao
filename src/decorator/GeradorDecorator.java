package decorator;

public abstract class GeradorDecorator implements Gerador {
    protected Gerador wrappee;

    public GeradorDecorator(Gerador g) {
        this.wrappee = g;
    }
}
