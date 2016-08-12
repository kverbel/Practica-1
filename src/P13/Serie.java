/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13;

/**
 *
 * @author multi14
 */
public class Serie {
    public static void Fibonacci(int n) {
        int a=0,b=1,c=1;
        System.out.println("Termino 1: 0");
        for (int i=1;i<n;i++){
            System.out.println("Termino "+(i+1)+": "+c);
            c=a+b;
            a=b;
            b=c;
            
        }
    
    }
}
