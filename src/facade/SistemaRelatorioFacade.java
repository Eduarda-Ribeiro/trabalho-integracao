package facade;

import adapter.EnviadorRelatorio;
import bridge.Relatorio;
import decorator.Gerador;

public class SistemaRelatorioFacade {

    public void gerarEnviar(Relatorio relatorio, Gerador gerador, EnviadorRelatorio enviador) {

        System.out.println("\n[FACADE] Iniciando processo completo...");

        String conteudoExtra = gerador.gerar();
        String conteudo = relatorio.gerar();

        System.out.println("[FACADE] Conteúdo final montado:");
        System.out.println(conteudo + " | " + conteudoExtra);

        System.out.println("[FACADE] Delegando envio...");
        enviador.enviar(relatorio);

        System.out.println("[FACADE] Processo finalizado.\n");
    }
}
