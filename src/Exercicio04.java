import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Um rob� de combate s� deve ativar sua arma principal quando o inimigo est� a menos de 70cm de dist�ncia. Fa�a um programa onde o usu�rio informe a dist�ncia do inimigo e sejam exibidas as mensagens �ATIVADO� ou �DESATIVADO� dependendo do status da arma.
		Scanner leitor = new Scanner(System.in);
		Double Distancia;
		
		System.out.println("Por favor, digite a dist�ncia em cm!");
		Distancia = leitor.nextDouble();
		
		if(Distancia < 70) {
			System.out.println("ATIVADO");
		}else {
			System.out.println("DESATIVADO");
		}
		leitor.close();
	}
	
}

	