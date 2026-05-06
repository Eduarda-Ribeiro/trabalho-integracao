package bridge;

import java.util.Map;

public class Pdf implements Formato {
    public String gerar(Map<String, Object> dados) {

        System.out.println("[BRIDGE] Gerando PDF...");

        StringBuilder pdf = new StringBuilder();

        pdf.append("===== RELATÓRIO PDF =====\n");

        for (Map.Entry<String, Object> entry : dados.entrySet()) {
            pdf.append(entry.getKey().toUpperCase())
                    .append(": ")
                    .append(entry.getValue())
                    .append("\n");
        }

        pdf.append("=========================");

        return pdf.toString();
    }
}
