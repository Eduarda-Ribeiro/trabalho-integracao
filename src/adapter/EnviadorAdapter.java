package adapter;

import bridge.Relatorio;

public class EnviadorAdapter implements EnviadorRelatorio {

    private SistemaEnvio sistema;

    public EnviadorAdapter(SistemaEnvio sistema) {
        this.sistema = sistema;
    }

    public void enviar(Relatorio relatorio) {
        System.out.println("[ADAPTER] Adaptando envio do relatório...");
        String conteudo = relatorio.gerar();

        System.out.println("[ADAPTER] Chamando sistema externo...");
        sistema.enviarArquivo(conteudo);
    }
}
