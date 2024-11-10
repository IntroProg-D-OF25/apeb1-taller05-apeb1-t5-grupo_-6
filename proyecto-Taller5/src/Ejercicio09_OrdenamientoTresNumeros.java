
import java.util.Scanner;

/**
 * *
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden
 * ascendente.
 *
 * @author evelynlizzethe
 */
public class Ejercicio09_OrdenamientoTresNumeros {

    public static void main(String[] args) {
        int num1, num2, num3, menor, mayor, intermedio;
        menor = 0;
        intermedio = 0;
        mayor = 0;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = tcl.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                intermedio = num2;
                mayor = num3;
            } else {
                intermedio = num3;
                mayor = num2;
            }
        } else if (num2 <= num3 && num2 <= num1){
            menor = num2;
            if (num1 <= num2){
                intermedio = num1;
                mayor = num3;
            } else {
                intermedio = num3;
                mayor = num1;
            }
        } else if (num3 <= num2 && num3 <= num2){
            menor = num3;
            if (num3 <= num1){
                intermedio = num2;
                mayor = num1;
            } else {
                intermedio = num1;
                mayor = num2; 
            }
        }
        System.out.println("Numeros en ascendente: " + menor + ", " 
                + intermedio + ", " + mayor);
    }

}

/***
 * Ingrese el primer numero: 12
 * Ingrese el segundo numero: 40
 * Ingrese el tercer numero: 20
 * Numeros en ascendente: 12, 20, 40
 */