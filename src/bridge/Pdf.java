package bridge;

public class Pdf implements Formato {
    @Override
    public String gerar(String dados) {
        System.out.println("[BRIDGE] Gerando em formato PDF");
        return "PDF: " + dados;
    }
}
