import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Double FilmeMinutos;
		Double Hora, Minutos, Segundos, Horas;
		
		System.out.println("Por favor, digite a duração do filme em minutos.");
		FilmeMinutos = leitor.nextDouble();
		
		Hora = FilmeMinutos / 60;
		
		Minutos = FilmeMinutos - (Math.round(Hora) * 60);
		Horas = (double) Math.round(Hora);
		Segundos = FilmeMinutos -((Math.round(Hora) * 60) + Minutos);
		
		System.out.println("O filme tem duração de " + Horas + " horas, " + Minutos + " minutos e " + Segundos + "segundos.");
		
		leitor.close();
	}

}
