package proxy;

import decorator.Gerador;

public class GeradorProxy implements Gerador {

    private Gerador real;
    private String cache;

    public GeradorProxy(Gerador real) {
        this.real = real;
    }

    public String gerar() {
        if (cache == null) {
            System.out.println("[PROXY] Cache vazio, gerando...");
            cache = real.gerar();
        } else {
            System.out.println("[PROXY] Retornando do cache...");
        }
        return cache;
    }
}
