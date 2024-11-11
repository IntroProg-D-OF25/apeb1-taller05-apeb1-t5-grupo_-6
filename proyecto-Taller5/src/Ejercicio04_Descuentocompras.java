/**
 * Descuento en Compras: Calcular el precio final de un producto con un
 * descuento del 10% si el precio original es mayor de $100; 
 * de lo contrario, no hay descuento. Valeria Chuncho 
 */
import java.util.Scanner;
public class Ejercicio04_Descuentocompras {
    public static void main(String[] args) {
        double  precio_producto, descuento, total_pagar ;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto");
        precio_producto = tcl.nextDouble();
        descuento = (precio_producto*0.10);
            total_pagar  = (precio_producto-(descuento ));
        if(precio_producto>100){
            
            System.out.println("el precio a pagar " + total_pagar );
        }else {        
                System.out.println("no tienes descuento ");
        }                  
         
        
        
 
              
    }
}
/***
 * Ingresa el precio del producto
 *150
 *el precio a pagar 135.0
 */
