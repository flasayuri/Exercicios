import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom “DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e um cupom, informando o valor final a ser pago.
		Scanner leitor = new Scanner(System.in);
		Double ValorInicial, ValorDesconto;
		String Cupom;
		
		System.out.println("Por favor, digite o valor da compra.");
		ValorInicial = leitor.nextDouble();
		
		System.out.println("Por favor, digite o cupom.");
		Cupom = leitor.next();
		
		if(Cupom.equalsIgnoreCase("diadefesta"))
		{
		 ValorDesconto = ValorInicial * 0.97;	 
		}else{
			 ValorDesconto = ValorInicial;
		 }
		
		System.out.println("O valor final da compra será de R$" + ValorDesconto);
		 leitor.close();
		}
	
	}
