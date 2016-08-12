/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import java.util.Scanner;

/**
 *
 * @author multi11
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner lector = new Scanner (System.in);
      
      double lado, area, volumen;
      System.out.print("Digite el valor del lado:");
      
      lado=lector.nextInt();
      
      area=lado*lado;
      volumen=Math.pow(lado, 3);
      System.out.println("El valor del area es: "+area+"El volumen es:"+volumen);
    }
    
}
