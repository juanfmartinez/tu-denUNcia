package PROYECTOFINAL;

import java.util.*;

public class portaldenuncias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int i;

		int max_usuarios = 10;
		int persona = 0;
		int contador = 0;

		String admin = "ELBICHO";
		String contradmin = "chiguiro24";

		String[][] comunicacion = new String[3][3];
		comunicacion[0][0] = "Correo electronico";
		comunicacion[0][1] = "juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co";
		comunicacion[1][0] = "Numero telefónico y mensaje de texto";
		comunicacion[1][1] = "3186517640 - 3219113875 - 3114671293";

		persona[] pArray = new persona[max_usuarios];
		persona[] temporalArray= new persona[max_usuarios];

		do {
			persona pu = new persona();

			System.out.println("Bienvenido a tu denUNcia, el portal diseñado por y para que los estudiantes sean atendidos oportunamente");
			System.out.println(" ¿Desea acceder a las funciones avanzadas como administrador?(SI o NO)");

			String inicio = lector.nextLine();
			if (inicio.equalsIgnoreCase("si")) {
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
						System.out.println("Desea ordenar según \"FECHA DE RECEPCION DE LA DENUNCIA \" o por \"EDAD\"");

						String orden = lector.nextLine();
						if (orden.equalsIgnoreCase("FECHA DE RECEPCION DE LA DENUNCIA")) {
							do{
								contador=0;
								int temporal;
								for (int c = 0, d = 1; c < pArray.length; c++, d++) {
									persona cp = new persona();
									persona cd = new persona();

									if ((pArray[c] != null) && (pArray[d] != null)) {
										if (cp.getFecha(pArray[c].fecha).before(cd.getFecha(pArray[d].fecha))) {
										} else if (cp.getFecha(pArray[c].fecha).after(cd.getFecha(pArray[d].fecha))) {
											temporal = d;
											temporalArray[temporal] = pArray[d];
											pArray[d] = pArray[c];
											pArray[c] = temporalArray[temporal];
											contador++;

										}
									}
									else
										break;
								}
							} while (contador > 0);

							for (persona g : pArray) {
								if(g != null) {
								System.out.println(
										"Denuncia presentada por \"" + g.nombre + "\", identificado con el documento \""
												+ g.cedula + "\", hecha en \"" + g.ciudad + "\", el \"" + g.fecha
												+ "\", cuya descripción es \"" + g.descripcion + "\".");
							}
								else
									break;
							}

						}

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

			else if(inicio.equalsIgnoreCase("no")){

				System.out.println(" Bienvenido al portal del sistema de denuncias, por favor ingrese sus nombres y sus apellidos ");

				pu.setNombre(lector.nextLine());

				System.out.println(" Bienvenido, " + pu.getNombre(pu.nombre) + " ¿Desea ingresar una denuncia, consultar el estado de una,  cerrar sesión o solicitar ayuda ? ( RESPONDA CON \"consultar\", con \"denunciar\", o con \"ayuda\" según sea su caso ( sin espacios )) ");

				String respuesta = lector.nextLine();

				if (respuesta.equalsIgnoreCase("consultar")) {

					System.out.println("Digite su numero de identificación (Cedula de ciudadania)");

					pu.setCedula(lector.nextInt());

					for (i = 0; i < max_usuarios; i++) {
						if (pArray[i].cedula == pu.cedula) { // PArray[i].getCedula(p.cedula)
							System.out.println(" la denuncia hecha fue realizada por:\"" + pArray[i].nombre
									+ "\" su cedula es: \"" + pArray[i].cedula + "\" su edad: \"" + pArray[i].edad
									+ "\" la ciudad en que sucedio el problema:\"" + pArray[i].ciudad
									+ "\" su tipo de denuncia fue: \"" + pArray[i].tipoDenuncia
									+ "\"  lo que sucedio fue: \"" + pArray[i].descripcion
									+ "y la fecha de ingreso de su denuncia fue" + pArray[i].fecha);
							break;
						}

					}
					if (i >= max_usuarios) {
						System.out.println("No se encontró una denuncia con ese número de documento");
					}

				}

				else if (respuesta.equalsIgnoreCase("denunciar")) {

					System.out.println("Bienvenido al servicio de denuncias " + pu.nombre+ ", a continuación se iniciará el proceso para registrar una denuncia");

					// for (tamano = 0; tamano <= usuario.length; tamano++){

					System.out.println("Digite su cedula de ciudadania");
					pu.setCedula(lector.nextInt());

					String prueba = lector.nextLine();
					
					System.out.println("Digite su edad ");
					pu.setEdad(lector.nextLine());

					System.out.println("Escriba el nombre de la ciudad donde tuvo lugar el suceso ");
					pu.setCiudad(lector.nextLine());

					System.out.println("¿Qué suceso fue? (robo, estafa, engaño, abuso, otro)");
					pu.setTipoDenuncia(lector.nextLine());

					System.out.println("Describa brevemente lo que sucedio:");
					pu.setDescripcion(lector.nextLine());

					System.out.println("Ingrese la fecha de hoy en formato AAAA,MM,DD ");
					pu.setFecha(lector.nextLine());
					// }

					System.out.println("Entonces para formalizar la denuncia le recordaremos lo que ha escrito:");

					System.out.println("Su nombre es:\"" + pu.nombre + "\" su cedula es:\"" + pu.cedula
							+ "\" su edad: \"" + pu.edad + "\" la ciudad en que sucedio el problema:\"" + pu.ciudad
							+ "\" su tipo de denuncia fue: \"" + pu.tipoDenuncia + "\"  lo que sucedio fue: \""
							+ pu.descripcion + "\" y la fecha del registro de la denuncia es " + pu.fecha + "\" ");
 
					//do
					
					System.out.println(
							"Si estos son los datos correctos escriba SI (en mayusculas y sin espacios) o NO (en mayusculas y sin espacios) si hay algun error");

					String respuesta2 = lector.nextLine();

					if (respuesta2.equalsIgnoreCase("SI")) {

						System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

					} else if (respuesta2.equalsIgnoreCase("NO")) {

						System.out.println(
								"Registre que dato fue el incorrecto (edad,ciudad,suceso, descripcion,fecha) ");

						String respuesta3 = lector.nextLine();

						if (respuesta3.equalsIgnoreCase("edad")) {
							System.out.println("Ingrese la correción del dato(edad)");
							pu.setEdad(lector.nextLine());
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equals("ciudad")) {
							System.out.println("Ingrese la correción del dato(ciudad)");
							pu.setCiudad(lector.nextLine());
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equals("suceso")) {
							System.out.println("Ingrese la correción del dato(tipo de denuncia)");
							pu.setTipoDenuncia(lector.nextLine());
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equals("descripcion")) {
							System.out.println("Ingrese la correción del dato(descripcion)");
							pu.setDescripcion(lector.nextLine());
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equals("fecha")) {
							System.out.println("Ingrese la correción del dato(fecha en formato AAAA,MM,DD)");
							pu.setFecha(lector.nextLine());

							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						}
					}
					pArray[persona] = pu;
					++persona;

				} else if (respuesta.equalsIgnoreCase("finalizar")) {

					System.out.println("Gracias por visitar el portal, hasta luego.");

				} else if (respuesta.equalsIgnoreCase("ayudaaaaaa")) {

					System.out.println(
							"Para comunicarse con el administrador del portal cuenta con las siguientes opciones:"
									+ Arrays.toString(comunicacion));

					System.out.println("Pronto tendra respuesta. Gracias por su atencion");
				}

			}

		} while (persona < max_usuarios);

		System.out.println(
				"Estimado usuari,lamentamos informarle que el portal no pudo cargar su denuncia exitosamente debido a que se alcanzo la capacidad máxima del portal. Comuniquese con un administrador. ");
		System.out.println("Para comunicarse con el administrador del portal cuenta con las siguientes opciones:"
				+ Arrays.toString(comunicacion));

		System.out.println("Pronto tendra respuesta. Gracias por su atencion");
		lector.close();

	}
}
	