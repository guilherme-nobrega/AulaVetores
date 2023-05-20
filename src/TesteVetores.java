import java.util.Scanner;

public class TesteVetores {

	public static void main(String[] args) {
		// vetor é de tipo fixo e de tamanho fixo
		double aluno, total=0;
		String[] nomesAlunos = {"Ana","Beatriz","João",
				"Bianca","André","Guilherme","José",
				"Pedro","Bruna","Ricardo"};
		double[] alunos = new double[nomesAlunos.length];
		Scanner leitor = new Scanner(System.in);

		for (int i = 1;i <= nomesAlunos.length;i++){
			System.out.println("Por favor, digite o consumo " +
					"do(a) aluno(a) "+nomesAlunos[i-1]+": ");
			alunos[i-1] = leitor.nextDouble();;
			total = total + alunos[i-1];
		}

		for (int i = 1;i <= nomesAlunos.length;i++){
			System.out.println("O aluno(a) "+nomesAlunos[i-1]+" " +
					"consumiu R$" + alunos[i-1]);
		}

		System.out.println("\nO total de consumo foi de R$" + total);
		
		leitor.close();
	}

}
