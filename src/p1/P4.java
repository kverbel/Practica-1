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
public class P4 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double seg, par1,par2,nota;
        System.out.println("Ingrese la nota del seguimiento: ");
        seg=lector.nextInt();
        System.out.println("Ingrese a nota del parcial I: ");
        par1=lector.nextFloat();
        System.out.println("Ingrese a nota del parcial II: ");
        par2=lector.nextFloat();
        nota=(seg*0.5)+(par1*0.25)+(par2*0.25);
        System.out.println("La nota definitiva es: "+nota);
    }
}
