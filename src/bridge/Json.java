package bridge;

public class Json implements Formato {
    @Override
    public String gerar(String dados) {
        return "{ \"dados\": \"" + dados + "\" }";
    }
}
