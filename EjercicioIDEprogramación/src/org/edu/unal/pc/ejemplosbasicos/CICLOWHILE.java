package org.edu.unal.pc.ejemplosbasicos;



public class CICLOWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		System.out.println("Lanzando la nave");
		while (x>0) {
			System.out.println(x);
			x--;
			continue;
		}
		System.out.println("Despegando");
	}

}
