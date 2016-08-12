/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P6 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        int seleccion;
        
        System.out.println("Digite la etiqueta del producto:");
        seleccion=lector.nextInt();
        
        switch (seleccion) {
        case 1:  
            System.out.println("El valor del producto es $500");
            break;
        case 2:
            System.out.println("El valor del producto es $800");
            break;
        case 3:
            System.out.println("El valor del producto es $300");
            break;
        case 4:
            System.out.println("El valor del producto es $900");
            break;
        default:
            System.out.println("Digite una etiqueta valida");
            break;
        }
    }
}
