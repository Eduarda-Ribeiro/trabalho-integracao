package bridge;

import java.util.Map;

public abstract class Relatorio {
    protected Formato formato;

    public Relatorio(Formato formato) {
        this.formato = formato;
    }

    protected abstract Map<String, Object> gerarDados();

    public String gerar() {
        return formato.gerar(gerarDados());
    }
}
