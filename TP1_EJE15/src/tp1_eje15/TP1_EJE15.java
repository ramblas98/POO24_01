/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_eje15;

/**
 *
 * @author usuario
 */
import java.util.*;
public class TP1_EJE15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int S,b=0,i,aux,aux2,pos = 0;
        String N;
        String notas[];
        notas= new String[12];
        
        notas[0] = "DO";
        notas[1] = "DO#";
        notas[2] = "RE";
        notas[3] = "RE#";
        notas[4] = "MI";
        notas[5] = "FA";
        notas[6] = "FA#";
        notas[7] = "SOL";
        notas[8] = "SOL#";
        notas[9] = "LA";
        notas[10] = "LA#";
        notas[11] = "SI";
        
        S = teclado.nextInt();
        N = teclado.next();
        i=0;
        while(b==0){
            if(notas[i].compareTo(N) == 0){
                b=1;
                pos = i;
            }else i++;
        }
        
        if(pos-S>=0){
            aux= pos-S;
            System.out.println(notas[aux]);
        }else{
            aux2 = pos-S;
            aux= aux2+12;
            System.out.println(notas[aux]);
        }
        
    }
    
}
