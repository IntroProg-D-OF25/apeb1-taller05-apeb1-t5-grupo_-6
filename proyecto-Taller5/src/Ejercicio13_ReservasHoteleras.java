import java.util.Scanner;
/***
 * Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja 
 * se hace un descuento del 10% si el cliente se hospeda más de 5 días, 
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. 
 * Elaborar un solución que pida como datos de entrada el número de días y 
 * el precio diario de la habitación y luego calcule e imprima el subtotal
 * por pagar, el descuento y el total por pagar.
 * @author evelynlizzethe
 */
public class Ejercicio13_ReservasHoteleras {
    public static void main(String[] args) {
        int numDias, descuento, precioDiario, precioFinal;
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de dias que se va a hospedar: ");
        numDias = tcl.nextInt();
        System.out.print("Precio diario de la habitacion: ");
        precioDiario = tcl.nextInt();
        
        if (numDias > 5 ){
            descuento = ((precioDiario * 10) / 100);
            precioFinal = (precioDiario - descuento);
            System.out.println("El valor de la habitacion es: " + precioFinal);
        }else if (numDias > 10 ){
            descuento = ((precioDiario * 15) / 100);
            precioFinal = (precioDiario - descuento);
            System.out.println("El valor de la habitacion es: " + precioFinal);
        }else if (numDias > 15 ){
            descuento = ((precioDiario * 20) / 100);
            precioFinal = (precioDiario - descuento);
            System.out.println("El valor de la habitacion es: " + precioFinal);
        }  
    }
}

/***
 * Ingrese el numero de dias que se va a hospedar: 12
 * Precio diario de la habitacion: 23
 * El valor de la habitacion es: 21
 */
