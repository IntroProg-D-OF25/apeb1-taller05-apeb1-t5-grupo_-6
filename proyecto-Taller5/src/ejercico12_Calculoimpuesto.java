/***
 * Calculo de impuestos: Desarrollar una solución que permita leer los datos de
 * un automóvil (marca, origen y costo) imprima el impuesto por pagar y el 
 * precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto
 * es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es 
 * de USA, 8% Valeria Chuncho 
 */
import java.util.Scanner;
public class ejercico12_Calculoimpuesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costo,impuesto=0,precio_venta;
        
        System.out.print("\nIngrese la marca del automóvil:");
        String marca =tcl.nextLine();

        System.out.print("\nIngrese el origen del automóvil (Alemania, Japón, Italia, USA): ");
        String origen = tcl.nextLine();
        
        System.out.print("\nIngrese el costo del automóvil:    ");
        costo = tcl.nextDouble();
    
        // Calcular el impuesto según el origen
        switch (origen) {
            case "Alemania":
                impuesto = costo * 0.20; 
                break;
            case "Japon":
                impuesto = costo * 0.30; 
                break;
            case "Italia":
                impuesto = costo * 0.15; 
                break;
            case "Usa":
                impuesto = costo * 0.08; 
                break;
            default:
                System.out.println(" El origen no es valido. No se puede aplicará impuesto.");
                break;
        }
         precio_venta = costo + impuesto;
        
        
        System.out.printf("Impuesto que tiene q pagar pagar: " + impuesto);
        System.out.printf("Precio de venta (incluido el impuesto):" + precio_venta);
        
       
    }
    /***
     * Ingrese la marca del autom�vil:Artelux

     *Ingrese el origen del autom�vil (Alemania, Jap�n, Italia, USA): Alemania

     *Ingrese el costo del autom�vil: 35000  
 
     * Impuesto que tiene q pagar pagar: 7000.0
     * Precio de venta (incluido el impuesto):42000.0
     */
}