import java.util.Scanner;

public class hackerrankcodigoagosto9 {

	public static void main(String[] args) {
		
		
		int c=0;
		Scanner lector = new Scanner(System.in);

		String entrada = lector.nextLine();

		if (entrada.length() <= 100) {

			for (int n = 0; n <=entrada.length()-1; n++) {

				if (entrada.indexOf(entrada.charAt(n)) == entrada.lastIndexOf(entrada.charAt(n))) {

					char d = entrada.charAt(n);

					while (c < 1) {
						System.out.println(d);
						c++;
					}

				}
			}

		} else {
			System.out.println("Longitud Incorrecta");
		}

	}

}
