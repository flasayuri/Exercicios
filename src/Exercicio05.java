import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. Entre os pesos de 3 lixos informados pelo usu�rio, um programa deve indicar qual deles deve ser carregado pelo drone.
		Scanner leitor = new Scanner(System.in);
		Double Peso1, Peso2, Peso3;
		
		System.out.println("Informe o valor do peso do primeiro lixo!");
		Peso1 = leitor.nextDouble();
		
		System.out.println("Informe o valor do peso do segundo lixo!");
		Peso2 = leitor.nextDouble();
		
		System.out.println("Informe o valor do peso do terceiro lixo!");
		Peso3 = leitor.nextDouble();
		
		if(Peso1 < Peso2 && Peso1<Peso3) {
			System.out.println("O drone ir� carregar o primeiro lixo!");
		}else {
			if (Peso2 < Peso1 && Peso2 < Peso3) {
				System.out.println("O drone ir� carregar o segundo lixo!");
			}if (Peso3 < Peso1 && Peso3 < Peso2)
					 System.out.println("O drone ir� carregar o terceiro lixo!");
				}
		leitor.close();
			}

	}


