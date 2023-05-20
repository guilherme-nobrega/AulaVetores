import java.util.Scanner;

public class DigitoCPF {
    public static void main(String[] args) {
        int cpf,length,soma = 0,dig1, dig2, multp = 2;
        int[] digitos = new int[11];
        String cpforig;
        Scanner reader = new Scanner(System.in);
        System.out.println("Cálculo de dígito verificador de CPF");
        System.out.println("Digite o CPF: ");
        cpf = reader.nextInt();
        cpforig = String.valueOf(String.format("%09d", cpf));
        length = cpforig.length();
        while (length != 9){
            System.out.println("O CPF PRECISA TER NOVE DÍGITOS!");
            System.out.println("\nDigite o CPF: ");
            cpf = reader.nextInt();
            length = String.valueOf(cpf).length();
        }
        for (int i = 8; i >= 0; i--){
            digitos[i] = cpf%10;
            soma += (digitos[i]*multp);
            cpf = cpf/10;
            multp++;
        }
        dig1 = soma % 11;
        dig1 = 11 - dig1;
        digitos[9] = dig1 >= 10 ? 0 : dig1;
        multp = 2;
        soma = 0;
        for (int i = 9; i >= 0;i--){
            soma += (digitos[i]*multp);
            multp++;
        }
        dig2 = soma % 11;
        dig2 = 11 - dig2;
        digitos[10] = dig2 >= 10 ? 0 : dig2;
        System.out.println("Os dígitos verificadores são : "+digitos[9]+digitos[10]);
        System.out.println("CPF completo: "+cpforig+"-"+digitos[9]+digitos[10]);
    }
}
