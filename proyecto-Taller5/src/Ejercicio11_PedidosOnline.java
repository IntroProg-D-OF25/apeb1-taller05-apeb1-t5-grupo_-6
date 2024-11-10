import java.util.Scanner;
/***
 * Pedidos online: Desarrollar una solución que imprima el costo de un 
 * pedido de un artículo del cual se tiene la descripción, la cantidad 
 * que se requiere y el precio unitario. Si la cantidad pedida excede 
 * de 50 unidades, se hace un descuento de 15%.
 * @author evelynlizzethe
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        int cantidadProducto, precioUnitario, descuento, precioFinal,
                precioDescuento;
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Cantidad de producto pedido: ");
        cantidadProducto = tcl.nextInt();
        System.out.print("Precio unitario: ");
        precioUnitario = tcl.nextInt();
        
        precioFinal = (cantidadProducto * precioUnitario);
        
        if (cantidadProducto > 50)
        {
            descuento = ((precioFinal * 15) / 100);
            precioDescuento = (precioFinal - descuento);
            System.out.println("El precio Final es: " + precioDescuento); 
        }
        else 
            System.out.println("El precio Final es: " + precioFinal );
    }
}

/***
 * Cantidad de producto pedido: 36
 * Precio unitario: 23
 * El precio FInal es: 828
 */

/***
 * Cantidad de producto pedido: 52
 * Precio unitario: 23
 * El precio Final es: 1017
 */