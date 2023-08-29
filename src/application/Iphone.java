package application;
import entities.Internet;
import entities.Ipod;
import entities.Phone;

public class Iphone implements Ipod, Phone, Internet{

    @Override
    public void exibirPagina() {
        System.out.println("exibindo a pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("+ uma aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");

    }

    @Override
    public void ligar() {
        System.out.println("Ligando para alguem");

    }

    @Override
    public void atender() {
        System.out.println("... atendendo");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");

    }

    @Override
    public void tocar() {
        System.out.println("tocando uma musica");

    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO UMA MUSICA");

    }

}
