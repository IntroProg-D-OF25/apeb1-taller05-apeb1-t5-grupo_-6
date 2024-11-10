import java.util.Scanner;
/***
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. 
 * Si es bisiesto, mostrar un mensaje especial.
 * @author evelynlizzethe
 */
public class Ejercicio05_YearBisiesto {
    public static void main(String[] args) {
        int year, diasyear;
        year = 0;
        diasyear = 0;
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Ingrese el año");
        year = tcl.nextInt();
        System.out.println("Cuantos dias tiene ese año");
        diasyear = tcl.nextInt();
        
        if (diasyear == 365)
            System.out.println("No es año Bisiesto");
        else
            if (diasyear > 365)
                System.out.println("Es año ");
    }
}
/***
 * Ingrese el a�o
 * 2024
 * Cuantos dias tiene ese a�o
 * 365
 * No es a�o Bisiesto
 */
