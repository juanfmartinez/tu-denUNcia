package org.edu.unal.pc.ejemplosbasicos;

public class Arreglosbidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int [3][4];
a[0][0]=1;
a[0][1]=2;
a[0][2]=3;
a[0][3]=4;
a[1][0]=5;
a[1][1]=6;
a[1][2]=7;
a[1][3]=8;
a[2][0]=9;
a[2][1]=10;
a[2][2]=11;
a[2][3]=12;

	for (int x= 0;x<a.length;x++) { //consulta en las filas
		
		for(int y=0; y<a[x].length;y++) { //Consulta en las columnas a[x] es el numero en la posicion de la fila
			
			System.out.print(a[x][y]+" "); //Imprime el valor en las coordenadas
			
			
		}
		System.out.println(); //salto de carril
	}
	
	}

}
