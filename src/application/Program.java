package application;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inicializando o seu iphone");
        Iphone iphone = new Iphone();

        menu();
        System.out.print("Escolha sua opção: -> ");
        char op = sc.next().charAt(0);

        while(op != '0') {

            switch(op) {
                case '1' :
                    iphone.tocar();
                    System.out.println();
                    break;

                case '2' :
                    iphone.pausar();
                    System.out.println();
                    break;

                case '3' :
                    iphone.selecionarMusica();
                    System.out.println();
                    break;

                case '4' :
                    iphone.ligar();
                    System.out.println();
                    break;

                case '5' :
                    iphone.atender();
                    System.out.println();
                    break;

                case '6' :
                    iphone.iniciarCorreioVoz();
                    System.out.println();
                    break;

                case '7' :
                    iphone.exibirPagina();
                    System.out.println();
                    break;

                case '8' :
                    iphone.adicionarNovaAba();
                    System.out.println();
                    break;

                case '9' :
                    iphone.atualizarPagina();
                    System.out.println();
                    break;

                default: System.out.println("Opcao invalida!");
            }

            menu();
            System.out.print("Escolha sua opção: -> ");
            op = sc.next().charAt(0);

        }

        sc.close();
    }

    public static void menu() {
        System.out.println();
        System.out.println("Digite 1 para tocar uma musica");
        System.out.println("Digite 2 para pausar uma musica");
        System.out.println("Digite 3 para selecionar uma musica");
        System.out.println("Digite 4 para ligar (para alguem)");
        System.out.println("Digite 5 para atender");
        System.out.println("Digite 6 para iniciar correio voz");
        System.out.println("Digite 7 para exibir pagina");
        System.out.println("Digite 8 para + uma nova Aba");
        System.out.println("Digite 9 para atualizar a pagina");
        System.out.println("Digite 0 para SAIR");
        System.out.println();
    }

}
