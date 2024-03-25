package tp1_ej14;
import java.util.*;

public class TP1_EJ14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, m, i, j, v[], c, g;
        n = teclado.nextInt();
        for (i=0; i<n; i++) {
            g = 0;
            m = teclado.nextInt();
            c = teclado.nextInt();
            v = new int[m];
            for (j=0; j<m; j++) v[j] = teclado.nextInt();
            for (j=0; j<m; j++) {
                if (v[j]==c) {g = j; break;}
                else if (Math.abs(c-v[j]) < Math.abs(c-v[g])) g = j;
            }
            System.out.println(g+1);
        }
        System.out.println("Adios mundo");        
    }   
}
