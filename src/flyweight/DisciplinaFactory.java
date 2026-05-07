package flyweight;

import java.util.HashMap;
import java.util.Map;

public class DisciplinaFactory {
    private static Map<String, Disciplina> cache = new HashMap<>();

    public static Disciplina getDisciplina(String nome) {
        if (cache.containsKey(nome)) {
            System.out.println("[FLYWEIGHT] Reutilizando disciplina: " + nome);
            return cache.get(nome);
        }
        System.out.println("[FLYWEIGHT] Criando nova disciplina: " + nome);
        Disciplina disciplina = new Disciplina(nome);
        cache.put(nome, disciplina);

        return disciplina;
    }
}
