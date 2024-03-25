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
        Scanner teclado = new Scanner(System.in);
        int n,i,j,cantest,numsec;
        int v[];
        
        
        n = teclado.nextInt();
        for(i=0;i<n;i++){
            cantest = teclado.nextInt();
            numsec = teclado.nextInt();
            v = new int[cantest];
            for(j=0;j<cantest;j++){
                v[j] = teclado.nextInt();
            }
        }
    }
}
