package EJERCICIOSPRACTICOS3;

import java.util.Scanner;

public class PUNTO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);

int num,cuadrado;
System.out.println("Introduzca número: ");

num=scan.nextInt();

while(num>=0) {
	
	cuadrado=num*num;
	
	System.out.println(num+ "² es igual a "+cuadrado);
	
	System.out.println("Introduzca otro número");
	
	num=scan.nextInt();
		
}


scan.close();
	}
	

}
