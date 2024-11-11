/***
 * Facturación eléctrica: Desarrollar una solución que permita calcular 
 * y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor
 * de costo por kilovatio/hora y el número de kilovatios consumidos en el mes
 * . Si el usuario tiene edad mayor a 65 años, se debe descontar el 
 * 10% por pertenecer a la tercera edad.Valeria Chuncho 
 */


import java.util.Scanner;
public class Ejercicio10_Facturaciónelectrica {
    public static void main(String[] args) {
        int edad;
        float costo_kilovatio,numero_kilovatios,valor_pagar,descuento ;
        Scanner tcl = new Scanner(System.in);
        System.out.print("\nIngresa tu edad ");
        edad = tcl.nextInt();
        System.out.print("\nIngresa el costo de kilovatio/hora");
        costo_kilovatio = tcl.nextFloat();
        System.out.print("\nIngresa el numero kilovatios consumidos al mes ");
        numero_kilovatios = tcl.nextFloat();
        valor_pagar = (costo_kilovatio*numero_kilovatios);
        descuento = valor_pagar - (valor_pagar * 0.10f);
        if(edad> 65 ){
            System.out.println("el valor a pagar es : "+ descuento );
        } else {
            System.out.println(" el valor a pagar es :" + valor_pagar );
        }
        
                
    }
}
/***
 * Ingresa tu edad 18
 * 
 *Ingresa el costo de kilovatio/hora1,5

 *Ingresa el numero kilovatios consumidos al mes 50
 *el valor a pagar es :75.0
 */
