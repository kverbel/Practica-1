package p2;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author multi11
 */
public class P2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        double a,b,c;
        System.out.print("Digite el valor del lado a:");
        a=lector.nextInt();
        System.out.print("Digite el valor del lado b:");
        b=lector.nextInt();
        c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        System.out.println("El valor de la hipotenusa es: "+c);
    }
}
