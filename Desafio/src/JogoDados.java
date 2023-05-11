import java.util.Scanner;
import java.util.Random;

public class JogoDados {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int acertos=0;
        int erros=0;
        String opcao;
        int Total =0;
        do {
            int numeroDoUsuario =inicioJogo();
            int numeroAleatorio = numeroRadom();
            int pontuacao=0;

            String jogo = acertosErros(numeroAleatorio, numeroDoUsuario);
            if(jogo.equals("ACERTO")) {
                ++acertos; pontuacao += 10;
            } else if (jogo.equals("QUASE ACERTO")) {
                ++acertos; pontuacao += 5;
            } else {++erros;}

            Total += pontuacao;

            pontuacao=condicional(numeroAleatorio, numeroDoUsuario);
            System.out.println("O seu total de pontuação é: "+Total);
            fimJogo(acertos, erros);
            opcao = ler.next();

        } while (opcao.equals("sim"));

        System.out.println("==============");
        System.out.println("Fim do jogo");
        System.out.println("==============");
        System.out.println("Acertos total: " + acertos);
        System.out.println("Erros total: " + erros);
    }

    public static int inicioJogo(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numeros de 1 até 10: ");
        int numeroDoUsuario = ler.nextInt();
        return numeroDoUsuario;
    }

    public static void fimJogo(int acertos, int erros){
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);

        System.out.println("========================");
        System.out.println("Deseja jogar novamente?");
        System.out.println("========================");
    }

    public static int numeroRadom() {
        System.out.println("==============");
        System.out.println("Girar o dado");
        System.out.println("==============");

        Random gerador = new Random();
        int[] numeroGerado = new int[3];

        int numeroAleatorio = gerador.nextInt(3);
        numeroGerado[0] = numeroAleatorio;
        System.out.println("O numero gerado é: " + numeroAleatorio);
        return numeroAleatorio;

    }

    public static int condicional (int numeroAleatorio,int numeroDoUsuario){
        int diferenca = (numeroAleatorio - numeroDoUsuario);

        if (diferenca == 0) {
            System.out.println("Você ganhou 10 pontos");
            return 10;
        } else if (diferenca == 1 || diferenca == -1) {
            System.out.println("Você ganhou 5 pontos");
            return 5;
        } else {
            System.out.println("Voce perdeu pontos");
            return 0;
        }
    }

    public static String acertosErros (int numeroAleatorio,int numeroDoUsuario) {
        int diferenca = (numeroAleatorio - numeroDoUsuario);
        if (numeroAleatorio == numeroDoUsuario) {
            return "ACERTO";
        } else if ( diferenca == 1 || diferenca == -1 )
            return "QUASE ACERTO";
        else {return "ERRO";
        }
    }
}




