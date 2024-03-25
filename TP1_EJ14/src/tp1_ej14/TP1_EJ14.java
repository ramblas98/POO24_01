/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej14;
import java.util.Scanner;

/**
 *
 * @author Mangel
 */
public class TP1_EJ14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        
        
       for(int i=0; i < casos; i++){
           int QT= scanner.nextInt(); //numero de estudiantes en el grupo
           int S= scanner.nextInt();  //numero secreto
           

           int[] intentos = new int[QT]; //almacena los intentos de cada estuante
           
           for(int j=0; j<QT; j++) {

               intentos[j] = scanner.nextInt();
           }
           int ganador = encontrarGanador(intentos, S);
           System.out.println(ganador);
       }
    }
    
    //metodo para encontrar el ganador
    public static int encontrarGanador(int []intentos,int S){
        int distanciaMinima = Integer.MAX_VALUE;
        int posicionGanador = -1;
        
        for(int i=0;1<intentos.length;i++){
            int distancia = Math.abs(intentos[i]-S);
            
            if(distancia < distanciaMinima || (distancia == distanciaMinima && i< posicionGanador)){
                distanciaMinima = distancia;
                posicionGanador = i+1;
                
                
                
            }
        }
         return posicionGanador;       
    }
    
}
