package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Ejercicioenclasematrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector= new Scanner(System.in);
		
		int f= lector.nextInt();
		int c=lector.nextInt();
		
		int [][] arreglo= new int [f][c];
		
		int d=lector.nextInt();		
		
		for(int x =0 ; x<arreglo.length; x++) {
			
			for(int y=0; y<arreglo[x].length;y++) {
				arreglo[x][y]=d++;
				System.out.print(arreglo[x][y] + " ");
				
			}
			System.out.println();	
		}
		
	
		
		
		
		
	}

}
