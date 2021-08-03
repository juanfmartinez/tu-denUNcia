package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Ciclospunto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int A, B,C;
        
        while(scan.hasNextInt()){
        	A=scan.nextInt();
            B=scan.nextInt();
            C=A+B;
            System.out.println(C);
            
        }
        scan.close();
    }
}