import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		// No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. Para isso, devem acertar quantos feij�es est�o em um jarro (1238). Fa�a um prorama que solicite a digita��o da quantidade de feij�es at� que um cliente acerte.
		Scanner leitor = new Scanner(System.in);
		int quantidade = 0;
		int tentativas = 0;
		
		while(quantidade != 1238) {
			System.out.println("Quantos feij�es tem no pote?");
			quantidade = leitor.nextInt();
			tentativas = tentativas + 1;
		}
		System.out.println("Parab�ns!Voc� acertou!");
		System.out.println("Voc� precisou de " + tentativas + " tentativas para acertar!");
		leitor.close();
	}

}
