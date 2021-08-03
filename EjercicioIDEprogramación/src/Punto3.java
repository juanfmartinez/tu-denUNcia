import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un numero");

		int num = scan.nextInt();
		while (num != 0) {

			if (num % 2 == 0)
				System.out.println(num+" Par");
			else
				System.out.println(num+" Impar");
System.out.println("Introduzca otro numero");
			num=scan.nextInt();
			
		}
System.out.println("Juego finalizado");
	}

}
