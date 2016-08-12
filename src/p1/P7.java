/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class P7 {

    private int year,sex,car;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }
    
    public static double redondear(double num) {
       double parteEntera, resultado;
       resultado = num;
       parteEntera = Math.floor(resultado);
       resultado=(resultado-parteEntera)*100;
       resultado=Math.round(resultado);
       resultado=(resultado/100)+parteEntera;
       return resultado;
    }

    

    public static void main(String[] args) {
        
        ArrayList<P7> conductores = new ArrayList<P7>();
        Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        double porcentaje,aux,aux2=0;
        int aux3,aux4;
        boolean val=false;
        Scanner lector=new Scanner(System.in);
        do{
        System.out.println("...  Actualmente hay "+conductores.size()+" conductores guardados  ..."
                           +"\n1. Agregar un nuevo conductor."
                           +"\n2. Conocer el porcentaje de conductores menores de 25."
                           +"\n3. Conocer el porcentaje de conductores de sexo femenino."
                           +"\n4. Conocer el porcentaje de carros matriculados fuera de Medellin."
                           +"\n5. Salir."
                           +"\n\nSeleccione la opcion deseada: ");
        
        aux=lector.nextInt();  
        if (aux==1){
           P7 persona=new P7();
           System.out.println("\n\n\nIngrese el año de nacimiento.");
           persona.setYear(lector.nextInt());
           do{
               System.out.println("\nIngrese el sexo. (1.Maculino. 2.Femenino.");
               aux3=lector.nextInt();
               if (aux3>2 || aux3<1){
                   System.out.println("\nIngrese un valor valido.");
               }
               else{
                   persona.setSex(aux3);
                   val=true;
               }
           }while(val!=true);
           val=false;
           do{
               System.out.println("\nIngrese la ciudad donde esta matriculado el carro. 1.Medellin 2.Otra.");
               aux3=lector.nextInt();
               if (aux3>2 || aux3<1){
                   System.out.println("\nIngrese un valor valido.");
               }
               else{
                   persona.setCar(aux3);
                   val=true;
               }
           }while(val!=true);
           val=false;
           conductores.add(persona);
           aux=0;
        }
        else if(aux==2){
           for (int i = 0;i<conductores.size();i++){
               aux4=año-conductores.get(i).getYear();
               if (aux4<25){
                   aux2=aux2+1;   
               }
           }
           porcentaje=(aux2/conductores.size())*100;
           aux2=0;
           System.out.println("\n\n\nEl porcentaje de conductores menores de 25 años es: "+redondear(porcentaje)+"%\n");
        }
        else if(aux==3){
            for (int i = 0;i<conductores.size();i++){
                if (conductores.get(i).getSex()==2){
                   System.out.println("1. "+conductores.get(i).getSex());
                   aux2=aux2+1;   
                }
            }
            porcentaje=(aux2/conductores.size())*100;
            aux2=0;
            System.out.println("\n\n\nEl porcentaje de conductores de sexo femenino es: "+redondear(porcentaje)+"%\n");
        }
        else if(aux==4){
            for (int i = 0;i<conductores.size();i++){
                if (conductores.get(i).getCar()==2){
                    aux2++;   
                }
            }
           porcentaje=(aux2/conductores.size())*100;
           aux2=0;
           System.out.println("\n\n\nEl porcentaje de carros matriculados fuera de Medellin es: "+redondear(porcentaje)+"%\n");
        }

        }while(aux!=5);
        

        
           
           
}
}
           

