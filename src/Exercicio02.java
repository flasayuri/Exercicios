import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int minutos, segundos;
		double horas;
		
		System.out.println("Esse programa recebe a duração de um filme em minutos e exibe a conversão para horas e para segundos");
		System.out.println("Por favor, informe a duração do filme em minutos");
		
		minutos = leitor.nextInt();
		
		segundos = minutos * 60;
		
		horas = minutos / 60.0;
		
		System.out.println("A duração desse filme é de " + segundos + " segundos");

				System.out.println("A duração desse filme é de " + horas + " horas");
			
		
		leitor.close();

	}

}
