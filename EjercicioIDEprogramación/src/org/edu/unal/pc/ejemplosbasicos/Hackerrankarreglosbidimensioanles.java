package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Hackerrankarreglosbidimensioanles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		int f = lector.nextInt();
		int c = lector.nextInt();

		int[][] arreglo = new int[f][c];

		int z = (f * c) - ((f - 2) * (c - 2));

		if ((3 <= f && f <= 500) && (3 <= c && c <= 500)) {
			for (int x = 0; x < arreglo.length; x++) {

				for (int y = 0; y < arreglo[x].length; y++) {
					if (x == 0 || x ==f-1) {
						arreglo[x][y] = z;
						
					} 
					else if (y == 0 || y == c-1) {
						arreglo[x][y] = z;
					} else {
						arreglo[x][y] = 0;
					}
					
				}
				
			}
			for (int x = 0; x < arreglo.length; x++) {

				for (int y = 0; y < arreglo[x].length; y++) {
			
					System.out.print(arreglo[x][y]+" ");
				}
				System.out.println();
			}
			System.out.println();
		} 
		
		
		
		else {
			System.out.println("ERROR EN LA ENTRADA");
		}

	}

}
