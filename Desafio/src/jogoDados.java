import java.util.Random;
import java.util.Scanner;

public class jogoDados {
    public static void main(String[] args) {

        System.out.println(jogo());


        }public static int jogo(){ Scanner ler = new Scanner(System.in);
        int acertos = 0;
        int erros = 0;

        System.out.print("Digite um numeros: ");
        int numeroDoUsuario = ler.nextInt();


        System.out.println("==============");
        System.out.println("Girar o dado");
        System.out.println("==============");

        Random gerador = new Random();
        int[] numeroGerado = new int[3];

        int numeroAleatorio = gerador.nextInt(30);
        numeroGerado[0] = numeroAleatorio;
        System.out.println("O numero gerado é: " + numeroAleatorio);

        if (numeroAleatorio == numeroDoUsuario) {
            acertos++;
        } else {
            erros++;
        }

        int diferença = (numeroAleatorio - numeroDoUsuario);

        if (diferença == 0) {
            System.out.println("Você ganhou 10 pontos");
        } else if (diferença == 1 || diferença == -1) {
            System.out.println("Você ganhou 5 pontos");
        } else {
            System.out.println("Voce perdeu pontos");
        }
        System.out.println("Acertos: "+acertos);
        System.out.println("Erros: "+ erros);


        System.out.println("========================");
        System.out.println("Deseja jogar novamente?");
        System.out.println("========================");
        String opção = ler.next();

        if (opção == "sim") {
            return jogo();
        } else if (opção == "não") {
            System.exit(0);
        }
        return jogo();

    }

    }






