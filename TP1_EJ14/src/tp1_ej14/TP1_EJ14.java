/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej14;

import java.util.Scanner;

public class TP1_EJ14 {
    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);        
        int aux, i, numProf, n, n2;
        int dist, pos = 0;       
        int[] v;
        
        v = new int[10];
        n = leer.nextInt();
        
        while(n>0){
            n2 = leer.nextInt();
            numProf = leer.nextInt();
            
            aux=9999;
            for(i=0; i<n2; i++){
                v[i] = leer.nextInt();
                dist = Math.abs(numProf-v[i]); 
                
                if(dist<aux){
                    pos = i+1;
                    aux = dist;
                }
            }
            System.out.println(":"+pos);
            n--;
        }
    }
    
}
