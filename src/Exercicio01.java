import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// Para um ano de nascimento fornecido pelo usuário, informe a idade que ele terá no dia 31 de dezembro de 2021.
		Double AnoNascimento;
		Double IdadeAtual;
		System.out.println("Digite o ano que você nasceu!");
		
		AnoNascimento = leitor.nextDouble();
		
		IdadeAtual = 2021 - AnoNascimento;
		
		System.out.println("No dia 31 de dezembro de 2021 você terá " + IdadeAtual);
		leitor.close();
	}

}
