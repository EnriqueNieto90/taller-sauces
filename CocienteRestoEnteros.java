import java.util.Scanner;

public class CocienteRestoEnteros {
	
	public static void main (String[] args){
		
		int dividendo, divisor;
		int cociente, resto;
		
		Scanner teclado= new Scanner(System.in);
		
		Syste.out.println("Introduzca dividendo: ");
		dividendo= teclado.nextInt();
		
		
		System.out.println("Introduzca divisor: ");
		divisor= teclado.nextInt();
		
		cociente= (dividendo/divisor);
		resto= dividendo%divisor;
		
		System.out.println("Cociente: " + cociente);
		System.out.println("Resto: " + resto);
	}
}
