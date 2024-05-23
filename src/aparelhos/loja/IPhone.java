package aparelhos.loja;

import aparelhos.aparelhomusical.ReprodutorMusical;
import aparelhos.net.NavegadorInternet;
import aparelhos.telefonia.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    public void tocar() {

        System.out.println("Tocando musica via Iphone");

    }

    public void pausar() {

        System.out.println("Pausando a música via Iphone");

    }

    public void selecionarMusica(String musica) {

        System.out.println("Selecionando a música via Iphone");

    }

    public void exibirPagina(String url) {

        System.out.println("Exibindo página na web no Iphone");

    }

    public void adicionarNovaAba() {

        System.out.println("Adicionando nova aba no navegado do Iphone");

    }

    public void atualizarPagina() {

        System.out.println("Atualizando navegador do Iphone");

    }

    public void ligar(String numero) {

        System.out.println("Ligando via Iphone");

    }

    public void atender() {

        System.out.println("Atendendo o telefone Iphone");

    }

    public void iniciarCorreioVoz() {

        System.out.println("Deixando mensagem de vóz, via Iphone");

    }
}
