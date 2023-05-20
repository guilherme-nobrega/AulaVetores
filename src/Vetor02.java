import java.util.Scanner;

public class Vetor02 {
    public static final int qtdArray = 6;
    public static void main(String[] args) {
        int[] pares = new int[qtdArray];
        int[] impares = new int[qtdArray];
        int[] todos = new int[qtdArray*2];

        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < todos.length; i++){
            if (i <= 5){
                System.out.println("Digite o "+(i+1)+"º número do vetor de pares: ");
                pares[i] = reader.nextInt();
                while (pares[i] %2 != 0){
                    System.out.println("APENAS NÚMEROS PARES !");
                    System.out.println("Digite o "+(i+1)+"º número do vetor de pares: ");
                    pares[i] = reader.nextInt();
                }
                todos[i] = pares[i];
            }else {
                System.out.println("Digite o "+(i-5)+"º número do vetor de ímpares: ");
                impares[i-6] = reader.nextInt();
                while (impares[i-6] %2 == 0){
                    System.out.println("APENAS NÚMEROS ÍMPARES !");
                    System.out.println("Digite o "+(i-5)+"º número do vetor de ímpares: ");
                    impares[i-6] = reader.nextInt();
                }
                todos[i] = impares[i-6];
            }
        }
        System.out.println("\n ");
        for (int i = 0; i < todos.length;i++){
            System.out.println("Vetor C ["+i+"]: "+todos[i]);
        }
    }
}
