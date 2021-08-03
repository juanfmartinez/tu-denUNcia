package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Taller3Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner lector = new Scanner(System.in);
        
        int N = lector.nextInt();
        int N2 = lector.nextInt();
        int N3 = lector.nextInt();
        
        char O = lector.next().charAt(0);
        if  (1<= N & N <= 1000 ) {
        N = N;
 }
else {
        System.out.println("Valor " + N + " no es valido");
        
}
if  (1<= N2 & N2 <= 1000 ) {
    N2 = N2;
}
else {
    System.out.println("Valor " + N2 + " no es valido");
}
if  (1<= N3 & N3 <= 1000 ) {
    N3 = N3;
}
else {
    System.out.println("Valor " + N3 + " no es valido");
}

if ((char) O == 'D') {
    if ((1<= N & N <= 1000) & (1<= N2 & N2 <= 1000) & (1<= N3 & N3 <= 1000)) {
    
     if (N==N3 || N2==N3 || N==N2){
     
            System.out.println("Existen numeros iguales, inicie la operacion");
        }
    
      if (N3>N2 && N2 >N){
        System.out.println("El orden descendente de los numeros es: " + N3+ ", " + N2+ ", " + N);
    }
    
     if (N3>N && N>N2){
            System.out.println("El orden descendente de los numeros es: " + N3+ ", " + N+  ", " + N2);
            
        }
     if (N2>N3 && N3>N){
        System.out.println("El orden descendente de los numeros es: " + N2+ ", " + N3+ ", " + N);
    }
         if (N2>N && N>N3){
            System.out.println("El orden descendente de los numeros es: " + N2+ ", " + N+ ", " + N3);
    }
         if (N>N3 && N3>N2){
            System.out.println("El orden descendente de los numeros es: " + N+  ", " + N3+ ", " + N2);
        }
             if (N>N2 && N2>N3){
                System.out.println("El orden descendente de los numeros es: " + N+ ", " + N2+ ", " + N3);
    }
    }
            
} else if (O == 'A' ) { 
    if ((1<= N & N <= 1000) & (1<= N2 & N2 <= 1000) & (1<= N3 & N3 <= 1000)) {
    
     if (N==N3 || N2==N3 || N == N2){
            System.out.println("Existen numeros iguales, inicie la operacion");
        }
    
      if (N3<N2 && N2<N){
        System.out.println("El orden ascendente de los numeros es: " + N3+ ", " + N2+ ", " + N);
    }
    
     if (N3<N && N<N2){
            System.out.println("El orden ascendente de los numeros es: " + N3+ ", " + N+", " + N2);
            
        }
     if (N2<N3 && N3<N){
        System.out.println("El orden ascendente de los numeros es: " + N2+", " + N3+ ", " + N);
    
    }
         if (N2<N && N<N3){
            System.out.println("El orden ascendente de los numeros es: " + N2 +", " + N+ ", " + N3);
    }
         if (N<N3 && N3<N2){
            System.out.println("El orden ascendente de los numeros es: " + N+ ", "+ N3+  ", " + N2);
        }
             if (N<N2 && N2<N3){
                System.out.println("El orden ascendente de los numeros es: " + N+ ", " + N2+ ", " + N3);

    }
    }
            
    
    } 
else if (O != 'A' || O != 'D') {
        System.out.println("El caracter de orden ingresado no es valido");
    }
}

}
