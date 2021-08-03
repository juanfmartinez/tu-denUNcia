package org.edu.unal.pc.ejemplosbasicos;

import java.util.*;


public class taller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner lector= new Scanner(System.in);
		 System.out.println("Digite el nombre de la asignatura");
	        String a = lector.nextLine();
	          System.out.println("Digite sus 5 notas");
	                double n1= lector.nextDouble();
	               
	                double n2= lector.nextDouble();
	               
	                double n3= lector.nextDouble();
	                
	                double n4= lector.nextDouble();
	                
	                double n5= lector.nextDouble();
	            
	                lector.close();
	                
	                double p =((n1+n2+n3+n4+n5)/5);
	                
	                System.out.println(    " \"Promedio actual para \'" +a +   "\' es: " +p+ "\"" );
	        
	}

}
