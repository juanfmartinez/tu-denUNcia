package org.edu.unal.pc.ejemplosbasicos;

import java.util.Arrays;

public class ARREGLOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] miArreglo=new int[5];
miArreglo[0]=1;
int[] miArreglo2 = {5,2,1,4,3};
/*for (int i=1;i<=miArreglo2.length;i++){
	System.out.println(miArreglo2[i-1]);
}
Arrays.sort(miArreglo2);

System.out.println(Arrays.toString(miArreglo2));

Arrays.fill(miArreglo2, 1);

System.out.println(Arrays.toString(miArreglo2)); */

for(int miDato:miArreglo2) {
	System.out.println(miDato);
}
	}

}
