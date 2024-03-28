package tp1_ej15;

import java.util.Scanner;

public class TP1_Ej15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);    
        int i=0, pos=-1, semitonos;
        String[] cad = {"DO", "DO#", "RE", "RE#", "MI", "FA", "FA#", "SOL", "SOL#", "LA", "LA#", "SI"};
        String escuchada;

        System.out.println("Nota escuchada por Amalia:");
        escuchada = leer.next().toUpperCase();       

        while(i<12){
            if(escuchada.equals(cad[i])){
                pos = i;
                i = 12;
            }
            i++;
        }

        if(pos!=-1){
            System.out.println("Semitonos de menos:");
            semitonos = leer.nextInt();
            semitonos %= 12;
            pos -= semitonos;
            if(pos<0){
                pos = 12-semitonos;
            }
            System.out.println("La nota en realidad es:"+ cad[pos]);
        }else System.out.println("No se encontró la nota.");

    }

}
