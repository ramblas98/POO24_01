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
        
        int n = teclado.nextInt();
        for(int i=0;i<n;i++){
            int cantest = teclado.nextInt();
            int numsec = teclado.nextInt();
            int[] respuestas = new int[cantest];
            for(int j=0;j<cantest;j++){
                respuestas[j] = teclado.nextInt();
            }
             int distanciaMinima = Integer.MAX_VALUE;
             int distancia = -1;
        }      
    }
}
