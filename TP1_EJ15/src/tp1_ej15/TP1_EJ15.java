/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



package tp1_ej15;
import java.util.Scanner;


/**
 *
 * @author Luis Mendoza
 */


public class TP1_EJ15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      String n;
      int s,i = 0,pos = 0,band = 0;
      //(1<=S<=3)
      s = teclado.nextInt();
      n = teclado.next();
      int k=14;
      String v[];
      v = new String[k];
      v[0]="DO";v[1]="DO#";v[2]="RE";v[3]="RE#";v[4]="MI";v[5]="FA";
      v[6]="FA";v[7]="SOL";v[8]="SOL#";v[9]="LA";v[10]="La#";v[11]="SI";
      while(i<k && band == 0){
          if(v[i].equals(n) == true){
              pos = i - s;
              band = 1;
          }
          i++;
        }
        if(pos<0){
            if(pos == -1){
                pos = 11;
                System.out.println(v[pos]);
            }
            else if(pos == -2){
                pos = 10;
               System.out.println(v[pos]); 
            }
            else if(pos == -3){
                pos = 9;
                System.out.println(v[pos]);
            }
        }
        else{
            System.out.println(v[pos]);
        }
        
    }
    
}
