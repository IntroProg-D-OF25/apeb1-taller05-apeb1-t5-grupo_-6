/***
 * Categoría de Edad: Clasificar a una persona en una categoría de edad 
 * (niño, adolescente, adulto) en función de su edad.Valeria Chuncho 
 */
import java.util.Scanner;
public class Ejercico06_Categoriaedad{
    public static void main(String[] args) {
     int edad ;
        Scanner tcl = new Scanner(System.in);
        System.out.print("\nIngresa su edad ");
        edad = tcl.nextInt();
        if(edad>= 5 && edad <12){
            System.out.println(" es niño ");
        
        }else if(edad >=12 && edad < 18){
            System.out.println(" es adolescente ");
            
        }else if(edad >= 18 && edad < 65){
            System.out.println("es adulto ");
        }else {
            System.out.println("no  esta entre los valores ");
        }
    
    }
}
/***
 * Ingresa su edad 15
 * es adolescente 
 */