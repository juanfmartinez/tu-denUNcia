package PROYECTOFINAL;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class portaldenuncias {

	public static void main(String[] args) {
		int tamano;

		String[][] usuario = new String[1][5];

		Scanner lector = new Scanner(System.in);

		System.out.println(
				" Bienvenido al portal del sistema de denuncias, por favor ingrese sus nombres y sus apellidos ");

		String nombre = lector.nextLine();

		System.out.println(" Bienvenido " + nombre
				+ " ¿Desea ingresar una denuncia o consultar el estado de una? ( RESPONDA CON consultar O CON denunciar ( sin espacios )) ");

		String respuesta = lector.nextLine();
		if (respuesta.equals("consultar")) {

			System.out.println("Digite su numero de identificación (Cedula de ciudadania)");
		
			String cedula = lector.nextLine();
			if (cedula.equals(usuario[0][0])) {}
			System.out.println(" la denuncia hecha fue realizada por:\"" + nombre + "\" su cedula es: \"" + usuario[0][0] + "\" su edad: \""+ usuario[0][1] + "\" la ciudad en que sucedio el problema:\"" + usuario[0][2]+ "\" y lo que sucedio fue: \"" + usuario[0][3] + "\" ");

	} else if (respuesta.equals("denunciar")) {

			System.out.println("Bienvenido al servicio de denuncias " + nombre+ ", a continuación se iniciará el proceso para registrar una denuncia");

			

			for (tamano = 0; tamano <= usuario.length; tamano++)
				;
			{

				System.out.println("Digite su cedula de ciudadania");

				usuario[0][0] = lector.nextLine();

				System.out.println("Digite su edad ");

				usuario[0][1] = lector.nextLine();

				System.out.println("Escriba el nombre de la ciudad donde tuvo lugar el suceso ");

				usuario[0][2] = lector.nextLine();

				System.out.println("¿Qué suceso fue? (robo, estafa, engaño, abuso, otro)");

				usuario[0][3] = lector.nextLine();

				System.out.println("Describa brevemente lo que sucedio:");

				usuario[0][4] = lector.nextLine();

			}
			System.out.println("Entonces para formalizar la denuncia le recordaremos lo que ha escrito:");
			
			System.out.println("Su nombre es:\"" + nombre + "\" su cedula es:\"" + usuario[0][0] + "\" su edad: \""	+ usuario[0][1] + "\" la ciudad en que sucedio el problema:\"" + usuario[0][2]+ "\" y lo que sucedio fue:\"" + usuario[0][3] + "\" ");
			
			System.out.println("Si estos son los datos correctos escriba SI (en mayusculas y sin espacios) o NO (sin mayusculas y sin espacios) si hay algun error (tenga en cuenta que si dice \"NO\" debera rellenar el formulario completo nuevamente");
			
			String respuesta2 = lector.nextLine();

			if (respuesta2.equals("SI")) {

				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

			}  if (respuesta.equals("NO")) {
				System.out.println("Registre que dato fue el incorrecto (nombre,edad,ciudad,suceso) "); //Función send to inicio
				String respuesta3= lector.nextLine();
				if (respuesta3.equals("nombre")) {

					System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

				}
				else if (respuesta3.equals("edad")) {

					System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

				}
				else if (respuesta3.equals("ciudad")) {

					System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

				}
				else if (respuesta3.equals("suceso")) {

					System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

				}
				
				
		} 

	}	
	else {

		System.out.println("Gracias por visitar el portal, hasta luego.");

	}
}

		

	}