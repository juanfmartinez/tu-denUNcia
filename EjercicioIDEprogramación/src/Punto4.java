import java.util.Scanner;

public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num, contador;
Scanner scan=new Scanner(System.in);
System.out.println("Introduzca un numero");
num=scan.nextInt();
contador=0;

while(num>0) {
	contador=contador+1 ;
	System.out.println("Introduzca otro numero: ");
	num=scan.nextInt();
			
}
System.out.println("Se han introducido: "+contador+" numeros validos");
	}

}
