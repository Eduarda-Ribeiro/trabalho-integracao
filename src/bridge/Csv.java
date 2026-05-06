package bridge;

import java.util.Map;

public class Csv implements Formato {

    public String gerar(Map<String, Object> dados) {

        System.out.println("[BRIDGE] Gerando CSV...");

        StringBuilder header = new StringBuilder();
        StringBuilder values = new StringBuilder();

        for (String key : dados.keySet()) {
            header.append(key).append(",");
        }

        for (Object value : dados.values()) {
            values.append(value).append(",");
        }

        header.deleteCharAt(header.length() - 1);
        values.deleteCharAt(values.length() - 1);

        return header + "\n" + values;
    }
}
