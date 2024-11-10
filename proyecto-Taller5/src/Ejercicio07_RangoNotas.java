import java.util.Scanner;
/***
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en 
 * función de su rango (A para 90-100, B para 80-89, etc.).
 * @author evelynlizzethe
 */

public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        int calificacion;
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese su calificacion: ");
        calificacion = tcl.nextInt();
        
        if (calificacion >= 90 && calificacion <= 100)
            System.out.println("Rango A"); 
        else if (calificacion >= 80 && calificacion <= 89)
            System.out.println("Rango B");
        else if (calificacion >= 70 && calificacion <= 79)
            System.out.println("Rango C");
        else if (calificacion >= 60 && calificacion <= 69)
            System.out.println("Rango D");   
    }
}

/***
 * Ingrese su calificacion: 75
 * Rango C
 */

/***
 * Ingrese su calificacion: 98
 * Rango A
 */