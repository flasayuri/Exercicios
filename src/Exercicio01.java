import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// Para um ano de nascimento fornecido pelo usu�rio, informe a idade que ele ter� no dia 31 de dezembro de 2021.
		Double AnoNascimento;
		Double IdadeAtual;
		System.out.println("Digite o ano que voc� nasceu!");
		
		AnoNascimento = leitor.nextDouble();
		
		IdadeAtual = 2021 - AnoNascimento;
		
		System.out.println("No dia 31 de dezembro de 2021 voc� ter� " + IdadeAtual);
		leitor.close();
	}

}
