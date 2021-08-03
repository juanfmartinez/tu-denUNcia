package org.edu.unal.pc.ejemplosbasicos;

import java.util.Arrays;
import java.util.Scanner;

public class TallerArrelos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner lector= new Scanner(System.in);
        
        int N=lector.nextInt();
        if(0<=N && N<=100){
            int arreglo[]=new int [N];
            System.out.println(Arrays.toString(arreglo));
        }
        lector.close();
	}

}
