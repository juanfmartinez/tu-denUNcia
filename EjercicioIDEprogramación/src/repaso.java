import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//Juan Francisco Martinez Rojas-Angel Barrera-Camilo Ospina Hoyos//
public class repaso{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
      
        
      Scanner lector = new Scanner(System.in);

        int n = lector.nextInt();
        int pos1;
        int pos2;
        int producto;
        int[] arreglo = new int[n];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = lector.nextInt();
        }

        Arrays.sort(arreglo);

       

        pos1 = arreglo[n - 1] * arreglo[n - 2];
        pos2 = arreglo[0]*arreglo[1];
        
        if(pos1 > pos2) {
            producto = pos1;
        }
        else (pos2 > pos1){
            producto = pos2;
        }
        System.out.println(producto);
        
    }
}
