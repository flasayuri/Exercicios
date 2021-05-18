import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Um robô de combate só deve ativar sua arma principal quando o inimigo está a menos de 70cm de distância. Faça um programa onde o usuário informe a distância do inimigo e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO” dependendo do status da arma.
		Scanner leitor = new Scanner(System.in);
		Double Distancia;
		
		System.out.println("Por favor, digite a distância em cm!");
		Distancia = leitor.nextDouble();
		
		if(Distancia < 70) {
			System.out.println("ATIVADO");
		}else {
			System.out.println("DESATIVADO");
		}
		leitor.close();
	}
	
}

	