package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Matricesconscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		int f= scan.nextInt();
		int c=scan.nextInt();
		
		int [][] arreglo= new int [f][c];
		
			
		
		for(int x =0 ; x<arreglo.length; x++) {
			
			for(int y=0; y<arreglo[x].length;y++) {
				arreglo[x][y]=scan.nextInt(); 			//Aqui se escanea el valor 
				System.out.print(arreglo[x][y] + " ");
				
			}
			System.out.println();	
		}
		
		
	
		
	}

}
