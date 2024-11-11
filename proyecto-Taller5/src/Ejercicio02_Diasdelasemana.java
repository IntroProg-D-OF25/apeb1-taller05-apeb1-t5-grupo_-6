/***
 * Día de la Semana: Mostrar el nombre del día de la semana en función del 
 * número ingresado (1 para lunes, 2 para martes, etc.).Valeria Chuncho 
 */


import java.util.Scanner;
public class Ejercicio02_Diasdelasemana {
      public static void main(String[] args) {
          int numero;
          Scanner tcl = new Scanner(System.in);
          System.out.print("Dame el numero del dia ");
          numero = tcl.nextInt();
          //Estructura de control selectiva multiple  segun  <==> switch
          switch(numero)
          {// inicio del "segun se"  <==> switch  
            case 1 :System.out.println("lunes");
                    break;
            case 2 :System.out.println("Martes");
                     break;
            case 3 :System.out.println("Miercoles");
                     break;
            case 4 :System.out.println("Jueves");
                     break;   
            case 5 :System.out.println("Viernes");
                     break;
            case 6 :System.out.println("Sabado");
                     break;  
            case 7 :System.out.println("Domingo");
                     break;         
            default: System.out.println("Error en el número ");         
                       
                      
            
          }//fin del segun se <==> switch 
          
    }
  
}
/***
 * Dame el numero del dia 3
 *Miercoles
 */