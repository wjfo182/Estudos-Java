import java.util.Arrays;
import java.util.Random;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dezenas = new int[6];
        Random sorteados = new Random();

        for  (int i = 0; i < dezenas.length; i++) {
            int numeroSorteado = sorteados.nextInt(1,61);
            boolean repetido =  false;

            for(int j = 0; j < dezenas.length; j++) {
                if(numeroSorteado == dezenas[j]) {
                    repetido = true;
                    break;
                }
            }
            if(!repetido) {
                dezenas[i] = numeroSorteado;
            }
            else {
                i--;
            }

        }

        int[] aposta =  new int[6];
        System.out.println("Faça sua aposta:");
        for (int k = 0; k < aposta.length; k++) {
            aposta[k] = sc.nextInt();
        }
        Arrays.sort(dezenas);
        Arrays.sort(aposta);

        System.out.println( "Aposta: " + Arrays.toString(aposta));
        System.out.println("Dezenas: " + Arrays.toString(dezenas));

        int totalAcertos = 0;

        for(int i = 0; i < dezenas.length; i++) {
            for(int j = 0; j < aposta.length; j++) {
                if(dezenas[i] == aposta[j]) {
                    totalAcertos++;
                }
            }
        }

        switch (totalAcertos){
            case 0:
                System.out.println("Não foi dessa vez");
                break;
            case 1:
                System.out.println("Não foi dessa vez");
                break;
            case 2:
                System.out.println("Não foi dessa vez");
                break;
            case 3:
                System.out.println("Não foi dessa vez");
                break;
            case 4:
                System.out.println("Muito bom! Foi uma Quadra!");
                break;
            case 5:
                System.out.println("Excelente! Você acertou a Quina!");
                break;
            case 6:
                System.out.println("PARABÉNS!! VOCÊ GANHOU O PRÊMIO MÁXIMO!");
                break;
                default:

        }
        System.out.println("Acertos: " + totalAcertos);


    }
}