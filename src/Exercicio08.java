import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		// Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a m�dia. Fa�a um programa onde o professor informe a m�dia e as notas de cada um dos 50 alunos e, ao final,seja exibido quantos alunos tiveram nota superior � m�dia e quantos tiveram nota inferior � m�dia.
		Scanner leitor = new Scanner(System.in);
		int contador = 0;
		Double nota = (double) 0;
		int aluno = 0;
		Double media;
		int contadorAcimaMedia = 0;
		int contadorAbaixoMedia = 0;
		System.out.println("Informe a m�dia");
		media = leitor.nextDouble();
		
		while(contador < 10) {
			System.out.println("Informe a nota do " + (contador + 1) + "� aluno");
			nota = leitor.nextDouble();
			contador = contador + 1;
			if(nota > media) {
				contadorAcimaMedia = contadorAcimaMedia + 1;
				}
		}
		
		contadorAbaixoMedia = 10 - contadorAcimaMedia;
		
		System.out.println(contadorAcimaMedia + "alunos ficaram acima da m�dia");
		System.out.println(contadorAbaixoMedia + "alunos ficaram abaixo da m�dia");
		
		leitor.close();	
		}
				
	}


