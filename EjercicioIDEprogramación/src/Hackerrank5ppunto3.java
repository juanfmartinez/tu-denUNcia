import java.util.Scanner;

public class Hackerrank5ppunto3 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner lector = new Scanner(System.in);

		int puntajepedro = 0;
		int puntajeximena = 0;
		String puntaje = "";
		String pedro = lector.next();
		String xim = lector.next();
		String profe = lector.next();
		
		
		

		for (int contprof = 0; contprof < profe.length(); contprof++) {

			for (int contpedro = 0; contpedro < pedro.length(); contpedro++) {
				if (pedro.charAt(contpedro) == profe.charAt(contprof)) {
					puntajepedro++;
				}
			}

			for (int contxim = 0; contxim < xim.length(); contxim++) {
				if (xim.charAt(contxim) == profe.charAt(contprof)) {
					puntajeximena++;
				}

			}

			if (puntajepedro > puntajeximena) {
				puntaje = puntaje + "+";
			} 
			else if (puntajeximena > puntajepedro) {
				puntaje = puntaje + "*";
			} 
			else if (puntajeximena == puntajepedro) {
				puntaje = puntaje + "=";
			}

		}

		System.out.println(puntaje);

	}
}
