import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		// Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a média. Faça um programa onde o professor informe a média e as notas de cada um dos 50 alunos e, ao final,seja exibido quantos alunos tiveram nota superior à média e quantos tiveram nota inferior à média.
		Scanner leitor = new Scanner(System.in);
		int contador = 0;
		Double nota = (double) 0;
		
		while(contador < 50) {
			System.out.println("Informe a nota do " + (contador + 1) + "º aluno");
			nota = leitor.nextDouble();
			contador = contador + 1;
		}
		
		if(nota > 7) {
			
		}
		
		
		
		
		
		
	}

}
