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
public class P5 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double seg, prac,exp,proI,proF,nota;
        System.out.println("Ingrese la nota del seguimiento: ");
        seg=lector.nextFloat();
        System.out.println("Ingrese la nota de las practicas: ");
        prac=lector.nextFloat();
        System.out.println("Ingrese la nota de las exposiciones: ");
        exp=lector.nextFloat();
        System.out.println("Ingrese la nota del proyecto I: ");
        proI=lector.nextFloat();
        System.out.println("Ingrese la nota del proyecto final: ");
        proF=lector.nextFloat();
        
        nota=(seg*0.20)+(prac*0.3)+(exp*0.1)+(proI*0.15)+(proF*0.25);
        if (nota<=1){
            System.out.println("Su nota es: "+nota+". Estas en el lugar equivocado");
        } 
        else if (nota>1 && nota<=2){
            System.out.println("Su nota es: "+nota+". Remal");
        }
        else if (nota>2 && nota<=3){
            System.out.println("Su nota es: "+nota+". Es posible recuperarse");
        }        
        else if (nota>3 && nota<=4){
            System.out.println("Su nota es: "+nota+". Normalito");
        }
        else if (nota>4 && nota<=4.5){
            System.out.println("Su nota es: "+nota+". Muy Bien");
        }
        else{
            System.out.println("Su nota es: "+nota+". Excelente estudiante");
        }
    }
}
