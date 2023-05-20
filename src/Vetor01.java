import java.util.Scanner;

public class Vetor01 {
    public static final int qtdArray = 10;
    public static void main(String[] args) {
        int[] numeros = new int[qtdArray];
        int posneg1 = -1, posneg2 = -1, total = 0, max = 0;
        double media;
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < qtdArray; i++){
            System.out.println("Digite o "+(i+1)+"º número do vetor: ");
            numeros[i] = reader.nextInt();
            max = i == 0 ? numeros[i] : Math.max(numeros[i], max);
            posneg2 = numeros[i] < 0 ? i : posneg2;
            posneg1 = (posneg1 == -1 && numeros[i] < 0) ? i : posneg1;
            total += numeros[i];
        }
        media = (double) total / qtdArray;

        System.out.println("\nMaior valor: "+max);
        System.out.println("Soma dos elementos: "+total);
        System.out.println("Média dos elementos: "+media);
        System.out.println("Índice do primeiro elemento negativo: "+
                (posneg1 < 0 ? "Não houve elementos negativos" : posneg1));
        System.out.println("Índice do último elemento negativo: "+
                (posneg2 < 0 ? "Não houve elementos negativos" : posneg2));
    }
}
