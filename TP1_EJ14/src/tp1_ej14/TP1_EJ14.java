/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tp1_ej14;
import java.util.*;
/**
 *
 * @author luismendoza4565@gmail.com
 */
public class TP1_EJ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n,QT,S,i=0,j,band,menor,pos;
        int v[];
        int aux[];
        int ganador[];
        n = teclado.nextInt();
        ganador = new int[n];
        while(i<n){
            band=0;
            QT = teclado.nextInt();
            S = teclado.nextInt();
            v = new int[QT];
            aux = new int[QT];
            for(j=0;j<QT;j++){
                v[j] = teclado.nextInt();
            }  
           
            j=0;
            while(j<QT && band==0){   
                if(v[j]==S){
                  ganador[i]=j+1;
                  band = 1;
                }
                else{
                  if(v[j]>S){
                    aux[j]=v[j] - S;
                            
                  }
                  else{
                    aux[j]=S - v[j];
                  }
                }
                j++;
            }
            if(band == 0){
                menor=aux[0];
                pos=0;
              for(j=1;j<QT;j++){
                if(aux[j]<menor){
                  menor = aux[j];
                  pos = j;
                }
              }
              ganador[i] = pos+1;
            }
            
            i++;
        }
        for(i=0;i<n;i++){
          System.out.println(ganador[i]);
        }
        
    }
}