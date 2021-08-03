package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class codificacion {

	public static void main(String[] args) {
		 
		int numintentos=3;
		System.out.println(advinanza(numintentos));
	}
		
		static String advinanza(int numintentos) {
			String msg="";
			Scanner scan=new Scanner(System.in);
			System.out.println("De cual color es el planeta marte?:("+numintentos+"/3 intentos)" );
			String color=scan.next();
			
			if (color.toUpperCase()=="rojo".toUpperCase()) {
				System.out.println("Ganaste");
			}
			else if(numintentos ==1)
			{
				System.out.println("Perdiste");
			}
			else {
				advinanza(numintentos--);
				
			}
			
			scan.close();
			return msg;
		}
}
