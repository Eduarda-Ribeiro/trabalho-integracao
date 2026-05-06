import adapter.EnviadorAdapter;
import adapter.EnviadorRelatorio;
import adapter.SistemaEnvio;
import bridge.Boletim;
import bridge.Formato;
import bridge.Pdf;
import bridge.Relatorio;
import decorator.CompressaoDecorator;
import decorator.Gerador;
import decorator.GeradorSimples;
import decorator.LogDecorator;
import flyweight.Disciplina;
import flyweight.DisciplinaFactory;
import proxy.GeradorProxy;
import facade.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Flyweight
        System.out.println("[FLYWEIGHT] Testando reutilização de objetos...");
        Disciplina d1 = DisciplinaFactory.getDisciplina("Matemática");
        Disciplina d2 = DisciplinaFactory.getDisciplina("Matemática");
        Disciplina d3 = DisciplinaFactory.getDisciplina("Física");
        System.out.println("\nComparações:");
        System.out.println("d1 == d2 ? " + (d1 == d2)); 
        System.out.println("d1 == d3 ? " + (d1 == d3));

        // Bridge
        System.out.println("[MAIN] Criando relatório com Bridge...");
        Formato formato = new Pdf();
        Relatorio boletim = new Boletim(formato);

        // Decorator + Proxy
        System.out.println("\n[MAIN] Configurando gerador com Decorator + Proxy...");
        Gerador gerador = new GeradorSimples();
        gerador = new LogDecorator(gerador);
        gerador = new CompressaoDecorator(gerador);
        gerador = new GeradorProxy(gerador);

        // Adapter
        System.out.println("\n[MAIN] Configurando envio com Adapter...");
        SistemaEnvio externo = new SistemaEnvio();
        EnviadorRelatorio enviador = new EnviadorAdapter(externo);

        // Facade
        System.out.println("\n[MAIN] Executando via Facade...");
        SistemaRelatorioFacade facade = new SistemaRelatorioFacade();
        facade.gerarEnviar(boletim, gerador, enviador);

        // Teste do Proxy (cache)
        System.out.println("[MAIN] Chamando gerador novamente (teste de cache)...");
        gerador.gerar();
    }
}
