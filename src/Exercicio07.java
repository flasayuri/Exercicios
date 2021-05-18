import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		// No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. Para isso, devem acertar quantos feijões estão em um jarro (1238). Faça um prorama que solicite a digitação da quantidade de feijões até que um cliente acerte.
		Scanner leitor = new Scanner(System.in);
		int quantidade = 0;
		int tentativas = 0;
		
		while(quantidade != 1238) {
			System.out.println("Quantos feijões tem no pote?");
			quantidade = leitor.nextInt();
			tentativas = tentativas + 1;
		}
		System.out.println("Parabéns!Você acertou!");
		System.out.println("Você precisou de " + tentativas + " tentativas para acertar!");
		leitor.close();
	}

}
