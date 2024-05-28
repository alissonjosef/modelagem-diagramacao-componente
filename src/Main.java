import componente.Iphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Iphone novoIpone = new Iphone();

        System.out.println("****...Chamada...****");
        novoIpone.ligar();
        novoIpone.atender();
        novoIpone.iniciarCorreioDeVoz();

        System.out.println("****...Navegação...****");
        novoIpone.exibirPagina();
        novoIpone.adicionarNovaAba();
        novoIpone.atualizarPagina();

        System.out.println("****...Reproduzindo Musica...****");
        novoIpone.selecionarMusica();
        novoIpone.tocar();
        novoIpone.pausar();
    }
}