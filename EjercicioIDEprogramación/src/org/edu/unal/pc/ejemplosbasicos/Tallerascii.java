package org.edu.unal.pc.ejemplosbasicos;
import java.util.*;

public class Tallerascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Genere los 4 caracteres");
		Scanner lector= new Scanner(System.in);
        
        String A=lector.next() ;
        
        int a1=Integer.parseInt("A");
        
        String B=lector.next() ; 
        
        int b1=Integer.parseInt("B");
        
        String C= lector.next(); 
        
        int c1=Integer.parseInt("C");
        
        String D= lector.next();
        
        int d1=Integer.parseInt("d");
        
       System.out.print(((a1*b1)-c1)-d1);
        
        
        lector.close();
        
		
	}

}
