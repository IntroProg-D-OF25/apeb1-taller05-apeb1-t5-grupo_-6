/** *
 * Mayor de tres números: Dados tres números, determinar
 * cuál es el mayor. Si son iguales, mostrar un mensaje
 * autor: evelynlizzethe
 */
import java.util.Scanner;
public class Ejercicio03_MayorTresNumeros {
    public static void main(String[] args) {
        int num1, num2, num3, mayor;
        num1 = 0;
        num2 = 0;
        num3 = 0;
        mayor = 0;
        
        Scanner tcl = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num1 = tcl.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = tcl.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = tcl.nextInt();

        if (num1 == num2 && num2 == num3) 
            System.out.println("Los numeros son iguales");
        else 
            mayor = num1;
            if (num2 > num3)
                mayor = num2;
            if (num3 > mayor)
                mayor= num3;
            System.out.println("El numero mayor es: " + mayor);    
        }
}

/***
 * Ingrese el primer numero
 * 8
 * Ingrese el segundo numero
 * 8
 * Ingrese el tercer numero
 * 8
 * Los numeros son iguales
 * El numero mayor es: 8
 */

