package fabrica;

import aparelhos.aparelhomusical.ReprodutorMusical;
import aparelhos.loja.IPhone;
import aparelhos.net.NavegadorInternet;
import aparelhos.telefonia.AparelhoTelefonico;

public class apple {

    public static void main(String[] args) {

        IPhone smartIPhone = new IPhone();

        ReprodutorMusical tocar = smartIPhone;
        ReprodutorMusical pausar = smartIPhone;
        ReprodutorMusical selecionar = smartIPhone;

        NavegadorInternet navegar = smartIPhone;
        NavegadorInternet adicionar = smartIPhone;
        NavegadorInternet atualizar = smartIPhone;

        AparelhoTelefonico ligar = smartIPhone;
        AparelhoTelefonico atender = smartIPhone;
        AparelhoTelefonico msn = smartIPhone;

        tocar.tocar();
        pausar.pausar();
        selecionar.selecionarMusica(null);

        navegar.exibirPagina(null);
        adicionar.adicionarNovaAba();
        atualizar.atualizarPagina();

        ligar.ligar(null);
        atender.atender();
        msn.iniciarCorreioVoz();
    }

}
