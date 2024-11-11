/***
 * Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona 
 * y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso,
 * etc.). Valeria Chuncho 
 */
import java.util.Scanner;
public class Ejercicio08_CalculadoraImc {
    public static void main(String[] args) {
        float pesokg, masa_corporal, estatura;
        Scanner tcl = new Scanner(System.in);
        System.out.print("\nIngrese su peso en kg");
        pesokg = tcl.nextFloat();
        System.out.print("\nIngrese su estatura en m");
        estatura = tcl.nextFloat();
        masa_corporal = (pesokg/estatura);
        if(pesokg >=36 && pesokg< 47 ){
            System.out.println(" Estas bajo peso "+ masa_corporal);
        }else if (pesokg>= 47 && pesokg< 61){
            System.out.println("tu peso esta normal " + masa_corporal );
            
        }else if (pesokg >=61 && pesokg<74 ){
            System.out.println("Estas en sobrepeso "+ masa_corporal);
        }else{
            System.out.println("Error al ingresar el peso ");
        }
        
        
    }
    /***
     * Ingrese su peso en kg62
     *  Ingrese su estatura en m1,60
     * Estas en sobrepeso 38.75
     */
    
}
