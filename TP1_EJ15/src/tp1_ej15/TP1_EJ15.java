/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej15;

import java.util.Scanner;

/**
 * @author magali.17.reina@gmail.com
 */
public class TP1_EJ15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        /*String cads[] = {"DO", "DO#", "RE", "RE#", "MI", "FA", "FA#", "SOL", "SOL#", "LA", "LA#", "SI"};*/
        int i, S, pos;
        boolean band = false;
        String notaIngresada;
        String cads[];
        cads = new String[12];
        cads[0] = new String("DO");
        cads[1] = new String("DO#");
        cads[2] = new String("RE");
        cads[3] = new String("RE#");
        cads[4] = new String("MI");
        cads[5] = new String("FA");
        cads[6] = new String("FA#");
        cads[7] = new String("SOL");
        cads[8] = new String("SOL#");
        cads[9] = new String("LA");
        cads[10] = new String("LA#");
        cads[11] = new String("SI");
       
        System.out.println("NOTA: ");
        notaIngresada = teclado.next();
        
        String nueva = notaIngresada.toUpperCase();
        
        S = (int)(Math.random()*(3-1+1)+1);
        System.out.println("Corrimiento: " + S);
        
        pos = 0;
        for(i = 0; i < 12; i++){
            band = nueva.equals(cads[i]);
            if(band == true){
                pos = i;
                break;
            }   
        }
        
        if(band == true){
           switch(S){
               case 1: if(pos == 0) System.out.println(cads[11]);
                       else System.out.println(cads[pos - 1]);
                       break;
               case 2: switch(pos){
                            case 0: System.out.println(cads[10]); break;
                            case 1: System.out.println(cads[11]); break;
                            default: System.out.println(cads[pos - 2]); break;
                       }
                   /*if(pos == 0) System.out.println(cads[10]);
                       if(pos == 1) System.out.println(cads[11]);
                       else System.out.println(cads[pos - 2]);*/
                       break;
               case 3: switch(pos){
                            case 0: System.out.println(cads[9]); break;
                            case 1: System.out.println(cads[10]); break;
                            case 2: System.out.println(cads[11]); break;
                            default: System.out.println(cads[pos - 3]); break;
                       }
                       /*if(pos == 0) System.out.print(cads[9]);
                       if(pos == 1) System.out.print(cads[10]);
                       if(pos == 2) System.out.print(cads[11]);
                       else System.out.print(cads[i - 3]);*/
                       break;     
           }
        }else System.out.println("Nota inexistente");
    }
}
