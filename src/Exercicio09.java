import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
// Para uma sequ�ncia matem�tica onde cada elemento � calculado da seguinte forma:1!/N! ; 2!/(N-1)!; 3!/(N-2)!; ... ; (N! / 1!).Crie um programa onde o usu�rio digite a quantidade de elementos que deseja exibir e sejam exibidos os elementos da sequ�ncia.
		Scanner leitor = new Scanner(System.in);
		int n = 1; 
		int f = n;
		
		System.out.println("Por favor, digite um valor para N:");
		n = leitor.nextInt();
		
		while(n < n) {
			f = f *(n-1);
			
			System.out.println(f);
		}
		
	}

}
