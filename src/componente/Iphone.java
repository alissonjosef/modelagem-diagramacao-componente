package componente;

import comportamentos.AparelhoTelefonico;
import comportamentos.NavegadorInternet;
import comportamentos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciada...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina web...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }
}
