package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class WHILESCANNER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ingrese su edad ");
		int edad=0;
		
		while (!scan.hasNextInt());{
			scan.next();
			
			System.out.println(scan.next()+ "No es un valor numérico, intnete nuemavemnte");
			
			
		}
				edad=scan.nextInt();
				System.out.println("Su edad es: " + edad);
				
				scan.close();
	}

}
