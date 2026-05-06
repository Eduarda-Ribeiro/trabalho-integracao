package bridge;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RecursiveTask;

public class Frequencia extends Relatorio {
    public Frequencia(Formato formato) {
        super(formato);
    }

    protected Map<String, Object> gerarDados() {
        Map<String, Object> dados = new HashMap<>();
        dados.put("aluno", "Maria");
        dados.put("disciplina", "Matemática");
        dados.put("frequencia", "90%");
        return dados;
    }
}
