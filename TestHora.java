import java.util.Scanner;
public class TestHora
{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        Hora hora1, hora2;
        int horas,minutos,segundos;
        Hora nuevaHora1, nuevaHora2;
        
        System.out.println("Hora 1");
        System.out.print("Introduzca las horas: ");
        horas=teclado.nextInt();
        System.out.print("Introduzca los minutos: ");
        minutos=teclado.nextInt();
        System.out.print("Introduzca los segundos: ");
        segundos=teclado.nextInt();
        
        hora1=new Hora(horas,minutos,segundos);
        
        System.out.println("La hora 1 es: "+ hora1.toString());
        
        System.out.println("Hora 2");
        System.out.print("Introduzca las horas: ");
        horas=teclado.nextInt();
        System.out.print("Introduzca los minutos: ");
        minutos=teclado.nextInt();
        System.out.print("Introduzca los segundos: ");
        segundos=teclado.nextInt();
        
        hora2=new Hora(horas,minutos,segundos);
        
        System.out.println("La hora 2 es: "+ hora2.toString());
        
        System.out.println("El número de segundos de hora 1 es: " + hora1.convertirASegundos());
        System.out.println("El número de segundos de hora 2 es: " + hora2.convertirASegundos());
        
        System.out.println("La diferencia en segundos entre hora 1 y hora 2 es: " + hora1.compareTo(hora2));
        
        System.out.println("Introduzca el número de segundos a sumar: ");
        segundos=teclado.nextInt();
        
        
        nuevaHora1=hora1.sumarSegundos(segundos);
        nuevaHora2=hora2.sumarSegundos(segundos);
        
        System.out.print("La suma de los segundos  es: " + nuevaHora1 + " y " + nuevaHora2);
        
        
    }
}
