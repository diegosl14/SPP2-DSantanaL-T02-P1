//Diego Santana Leiva A01410705 Ingeniería Industrial y de Sistemas
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.dsantanal.t02.p1;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class SPP2DSantanaLT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar variables.
        double sue,p;
        int cate, he;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca el sueldo del trabajador: ");
        sue=sc.nextDouble();
        System.out.println("Introduzca la categoría del trabajador: ");
        cate=sc.nextInt();
        System.out.println("Introduzca las horas extras trabajadas: ");
        he=sc.nextInt();
        
        switch (cate){
            case 1:
                System.out.println("Calcular pago para el trabajador.");
                p=sue+(he*30);
                System.out.println("Pago=$"+p);
                break;
            case 2:
                System.out.println("Calcular pago para el trabajador.");
                p=sue+(he*38);
                System.out.println("Pago=$"+p);
                break;
            case 3:
                System.out.println("Calcular pago para el trabajador.");
                p=sue+(he*50);
                System.out.println("Pago=$"+p);
                break;
            case 4:
                System.out.println("Calcular pago para el trabajador.");
                p=sue+(he*70);
                System.out.println("Pago=$"+p);
                break;
            case 5:
                System.out.println("Calcular pago para el trabajador.");
                p=sue+(he*85);
                System.out.println("Pago=$"+p);
                break;
            case 6:
                System.out.println("Calcular pago para el trabajador.");
                p=sue+(he*100);
                System.out.println("Pago=$"+p);
                break;
            case 7:
                System.out.println("Calcular pago para el trabajador.");
                p=sue+(he*115);
                System.out.println("Pago=$"+p);
                break;
            case 8:
                System.out.println("Calcular pago para el trabajador.");
                p=sue+(he*200);
                System.out.println("Pago=$"+p);
                break;
            
            default:
                System.out.println("No se pueden hacer los cálculos de la categoría seleccionada.");
                
        }
    }
    
}
