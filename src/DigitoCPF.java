import java.util.Scanner;

public class DigitoCPF {
    public static void main(String[] args) {
        int cpf, length,soma = 0,dig1, dig2;
        int[] digitos = new int[11];
        Scanner reader = new Scanner(System.in);
        System.out.println("Cálculo de dígito verificador de CPF");
        System.out.println("Digite o CPF: ");
        cpf = reader.nextInt();
        length = String.valueOf(cpf).length();
        while (length != 9){
            System.out.println("O CPF PRECISA TER NOVE DÍGITOS!");
            System.out.println("\nDigite o CPF: ");
            cpf = reader.nextInt();
            length = String.valueOf(cpf).length();
        }
        for (int i = 8; i > 0; i--){
            digitos[i] = cpf%10;
            soma += digitos[i];
            cpf = cpf/10;
        }
        dig1 = soma % 9;
        dig1 = 11 - dig1;
        digitos[9] = dig1;

    }
}
