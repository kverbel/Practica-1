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
public class P3 {
    public static void main(String[] args) {
        Scanner lector= new Scanner (System.in);
        
        double a,b,c,d;
        System.out.print("Digite el valor del lado del triangulo equilatero: ");
        a=lector.nextInt();
        b=((Math.sqrt(3))*a)/2;
        c=(a*b)/2;
        d=a*3;        
        System.out.print("El perimetro del triangulo es: "+d+"\nLa altura del triangulo es: "+b+"\nEl area del triangulo es: "
                +c+"\n");
    }
}
