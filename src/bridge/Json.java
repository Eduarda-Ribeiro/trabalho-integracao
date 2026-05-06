package bridge;

import java.util.Map;

public class Json implements Formato {


    public String gerar(Map<String, Object> dados) {

        System.out.println("[BRIDGE] Gerando JSON...");

        StringBuilder json = new StringBuilder("{\n");

        for (Map.Entry<String, Object> entry : dados.entrySet()) {
            json.append("  \"")
                    .append(entry.getKey())
                    .append("\": \"")
                    .append(entry.getValue())
                    .append("\",\n");
        }

        json.deleteCharAt(json.length() - 2); // remove última vírgula
        json.append("\n}");

        return json.toString();
    }

}
