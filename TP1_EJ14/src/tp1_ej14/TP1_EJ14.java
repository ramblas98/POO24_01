/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej14;

import java.util.Scanner;

/**
 *
 * @author profeblas
 */
public class TP1_EJ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int aux=-1, i, numProf, n, n2;
        int dist, pos;
        dist = pos = -1;
        int v[];
        v = new int[10];
        n = leer.nextInt();
        while(n>0){
            n2 = leer.nextInt();
            numProf = leer.nextInt();
            
            for(i=0; i<n2; i++){
                v[i] = leer.nextInt();
                dist = Math.abs(numProf-v[i]); 
                if(i == 0){
                    pos = i+1;
                    aux = dist;
                }else if(dist<aux){
                    pos = i+1;
                    aux = dist;
                }
            }
            System.out.println(":"+pos);
            n--;
        }
    }
    
}
