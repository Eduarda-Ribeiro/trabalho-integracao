package bridge;

public class Boletim extends Relatorio {

    public Boletim (Formato formato) {
        super(formato);
    }

    public String gerar() {
        return formato.gerar("Boletim do aluno");
    }
}
