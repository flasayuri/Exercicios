import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Solicite ao usu�rio a digita��o de 2 n�meros inteiros, nas vari�veis A e B. Sem usar uma terceira vari�vel, troque os valores de A e B entre si.
		Scanner leitor = new Scanner(System.in);
		Double A;
		Double B;
		
		System.out.println("Por favor, digite um n�mero inteiro A.");
		A = leitor.nextDouble();
		
		System.out.println("Por favor, digite um n�mero inteiro B.");
		
		B = leitor.nextDouble();
		
	
		System.out.println("Seu novo valor de A ser� " + B);
		System.out.println("Seu novo valor de B ser� " + A);
		leitor.close();
	}

}