package PROYECTOFINAL;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class portaldenuncias {

	public static void main(String[] args) {
		int tamano;

		String[][] usuario = new String[max_personas][5];

		Scanner lector = new Scanner(System.in);

		while (true) {

			System.out.println(
					
					" Bienvenido al portal del sistema de denuncias, por favor ingrese sus nombres y sus apellidos ");

			String nombre = lector.nextLine();

			System.out.println(" Bienvenido, " + nombre
					+ " ¿Desea ingresar una denuncia, consultar el estado de una, o cerrar sesión? ( RESPONDA CON \"consultar\", con \"denunciar\" o con \"finalizar\" según sea su caso ( sin espacios )) ");

			String respuesta = lector.nextLine();
			if (respuesta.equals("consultar")) {

				System.out.println("Digite su numero de identificación (Cedula de ciudadania)");

				String cedula = lector.nextLine();

				for (i = 0; i < max_personas; i++) {
					if (cedula.equals(usuario[i][0])) {
						System.out.println(" la denuncia hecha fue realizada por:\"" + nombre + "\" su cedula es: \""
								+ usuario[i][0] + "\" su edad: \"" + usuario[i][1]
								+ "\" la ciudad en que sucedio el problema:\"" + usuario[i][2]
								+ "\" y lo que sucedio fue: \"" + usuario[i][3] + "\" ");
						break;
					}

				}
				if (i >= max_personas) {
					System.out.println("No se encontró una denuncia con ese número de documento");
				}

			}

			if (respuesta.equals("denunciar")) {

				while (persona < max_personas) {

					System.out.println("Bienvenido al servicio de denuncias " + nombre
							+ ", a continuación se iniciará el proceso para registrar una denuncia");

					for (tamano = 0; tamano <= usuario.length; tamano++)
						;
					{

						System.out.println("Digite su cedula de ciudadania");

						usuario[persona][0] = lector.nextLine();

						System.out.println("Digite su edad ");

						usuario[persona][1] = lector.nextLine();

						System.out.println("Escriba el nombre de la ciudad donde tuvo lugar el suceso ");

						usuario[persona][2] = lector.nextLine();

						System.out.println("¿Qué suceso fue? (robo, estafa, engaño, abuso, otro)");

						usuario[persona][3] = lector.nextLine();

						System.out.println("Describa brevemente lo que sucedio:");

						usuario[persona][4] = lector.nextLine();

					}
					System.out.println("Entonces para formalizar la denuncia le recordaremos lo que ha escrito:");

					System.out.println("Su nombre es:\"" + nombre + "\" su cedula es:\"" + usuario[persona][0]
							+ "\" su edad: \"" + usuario[persona][1] + "\" la ciudad en que sucedio el problema:\""
							+ usuario[persona][2] + "\" y lo que sucedio fue:\"" + usuario[persona][3] + "\" ");

					System.out.println(
							"Si estos son los datos correctos escriba SI (en mayusculas y sin espacios) o NO (en mayusculas y sin espacios) si hay algun error (tenga en cuenta que si dice \"NO\" debera rellenar el formulario completo nuevamente");

					String respuesta2 = lector.nextLine();

					if (respuesta2.equals("SI")) {

						System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
						++persona;

					}
					if (respuesta.equals("NO")) {
						System.out.println("Registre que dato fue el incorrecto (edad,ciudad,suceso, descripcion) "); // Función
																														// send
						// to inicio
						String respuesta3 = lector.nextLine();
						if (respuesta3.equals("nombre")) {
							System.out.println(
									"Por favor, ingrese la corrección que quiere hacer al dato que considera erróneo (edad)");
							nombre = lector.nextLine();
							usuario[persona][1] = nombre;
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equals("ciudad")) {
							usuario[persona][1] = lector.nextLine();

							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equals("ciudad")) {
							usuario[persona][2] = lector.nextLine();
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equals("suceso")) {
							usuario[persona][3] = lector.nextLine();

							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equals("descripcion")) {
							usuario[persona][4] = lector.nextLine();

							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						}
						++persona;

					}

					System.out.println("Si ya terminó el registro de su denuncia, por favor, escriba \"STOP\".");
					String status = lector.nextLine();
					if (status.equals("STOP")) {
						break;
					}

				}
			}

			else if (respuesta.equals("finalizar")) {

				System.out.println("Gracias por visitar el portal, hasta luego.");

				break;

			}
			lector.close();
		}
	}
}
	