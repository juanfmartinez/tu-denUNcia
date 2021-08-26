package PROYECTOFINAL;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class portaldenuncias {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int max_usuarios = 10;
		int persona = 0;
		int contador = 0;
		int contador1 = 0;

		String admin = "ELBICHO";
		String contradmin = "chiguiro24";

		String[][] comunicacion = new String[3][3];
		comunicacion[0][0] = "Correo electronico";
		comunicacion[0][1] = "juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co";
		comunicacion[1][0] = "Numero telefónico y mensaje de texto";
		comunicacion[1][1] = "3186517640 - 3219113875 - 3114671293";

		personas[] pArray = new personas[max_usuarios];
		personas[] temporalArray = new personas[max_usuarios];
	Accionesusuario delusuario = new Accionesusuario();
	Accionesadministrador deladmin = new Accionesadministrador();

		do {
			try {
				try {
			personas pu = new personas();

			delusuario.bienvenidageneral();
			String email2 = lector.nextLine();
			if (delusuario.verif_correoFORM(email2)) {
				if (delusuario.verif_correoINS(email2)) {
					System.out.println(" \n");
					
					System.out.println("Bienvenido a tu denUNcia!!!");

					System.out.println(" ¿Desea acceder a las funciones avanzadas como administrador?(SI o NO)");
					String inicio = lector.nextLine();
					if (inicio.equalsIgnoreCase("si")) {
						System.out.println("Indique el usuario ");
						String adminentr = lector.nextLine();
						System.out.println("Indique la contraseña ");
						String contraadmin = lector.nextLine();
						if (deladmin.validarAdmin(adminentr, contradmin)) {
							pArray = deladmin.AccionesAdmin(admin, pArray, temporalArray);
							
						} else {
							System.out.println("Usuario y/o contraseña erroneos ");
						}
					} else if (inicio.equalsIgnoreCase("no")) {
						delusuario.AccionesUser(pArray, persona);
						persona++;
					}
				} else {
					System.out.println("Correo no valido, Intentelo nuevamente...");
					System.out.println("");
				}

			} else {
				System.out.println("Correo no valido, Intentelo nuevamente...");
				System.out.println("");
			}
				}
				catch (NullPointerException ex) {
					
					System.out.println("No existen datos aun... ");
				}
		} catch (Exception ex) {
			
			System.out.println("Error, intente nuevamente, si el problema persiste comuniquese con el administrador del sistema. ");
		}

		} while (persona <= max_usuarios);
		System.out.println(
				"Estimado usuario,lamentamos informarle que el portal no pudo cargar su denuncia exitosamente debido a que se alcanzo la capacidad máxima del portal. Comuniquese con un administrador. ");
		System.out.println(
				"Para comunicarse con el administrador del portal cuenta con las siguientes opciones: Correo electronico: \"\r\n"
						+ " \"juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co.\\n Numero telefónico y mensaje de texto 3186517640 - 3219113875 - 3114671293");

		System.out.println("Pronto tendra respuesta. Gracias por su atencion");
		System.out.println("");
		lector.close();
	

	}

}
