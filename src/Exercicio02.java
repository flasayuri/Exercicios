import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int minutos, segundos;
		double horas;
		
		System.out.println("Esse programa recebe a dura��o de um filme em minutos e exibe a convers�o para horas e para segundos");
		System.out.println("Por favor, informe a dura��o do filme em minutos");
		
		minutos = leitor.nextInt();
		
		segundos = minutos * 60;
		
		horas = minutos / 60.0;
		
		System.out.println("A dura��o desse filme � de " + segundos + " segundos");

				System.out.println("A dura��o desse filme � de " + horas + " horas");
			
		
		leitor.close();

	}

}
