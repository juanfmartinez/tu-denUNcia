package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Tallerarreglos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
        int n = consola.nextInt();
        int[] arraycentral = new int[n];
        int contaciclos=0;
        int sum_ind = 0;
        int num_Datos = 0;
        int contador=0;
        
        if(1<=n && n<=100) {
        
        while ((num_Datos < (n) && consola.hasNext())) { 

            for (int i = 0; i < arraycentral.length; i++) {
                
                int num = consola.nextInt();
                
                if((-Math.pow(10, 4)) <= num && num <= Math.pow(10, 4)) {
                arraycentral[i] = num;
                    
                num_Datos++;
                    
                }
                else {
                    
                    break;
                    
                }

            }
        }
        
        while(contaciclos< n) {

        for (int guia = (n-1); guia >= contaciclos; guia--) {
            
            for (int j = guia; j >= contaciclos; j--) {
                
                sum_ind = sum_ind + arraycentral[j];
                
            }
            
            if(sum_ind<0) {
                contador++;
            }
            sum_ind=0;
        }

            
            contaciclos++;
        }
        
        System.out.println(contador);
    }
        
    }

        // TODO Auto-generated method stub

}