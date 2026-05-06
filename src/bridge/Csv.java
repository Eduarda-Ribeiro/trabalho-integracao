package bridge;

public class Csv implements Formato {
    @Override
    public String gerar(String dados) {
        return "CSV: " + dados;
    }
}
