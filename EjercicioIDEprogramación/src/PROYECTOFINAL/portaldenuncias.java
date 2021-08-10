package PROYECTOFINAL;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class portaldenuncias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		int i;

		int max_usuarios = 10000;
		int persona = 0;
		int contador = 0;
		int contador1 = 0;

		String admin = "ELBICHO";
		String contradmin = "chiguiro24";
		String email2;

		String[][] comunicacion = new String[3][3];
		comunicacion[0][0] = "Correo electronico";
		comunicacion[0][1] = "juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co";
		comunicacion[1][0] = "Numero telefónico y mensaje de texto";
		comunicacion[1][1] = "3186517640 - 3219113875 - 3114671293";

		personas[] pArray = new personas[max_usuarios];
		personas[] temporalArray = new personas[max_usuarios];

		do {
			personas pu = new personas();

			System.out.println(
					"Bienvenido a tu denUNcia, el portal diseñado por y para que los estudiantes sean atendidos oportunamente");
			System.out.println(
					"Tu denUNcia es un proyecto desarrollado por 3 estudiantes de ingeniería química de la universidad nacional de Colombia");
			System.out.println(
					"con el proposito de asegurar la adecuada respuesta a las muchas denuncias que se hacen hoy en día y suelen quedar en el olvido");
			System.out.println(
					"es así como el portal pretende dar cumplimiento adecuado a los derechos fundamentales y evita que en los casos que se vean incumplidos");
			System.out.println("se quede en el olvido");
			System.out.println(" ");
			System.out.println("Para poder acceder a la plataforma introduzca su correo institucional: ");
			email2 = lector.nextLine();
			Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
							+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
			String[] Arrayss = email2.split("@");
			if (ValidarMail(email2) == true) {
			if (Arrayss[1].equals("unal.edu.co")) {

			System.out.println(" ¿Desea acceder a las funciones avanzadas como administrador?(SI o NO)");

			String inicio = lector.nextLine();
			if (inicio.equalsIgnoreCase("si")) {
				System.out.println("Indique el usuario ");
				String adminentr = lector.nextLine();
				System.out.println("Indique la contraseña ");
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
						for (personas g : pArray) {
							if (g != null) {
								System.out.println("Denuncia presentada por \"" + g.nombre
										+ "\", identificado con el documento \"" + g.cedula +"la edad del denunciante es de "+g.edad+ "\", hecha en \""
										+ g.ciudad + "\", el \"" + g.fecha + "\", cuya descripción es \""
										+ g.descripcion + "\" el numero de contacto del denunciante es:" + g.contacto
										+ "el nombre y/o descripcion del victimario es " + g.victimario);
							} else
								break;
						}
						break;
					case "Ordenar":
						System.out.println(
								"Estimado admin " + admin + "a continuación ordenara todas las denuncias del portal");
						System.out.println("Desea ordenar según \" FECHA \" o por \"EDAD\"");

						String orden = lector.nextLine();

						if (orden.equalsIgnoreCase("FECHA")) {
							System.out
									.println("Desea ordenar por \"MAS RECIENTES PRIMERO\" o \"MAS ANTIGUOS PRIMERO\"");
							String orden_fecha = lector.nextLine();
							if (orden_fecha.equalsIgnoreCase("MAS ANTIGUOS PRIMERO")) {
								do {
									contador = 0;
									int temporal;
									for (int c = 0, d = 1; c < pArray.length; c++, d++) {
										personas cp = new personas();
										personas cd = new personas();

										if ((pArray[c] != null) && (pArray[d] != null)) {
											if (cp.getFecha(pArray[c].fecha).before(cd.getFecha(pArray[d].fecha))) {
											} else if (cp.getFecha(pArray[c].fecha)
													.after(cd.getFecha(pArray[d].fecha))) {
												temporal = d;
												temporalArray[temporal] = pArray[d];
												pArray[d] = pArray[c];
												pArray[c] = temporalArray[temporal];
												contador++;

											}
										} else
											break;
									}
								} while (contador > 0);

								for (personas g : pArray) {
									if (g != null) {
										System.out.println("Denuncia presentada por \"" + g.nombre
												+ "\", identificado con el documento \"" + g.cedula + "la edad del denunciante es de "+g.edad+ "\", hecha en \""
												+ g.ciudad + "\", el \"" + g.fecha + "\", cuya descripción es \""
												+ g.descripcion + "\" el numero de contacto del denunciante es :"
												+ g.contacto);
									} else
										break;
								}

							} else if (orden_fecha.equalsIgnoreCase("MAS RECIENTES PRIMERO")) {
								do {
									contador = 0;
									int temporal;
									for (int c = 0, d = 1; c < pArray.length; c++, d++) {
										personas cp = new personas();
										personas cd = new personas();

										if ((pArray[c] != null) && (pArray[d] != null)) {
											if (cp.getFecha(pArray[c].fecha).after(cd.getFecha(pArray[d].fecha))) {
											} else if (cp.getFecha(pArray[c].fecha)
													.before(cd.getFecha(pArray[d].fecha))) {
												temporal = d;
												temporalArray[temporal] = pArray[d];
												pArray[d] = pArray[c];
												pArray[c] = temporalArray[temporal];
												contador++;

											}
										} else
											break;
									}
								} while (contador > 0);

								for (personas g : pArray) {
									if (g != null) {
										System.out.println("Denuncia presentada por \"" + g.nombre
												+ "\", identificado con el documento \"" + g.cedula +"la edad del denunciante es de "+g.edad+ "\", hecha en \""
												+ g.ciudad + "\", el \"" + g.fecha + "\", cuya descripción es \""
												+ g.descripcion + "\" el numero de contacto del denunciante es:"
												+ g.contacto + " el nombre y/o descripcion del victimario es "
												+ g.victimario);
									} else
										break;
								}

							}
						} else if (orden.equalsIgnoreCase("edad")) {
							System.out
									.println("Desea organizar por \"MÁS JOVENES PRIMERO\" o \"MAS LONGEVOS PRIMERO\".");
							String orden2 = lector.nextLine();
							if (orden2.equalsIgnoreCase("MAS JOVENES PRIMERO")) {
								do {
									contador = 0;
									int temporal;
									for (int c = 0, d = 1; c < pArray.length; c++, d++) {
										persona ca = new persona();
										persona cb = new persona();
										if ((pArray[c] != null) && (pArray[d] != null)) {
											if (Integer.parseInt(pArray[c].edad) > Integer.parseInt(pArray[d].edad)) {
												temporal = d;
												temporalArray[temporal] = pArray[d];
												pArray[d] = pArray[c];
												pArray[c] = temporalArray[temporal];
												contador++;
											}
										}
									}
								} while (contador > 0);

								for (personas h : pArray) {
									if (h != null) {
										System.out.println("Denuncia presentada por \"" + h.nombre
												+ "\", identificado con el documento \"" + h.cedula +"la edad del denunciante es de "+h.edad+ "\", hecha en \""
												+ h.ciudad + "\", el \"" + h.fecha + "\", cuya descripción es \""
												+ h.descripcion + "\" el numero de contacto del denunciante es:"
												+ h.contacto+ " el nombre y/o descripcion del victimario es "
												+ h.victimario);
									} else
										break;
								}
							} else if (orden2.equalsIgnoreCase("MAS LONGEVOS PRIMERO")) {
								do {
									contador = 0;
									int temporal;
									for (int c = 0, d = 1; c < pArray.length; c++, d++) {
										persona ca = new persona();
										persona cb = new persona();
										if ((pArray[c] != null) && (pArray[d] != null)) {
											if (Integer.parseInt(pArray[c].edad) < Integer.parseInt(pArray[d].edad)) {
												temporal = d;
												temporalArray[temporal] = pArray[d];
												pArray[d] = pArray[c];
												pArray[c] = temporalArray[temporal];
												contador++;
											}
										}
									}
								} while (contador > 0);

							}
							for (personas h : pArray) {
								if (h != null) {
									System.out.println("Denuncia presentada por \"" + h.nombre
											+ "\", identificado con el documento \"" + h.cedula + "la edad del denunciante es de "+h.edad+"\", hecha en \""
											+ h.ciudad + "\", el \"" + h.fecha + "\", cuya descripción es \""
											+ h.descripcion + "\" el numero de contacto del denunciante es:"
											+ h.contacto);
								} else
									break;
							}

						} else
							break;

					case "borrar":
						System.out
								.println("Estimado admin " + admin + "a continuación borrará las denuncias del portal");
						break;

					}
				} else {
					System.out.println("Usuario y/o contraseña erroneos ");
				}
			}

			else if (inicio.equalsIgnoreCase("no")) {

				System.out.println(
						" Bienvenido al portal del sistema de denuncias, por favor ingrese sus nombres y sus apellidos ");

				pu.setNombre(lector.nextLine());

				System.out.println(" Bienvenido, " + pu.getNombre(pu.nombre)
						+ " ¿Desea ingresar una denuncia, consultar el estado de una,  cerrar sesión o solicitar ayuda ? ( RESPONDA CON \"consultar\", con \"denunciar\", con \"finalizar\" o con \"ayuda\" según sea su caso ( sin espacios )) ");

				String respuesta = lector.nextLine();

				if (respuesta.equalsIgnoreCase("consultar")) {

					System.out.println(
							"Digite su numero de identificación Cedula de ciudadania, tajeta de identidad, registro civil, pasaporte, etc");

					pu.setCedula(lector.nextInt());

					for (i = 0; i < max_usuarios; i++) {
						if (pArray[i].cedula == pu.cedula) { // PArray[i].getCedula(p.cedula)
							System.out.println(" la denuncia hecha fue realizada por:\"" + pArray[i].nombre
									+ "\" su cedula es: \"" + pArray[i].cedula + "\" su edad: \"" + pArray[i].edad
									+ "\" la ciudad en que sucedio el problema:\"" + pArray[i].ciudad
									+ "\" su tipo de denuncia fue: \"" + pArray[i].tipoDenuncia
									+ "\"  lo que sucedio fue: \"" + pArray[i].descripcion
									+ ", la fecha de ingreso de su denuncia fue" + pArray[i].fecha
									+ "y su numero de contacto es " + pArray[i].contacto
									+ " el nombre y/o descripcion del victimario es " + pArray[i].victimario);
							break;
						}

					}
					if (i >= max_usuarios) {
						System.out
								.println("No se encontró una denuncia con ese número de documento, intente nuevamente");
					}

				}

				else if (respuesta.equalsIgnoreCase("denunciar")) {

					System.out.println("Bienvenido al servicio de denuncias " + pu.nombre
							+ ", a continuación se iniciará el proceso para registrar una denuncia");

					System.out.println(
							"Digite su numero de documento (cedula de ciudadania, tarjeta de identidad, registro civil, pasaporte, etc.)");
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

					System.out.println("Ingrese por favor un numero telefonico de contacto ejemplo: 3145607612");
					pu.setContaco(lector.nextLine());

					System.out.println("Ingrese un nombre y/o descripcion del victimario en caso de tenerla.");
					pu.setVictimario(lector.nextLine());

					System.out.println("Para formalizar la denuncia le recordaremos lo que ha escrito:");

					System.out.println("Su nombre es:\"" + pu.nombre + "\" su cedula es:\"" + pu.cedula
							+ "\" su edad: \"" + pu.edad + "\" la ciudad en que sucedio el problema:\"" + pu.ciudad
							+ "\" su tipo de denuncia fue: \"" + pu.tipoDenuncia + "\"  lo que sucedio fue: \""
							+ pu.descripcion + "\" y la fecha del registro de la denuncia es " + pu.fecha
							+ "\" para comunicarse con usted se tiene el numero " + pu.contacto
							+ " el nombre y/o descripcion del victimario es " + pu.victimario);

					System.out.println(
							"Si estos son los datos correctos escriba SI  o NO en caso de que haya  algun error");

					String respuesta2 = lector.nextLine();

					if (respuesta2.equalsIgnoreCase("SI")) {

						System.out.println(
								"Su denuncia ya ha sido cargada, gracias por visitar el portal, recuerde que puede comunicarse con nosotros a travez de los siguientes medios \\n"
										+ "Correo electronico: \\n "
										+ "juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co. \\nNumero telefónico y mensaje de texto 3186517640 - 3219113875 - 3114671293 ");

					} else if (respuesta2.equalsIgnoreCase("NO")) {

						System.out.println(
								"Registre que dato fue el incorrecto (edad,ciudad,suceso, descripcion,fecha,contacto o victimario) ");

						String respuesta3 = lector.nextLine();

						if (respuesta3.equalsIgnoreCase("edad")) {
							System.out.println("Usted seleccionó edad. Ingrese la correción del dato(edad)");
							pu.setEdad(lector.nextLine());
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equalsIgnoreCase("ciudad")) {
							System.out.println(" Usted seleccionó ciudad.Ingrese la correción del dato(ciudad)");
							pu.setCiudad(lector.nextLine());
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equalsIgnoreCase("suceso")) {
							System.out.println(
									"Usted seleccionó suceso. Ingrese la correción del dato(tipo de denuncia)");
							pu.setTipoDenuncia(lector.nextLine());
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equalsIgnoreCase("descripcion")) {
							System.out
									.println("Usted seleccionó descripción.Ingrese la correción del dato(descripcion)");
							pu.setDescripcion(lector.nextLine());
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equalsIgnoreCase("fecha")) {
							System.out.println(
									" Usted selecciono fecha. Ingrese la correción del dato( recuerde el formato requerido AAAA,MM,DD)");
							pu.setFecha(lector.nextLine());

							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equalsIgnoreCase("contacto")) {
							System.out.println(" Usted selecciono contacto. Ingrese la correción del dato");
							pu.setContaco(lector.nextLine());
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

						} else if (respuesta3.equalsIgnoreCase("victimario")) {
							System.out.println(" Usted selecciono victimario. Ingrese la correción del dato");

							pu.setVictimario(lector.nextLine());
							System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
						}

						System.out.println("Para cofirmar sus datos son los siguientes:");
						System.out.println("Su nombre es:\"" + pu.nombre + "\" su cedula es:\"" + pu.cedula
								+ "\" su edad: \"" + pu.edad + "\" la ciudad en que sucedio el problema:\"" + pu.ciudad
								+ "\" su tipo de denuncia fue: \"" + pu.tipoDenuncia + "\"  lo que sucedio fue: \""
								+ pu.descripcion + "\" y la fecha del registro de la denuncia es " + pu.fecha
								+ "\" para comunicarse con usted se tiene el numero " + pu.contacto
								+ "  el nombre y/o descripcion del victimario es  " + pu.victimario);

					}

					pArray[persona] = pu;

					++persona;

				} else if (respuesta.equalsIgnoreCase("finalizar")) {

					System.out.println("Gracias por visitar el portal tu denUNcia" + pu.nombre + ", hasta luego.");

				} else if (respuesta.equalsIgnoreCase("ayuda")) {

					System.out.println(
							"Para comunicarse con el administrador del portal cuenta con las siguientes opciones: Correo electronico: \"\r\n"
									+ " \"juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co. \n Numero telefónico y mensaje de texto 3186517640 - 3219113875 - 3114671293");

					System.out.println("Pronto tendra respuesta. Gracias por su atencion");

				}

			}

		} while (persona <= max_usuarios);

		System.out.println(
				"Estimado usuario,lamentamos informarle que el portal no pudo cargar su denuncia exitosamente debido a que se alcanzo la capacidad máxima del portal. Comuniquese con un administrador. ");
		System.out.println(
				"Para comunicarse con el administrador del portal cuenta con las siguientes opciones: Correo electronico: \"\r\n"
						+ " \"juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co.\\n Numero telefónico y mensaje de texto 3186517640 - 3219113875 - 3114671293");

		System.out.println("Pronto tendra respuesta. Gracias por su atencion");
		lector.close();

	}
}while (persona <= max_usuarios);

		System.out.println(
				"Estimado usuario,lamentamos informarle que el portal no pudo cargar su denuncia exitosamente debido a que se alcanzo la capacidad máxima del portal. Comuniquese con un administrador. ");
		System.out.println(
				"Para comunicarse con el administrador del portal cuenta con las siguientes opciones: Correo electronico: \"\r\n"
						+ " \"juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co.\\n Numero telefónico y mensaje de texto 3186517640 - 3219113875 - 3114671293");

		System.out.println("Pronto tendra respuesta. Gracias por su atencion");
		lector.close();
	}
	public static boolean ValidarMail(String email) {
	    // Patron para validar el email
	    Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");

	    Matcher mather = pattern.matcher(email);
	    return mather.find();
	}
}
