package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Tallerarreglos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int a[]=new int[n];



        // Prints each sequential element in array a
      
        for (int i =0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    

        scan.close();
		
	}

}
