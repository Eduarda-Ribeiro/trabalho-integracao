package bridge;

import java.util.HashMap;
import java.util.Map;

public class Historico extends Relatorio {
    public Historico(Formato formato) {
        super(formato);
    }

    protected Map<String, Object> gerarDados() {
        Map<String, Object> dados = new HashMap<>();
        dados.put("aluno", "Maria");
        dados.put("curso", "Administração");
        dados.put("semestres", 8);
        return dados;
    }
}
