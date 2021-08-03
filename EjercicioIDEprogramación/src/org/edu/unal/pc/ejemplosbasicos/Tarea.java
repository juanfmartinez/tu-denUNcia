package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Tarea {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int valor;
		int valorendescuento;
		int iva;
		
		System.out.print("¿Cuanto costo su producto?");
		
		int valor1= sc.nextInt();
		
		valorendescuento= valor1-(valor1/100)*20;
		
		iva= (valorendescuento/100)*19;
		

System.out.print("El valor del producto en descuento es " +valorendescuento );

System.out.print(" El valor del iva es " +iva );
	}

}
