import java.util.Scanner;
public class TestFecha
{
   public static void main(String[] args){
       Scanner teclado=new Scanner(System.in);
       Fecha fecha1, fecha2;
       int anyo,mes,dia;
       
       System.out.println("Fecha 1");
       System.out.print("Introduzca el día: ");
       dia=teclado.nextInt();
       System.out.print("Introduzca el mes: ");
       mes=teclado.nextInt();
       System.out.print("Introduzca el año: ");
       anyo=teclado.nextInt();
       
       fecha1=new Fecha(anyo,mes,dia);
       
       System.out.print("La fecha 1 es: "+ fecha1.toString());
       
       System.out.println("Fecha 2");
       System.out.print("Introduzca el día: ");
       dia=teclado.nextInt();
       System.out.print("Introduzca el mes: ");
       mes=teclado.nextInt();
       System.out.print("Introduzca el año: ");
       anyo=teclado.nextInt();
       
       fecha2=new Fecha(anyo,mes,dia);
       
       System.out.printf("La fecha 2 es: "+ fecha2.toString());
       
    
   }
   
}
