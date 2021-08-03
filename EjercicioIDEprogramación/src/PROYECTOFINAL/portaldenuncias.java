package PROYECTOFINAL;

import java.util.*;

public class portaldenuncias {

	public static void main(String[] args) {
		
			int tamano;
			int i;

			int max_personas = 100;
			int persona = 0;

			String admin = "ELBICHO";
			String contradmin = "chiguiro24";

			String[][] usuario = new String[max_personas][6];

			String[][] comunicacion = new String[3][3];
			comunicacion[0][0] = "Correo electronico";
			comunicacion[0][1] = "juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co";
			comunicacion[1][0] = "Numero telefónico y mensaje de texto";
			comunicacion[1][1] = "3186517640- 3219113875-3114671293";

			Scanner lector = new Scanner(System.in);

			while (true) {
				System.out.println(
						"Bienvenido a tu denUNcia, el portal diseñado por y para que los estudiantes sean atendidos oportunamente");

				System.out.println(

						" ¿Desea acceder a las funciones avanzadas como administrador?(SI o NO)");

				String inicio = lector.nextLine();

				if (inicio.equals("si".toUpperCase()) || inicio.equals("si")) {
					System.out.println("Indique el usuario y la contraseña");
					String adminentr = lector.nextLine();
					String contraadmin = lector.nextLine();
					if (contraadmin.equals(contradmin) && adminentr.equals(admin)) {
						System.out.println(
								"Bienvenido al area de administradores " + admin + "¿Qué desea hacer el día de hoy?");
						System.out.println(
								"Recuerde que puede: Ver, Ordenar, Imprimir y borrar las denuncias. Indique la accion deseada  ");
						String respadmin = lector.nextLine();
						switch (respadmin) {
						case "Ver":
							System.out.println(
									"Estimado admin " + admin + "a continuación vera todas las denuncias del portal");
							break;
						case "Ordenar":
							System.out.println(
									"Estimado admin " + admin + "a continuación ordenara todas las denuncias del portal");
							break;
						case "Imprimir":
							System.out.println(
									"Estimado admin " + admin + "a continuación imprimira todas las denuncias del portal");
							break;
						case "borrar":
							System.out
									.println("Estimado admin " + admin + "a continuación borrará las denuncias del portal");
							break;

						}
					}
				}

				else {

					System.out.println(

							" Bienvenido al portal del sistema de denuncias, por favor ingrese sus nombres y sus apellidos ");

					String nombre = lector.nextLine();

					System.out.println(" Bienvenido, " + nombre
							+ " ¿Desea ingresar una denuncia, consultar el estado de una,  cerrar sesión o solicitar ayuda ? ( RESPONDA CON \"consultar\", con \"denunciar\", con \"finalizar\" o con \"ayuda\" según sea su caso ( sin espacios )) ");

					String respuesta = lector.nextLine();

					if (respuesta.equals("consultar")) {

						System.out.println("Digite su numero de identificación (Cedula de ciudadania)");

						String cedula = lector.nextLine();

						for (i = 0; i < max_personas; i++) {
							if (cedula.equals(usuario[i][0])) {
								System.out.println(" la denuncia hecha fue realizada por:\"" + nombre
										+ "\" su cedula es: \"" + usuario[i][0] + "\" su edad: \"" + usuario[i][1]
										+ "\" la ciudad en que sucedio el problema:\"" + usuario[i][2]
										+ "\"  lo que sucedio fue: \"" + usuario[i][3]
										+ "y la fecha de ingreso de su denuncia fue" + usuario[i][5]);
								break;
							}

						}
						if (i >= max_personas) {
							System.out.println("No se encontró una denuncia con ese número de documento");
						}

					}

					else if (respuesta.equals("denunciar")) {

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

								System.out.println("Ingrese la fecha de hoy: ejemplo día/mes/año ");

								usuario[persona][5] = lector.nextLine();
							}
							System.out.println("Entonces para formalizar la denuncia le recordaremos lo que ha escrito:");

							System.out.println("Su nombre es:\"" + nombre + "\" su cedula es:\"" + usuario[persona][0]
									+ "\" su edad: \"" + usuario[persona][1] + "\" la ciudad en que sucedio el problema:\""
									+ usuario[persona][2] + "\" y lo que sucedio fue:\"" + usuario[persona][3]
									+ "\" y la fecha del registro de la denuncia es " + usuario[persona][5] + "\" ");

							System.out.println(
									"Si estos son los datos correctos escriba SI (en mayusculas y sin espacios) o NO (en mayusculas y sin espacios) si hay algun error (tenga en cuenta que si dice \"NO\" debera rellenar el formulario completo nuevamente");

							String respuesta2 = lector.nextLine();

							if (respuesta2.equals("SI")) {

								System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
								++persona;

							}
							if (respuesta.equals("NO")) {

								System.out.println(
										"Registre que dato fue el incorrecto (edad,ciudad,suceso, descripcion,fecha) ");

								String respuesta3 = lector.nextLine();

								if (respuesta3.equals("edad")) {

									usuario[persona][1] = lector.nextLine();
									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								} else if (respuesta3.equals("ciudad")) {
									usuario[persona][2] = lector.nextLine();

									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								} else if (respuesta3.equals("suceso")) {
									usuario[persona][3] = lector.nextLine();

									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								} else if (respuesta3.equals("descripcion")) {
									usuario[persona][4] = lector.nextLine();

									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								} else if (respuesta3.equals("fecha")) {
									usuario[persona][5] = lector.nextLine();

									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								}

								System.out
										.println("Si ya terminó el registro de su denuncia, por favor, escriba \"STOP\".");
								String status = lector.nextLine();
								if (status.equals("STOP")) {
									break;
								}

							}
							++persona;
						}
						System.out.println("Estimado " + nombre
								+ "lamentamos informarle que el portal no pudo cargar su denuncia exitosamente debido a que se alcanzo la capacidad máxima del portal. Comuniquese con un administrador. ");
						System.out.println(
								"Para comunicarse con el administrador del portal cuenta con las siguientes opciones:"
										+ Arrays.toString(comunicacion));

						System.out.println("Pronto tendra respuesta. Gracias por su atencion");
					} else if (respuesta.equals("finalizar")) {

						System.out.println("Gracias por visitar el portal, hasta luego.");

						break;

					} else if (respuesta.equals("ayuda")) {

						System.out.println(
								"Para comunicarse con el administrador del portal cuenta con las siguientes opciones:"
										+ Arrays.toString(comunicacion));

						System.out.println("Pronto tendra respuesta. Gracias por su atencion");
						break;
					}

				}
			}
		}
}
	