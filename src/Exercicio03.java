import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. Sem usar uma terceira variável, troque os valores de A e B entre si.
		Scanner leitor = new Scanner(System.in);
		Double A;
		Double B;
		
		System.out.println("Por favor, digite um número inteiro A.");
		A = leitor.nextDouble();
		
		System.out.println("Por favor, digite um número inteiro B.");
		
		B = leitor.nextDouble();
		
	
		System.out.println("Seu novo valor de A será " + B);
		System.out.println("Seu novo valor de B será " + A);
		leitor.close();
	}

}