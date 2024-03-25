/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej14;

import java.util.Scanner;
/**
 *
 * @author magali.17.reina@gmail.com
 */
public class TP1_EJ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int N, numeros[], S, QT, i, k, p, menor, pos, diferencias[];
        
        N = teclado.nextInt();
        numeros = new int[10];
        
        
        for(i = 0; i < N; i++){
            QT = (int)(Math.random()*(10-4+1)+4); //Cantidad de integrantes
            S = (int)(Math.random()*(100-1+1)+1); //El número a adivinar
            for(k = 0; k < QT; k++){
                numeros[k] = (int)(Math.random()*(100-1+1)+1);//Número de c/integrante
            }
         
            System.out.println("Cantidad de integrantes: " + QT);
            System.out.println("Numero a adivinar: " + S);
            System.out.println("Vector generado:");
            
            for(k = 0; k < QT; k++){
                System.out.print(numeros[k] + " ");
            }
            System.out.println();
            diferencias = new int[QT];
            for(p = 0; p < QT; p++){
                diferencias[p] = Math.abs(S - numeros[p]);
            }
            menor = diferencias[0];
            pos = 0;
            for(k = 1; k < QT; k++){
                if(diferencias[k] < menor){
                    menor = diferencias[k];
                    pos = k;
                }
            }
            System.out.println(pos+1);
        }
    }
}
