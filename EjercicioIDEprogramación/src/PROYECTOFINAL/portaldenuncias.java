package PROYECTOFINAL;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class portaldenuncias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		int i;

		int max_usuarios = 100000;
		int persona = 0;
		int contador = 0;

		String admin = "ELBICHO";
		String contradmin = "chiguiro24";
		String email2;

		String[][] comunicacion = new String[3][3];
		comunicacion[0][0] = "Correo electronico";
		comunicacion[0][1] = "juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co";
		comunicacion[1][0] = "Numero telef�nico y mensaje de texto";
		comunicacion[1][1] = "3186517640 - 3219113875 - 3114671293";

		personas[] pArray = new personas[max_usuarios];
		personas[] temporalArray = new personas[max_usuarios];

		do {
			personas pu = new personas();

			System.out.println(
					"Bienvenido a tu denUNcia, el portal dise�ado por y para que los estudiantes sean atendidos oportunamente");
			System.out.println(
					"Tu denUNcia es un proyecto desarrollado por 3 estudiantes de ingenier�a qu�mica de la Universidad Nacional de Colombia en su sede Bogot�");
			System.out.println(
					"el portal se creo con el proposito de asegurar la adecuada respuesta a las muchas denuncias que se hacen hoy en d�a y quedan en el olvido.");
			System.out.println(
					"Es as� como el portal pretende dar cumplimiento adecuado a los derechos fundamentales y evita que en los casos que se vean incumplidos");
			System.out.println("no haya proceso alguno");
			System.out.println(" ");
			System.out.println("Bienvenido a la versi�n de la institucion Universidad Nacional ");
			System.out.println("Para poder acceder a la plataforma introduzca su correo institucional: ");
			email2 = lector.nextLine();
			Pattern pattern = Pattern.compile(
					"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");
			String[] Arrayss = email2.split("@");
			if (ValidarMail(email2) == true) {
				if (Arrayss[1].equals("unal.edu.co")) {
					System.out.println("Bienvenido a tu denUNcia!!!");

					System.out.println(" �Desea acceder a las funciones avanzadas como administrador?(SI o NO)");

					String inicio = lector.nextLine();
					if (inicio.equalsIgnoreCase("si")) {
						System.out.println("Indique el usuario ");
						String adminentr = lector.nextLine();
						System.out.println("Indique la contrase�a ");
						String contraadmin = lector.nextLine();
						if (contraadmin.equals(contradmin) && adminentr.equals(admin)) {
							System.out.println("Bienvenido al area de administradores " + admin
									+ "�Qu� desea hacer el d�a de hoy?");
							System.out.println(
									"Recuerde que puede: Ver, Ordenar, Actualizar y Borrar las denuncias. Indique la accion deseada  ");
							String respadmin = lector.nextLine();
							switch (respadmin) {
							case "Ver":
								System.out.println("Estimado admin " + admin
										+ "a continuaci�n vera todas las denuncias del portal");
								for (personas g : pArray) {
									if (g != null) {
										System.out.println("Denuncia presentada por \"" + g.nombre
												+ "\", identificado con el documento \"" + g.cedula
												+ "la edad del denunciante es de " + g.edad + "\", hecha en \""
												+ g.ciudad + "\", el \"" + g.fecha + "\", cuya descripci�n es \""
												+ g.descripcion + "\" el numero de contacto del denunciante es:"
												+ g.contacto + "el nombre y/o descripcion del victimario es "
												+ g.victimario);
									} else
										break;
								}
								break;
							case "Ordenar":
								System.out.println("Estimado admin " + admin
										+ "a continuaci�n ordenara todas las denuncias del portal");
								System.out.println("Desea ordenar seg�n \" FECHA \" o por \"EDAD\"");

								String orden = lector.nextLine();

								if (orden.equalsIgnoreCase("FECHA")) {
									System.out.println(
											"Desea ordenar por \"MAS RECIENTES PRIMERO\" o \"MAS ANTIGUOS PRIMERO\"");
									String orden_fecha = lector.nextLine();
									if (orden_fecha.equalsIgnoreCase("MAS ANTIGUOS PRIMERO")) {
										do {
											contador = 0;
											int temporal;
											for (int c = 0, d = 1; c < pArray.length; c++, d++) {
												personas cp = new personas();
												personas cd = new personas();

												if ((pArray[c] != null) && (pArray[d] != null)) {
													if (cp.getFecha(pArray[c].fecha)
															.before(cd.getFecha(pArray[d].fecha))) {
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
														+ "\", identificado con el documento \"" + g.cedula
														+ "la edad del denunciante es de " + g.edad + "\", hecha en \""
														+ g.ciudad + "\", el \"" + g.fecha
														+ "\", cuya descripci�n es \"" + g.descripcion
														+ "\" el numero de contacto del denunciante es :" + g.contacto);
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
													if (cp.getFecha(pArray[c].fecha)
															.after(cd.getFecha(pArray[d].fecha))) {
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
														+ "\", identificado con el documento \"" + g.cedula
														+ "la edad del denunciante es de " + g.edad + "\", hecha en \""
														+ g.ciudad + "\", el \"" + g.fecha
														+ "\", cuya descripci�n es \"" + g.descripcion
														+ "\" el numero de contacto del denunciante es:" + g.contacto
														+ " el nombre y/o descripcion del victimario es "
														+ g.victimario);
											} else
												break;
										}

									}
								} else if (orden.equalsIgnoreCase("edad")) {
									System.out.println(
											"Desea organizar por \"M�S JOVENES PRIMERO\" o \"MAS LONGEVOS PRIMERO\".");
									String orden2 = lector.nextLine();
									if (orden2.equalsIgnoreCase("MAS JOVENES PRIMERO")) {
										do {
											contador = 0;
											int temporal;
											for (int c = 0, d = 1; c < pArray.length; c++, d++) {
												persona ca = new persona();
												persona cb = new persona();
												if ((pArray[c] != null) && (pArray[d] != null)) {
													if (Integer.parseInt(pArray[c].edad) > Integer
															.parseInt(pArray[d].edad)) {
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
														+ "\", identificado con el documento \"" + h.cedula
														+ "la edad del denunciante es de " + h.edad + "\", hecha en \""
														+ h.ciudad + "\", el \"" + h.fecha
														+ "\", cuya descripci�n es \"" + h.descripcion
														+ "\" el numero de contacto del denunciante es:" + h.contacto
														+ " el nombre y/o descripcion del victimario es "
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
													if (Integer.parseInt(pArray[c].edad) < Integer
															.parseInt(pArray[d].edad)) {
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
													+ "\", identificado con el documento \"" + h.cedula
													+ "la edad del denunciante es de " + h.edad + "\", hecha en \""
													+ h.ciudad + "\", el \"" + h.fecha + "\", cuya descripci�n es \""
													+ h.descripcion + "\" el numero de contacto del denunciante es:"
													+ h.contacto);
										} else
											break;
									}

								} else
									break;
							case "Actualizar":
								System.out.println("Estimado administrador" + admin
										+ "a continuacion actualizar� las denuncias del portal");
								System.out.println(
										"Recuerde que las denuncias que en el momento se encuentran presentes son:");
								for (personas g : pArray) {
									if (g != null) {
										System.out.println("Denuncia presentada por \"" + g.nombre
												+ "\", identificado con el documento \"" + g.cedula
												+ "la edad del denunciante es de " + g.edad + "\", hecha en \""
												+ g.ciudad + "\", el \"" + g.fecha + "\", cuya descripci�n es \""
												+ g.descripcion + "\" el numero de contacto del denunciante es:"
												+ g.contacto + "el nombre y/o descripcion del victimario es "
												+ g.victimario);
									} else
										break;
								}
								System.out.println("Indique el numero de documento de la denuncia a actualizar ");
								pu.setCedula(lector.nextInt());
								for (i = 0; i < max_usuarios; i++) {
									if (pArray[i].cedula == pu.cedula) { // PArray[i].getCedula(p.cedula)
										System.out.println(" la denuncia hecha fue realizada por:\"" + pArray[i].nombre
												+ "\" su cedula es: \"" + pArray[i].cedula + "\" su edad: \""
												+ pArray[i].edad + "\" la ciudad en que sucedio el problema:\""
												+ pArray[i].ciudad + "\" su tipo de denuncia fue: \""
												+ pArray[i].tipoDenuncia + "\"  lo que sucedio fue: \""
												+ pArray[i].descripcion + ", la fecha de ingreso de su denuncia fue"
												+ pArray[i].fecha + "y su numero de contacto es " + pArray[i].contacto
												+ " el nombre y/o descripcion del victimario es "
												+ pArray[i].victimario);
										break;
									}
								}
								System.out.println(
										"Ingrese el nuevo status de la denuncia.(Recibida, tramitada, solucionada,prioritada o  NA)");
								pu.setStatus(lector.nextLine());

								System.out.println(
										"En caso de que su denuncia ya haya sido enviada se le informa que fue referida hacia la division de ");
								System.out.println(
										"Recuerde que la universidad nacional de colombia tiene muchas divisiones si tiene alguna duda respecto a las mismas ");
								System.out.println("por favor escriba la palabra: divisiones ");
								String respdiv = lector.nextLine();
								if (respdiv.equalsIgnoreCase("divisiones")) {

								} else {
									System.out.println(
											"Si ya tiene claro la division a la cual desea ingresar su denuncia por favor inscribala");
								}
							case "borrar":
								System.out.println(
										"Estimado admin " + admin + "a continuaci�n borrar� las denuncias del portal");
								break;

							}
						} else {
							System.out.println("Usuario y/o contrase�a erroneos ");
						}
					}

					else if (inicio.equalsIgnoreCase("no")) {

						System.out.println(
								" Bienvenido al portal del sistema de denuncias, por favor ingrese sus nombres y sus apellidos ");

						pu.setNombre(lector.nextLine());

						System.out.println(" Bienvenido, " + pu.getNombre(pu.nombre)
								+ " �Desea ingresar una denuncia, consultar el estado de una,  cerrar sesi�n o solicitar ayuda ? ( RESPONDA CON \"consultar\", con \"denunciar\", con \"finalizar\" o con \"ayuda\" seg�n sea su caso ( sin espacios )) ");

						String respuesta = lector.nextLine();

						if (respuesta.equalsIgnoreCase("consultar")) {

							System.out.println(
									"Digite su numero de identificaci�n Cedula de ciudadania, tajeta de identidad, registro civil, pasaporte, etc");

							pu.setCedula(lector.nextInt());

							for (i = 0; i < max_usuarios; i++) {
								if (pArray[i].cedula == pu.cedula) { // PArray[i].getCedula(p.cedula)
									System.out.println(" la denuncia hecha fue realizada por:\"" + pArray[i].nombre
											+ "\" su cedula es: \"" + pArray[i].cedula + "\" su edad: \""
											+ pArray[i].edad + "\" la ciudad en que sucedio el problema:\""
											+ pArray[i].ciudad + "\" su tipo de denuncia fue: \""
											+ pArray[i].tipoDenuncia + "\"  lo que sucedio fue: \""
											+ pArray[i].descripcion + ", la fecha de ingreso de su denuncia fue"
											+ pArray[i].fecha + "y su numero de contacto es " + pArray[i].contacto
											+ " el nombre y/o descripcion del victimario es " + pArray[i].victimario);
									System.out
											.println("Su denuncia actualmente tiene el status de " + pArray[i].Status);

									break;
								}

							}
							if (i >= max_usuarios) {
								System.out.println(
										"No se encontr� una denuncia con ese n�mero de documento, intente nuevamente");
							}

						}

						else if (respuesta.equalsIgnoreCase("denunciar")) {

							System.out.println("Bienvenido al servicio de denuncias " + pu.nombre
									+ ", a continuaci�n se iniciar� el proceso para registrar una denuncia");

							System.out.println(
									"Digite su numero de documento (cedula de ciudadania, tarjeta de identidad, registro civil, pasaporte, etc.)");
							pu.setCedula(lector.nextInt());

							String prueba = lector.nextLine();

							System.out.println("Digite su edad ");
							pu.setEdad(lector.nextLine());

							System.out.println("Escriba el nombre de la ciudad donde tuvo lugar el suceso ");

							pu.setCiudad(lector.nextLine());

							System.out.println("�Qu� suceso fue? (robo, estafa, enga�o, abuso, otro)");

							pu.setTipoDenuncia(lector.nextLine());

							System.out.println("Describa brevemente lo que sucedio:");
							pu.setDescripcion(lector.nextLine());

							System.out.println("Ingrese la fecha de hoy en formato AAAA,MM,DD ");
							pu.setFecha(lector.nextLine());

							System.out
									.println("Ingrese por favor un numero telefonico de contacto ejemplo: 3145607612");
							pu.setContacto(lector.nextLine());

							System.out.println("Ingrese un nombre y/o descripcion del victimario en caso de tenerla.");
							pu.setVictimario(lector.nextLine());
							System.out.println("Conoce usted cuales son los derechos fundamentales (si o no)");
							String respfund = lector.nextLine();
							if (respfund.equalsIgnoreCase("NO")) {

								System.out.println(
										"A continuacion se le dara un contexto a cuales son los derechos humanos fundamentales");
								System.out.println(
										"De manera que le quede mas claro identificar si alguno ha sido vulnerado o no ");
								System.out.println(
										"La declaraci�n universal de los derechos humanos fue proclamada por la Naciones Unidas en diciembre del a�o 1948");
								System.out.println(
										"Esta declaracion reconoce la dignidad intrinseca y los derechos iguales en todos los humanos del mundo");
								System.out
										.println("Esto se promulgo con el fin de evitar mas barbaries en la humanidad");
								System.out.println(
										"Esta declaraci�n tiene 30 articulos en las que se establecen los derechos humanos fundamentales e inalienables");
								System.out.println("Estos derechos son:");
								System.out.println(
										"Articulo 1:Todos los seres humanos nacen libres e iguales en dignidad y derechos y, dotados como est�n de raz�n y conciencia, deben comportarse fraternalmente los unos con los otros.");
								System.out.println(
										"Articulo 2:Toda persona tiene todos los derechos y libertades proclamados en esta Declaraci�n, sin distinci�n alguna de raza, color, sexo, idioma, religi�n, opini�n pol�tica o de cualquier otra �ndole, origen nacional o social, posici�n econ�mica, nacimiento o cualquier otra condici�n. Adem�s, no se har� distinci�n alguna fundada en la condici�n pol�tica, jur�dica o internacional del pa�s o territorio de cuya jurisdicci�n dependa una persona, tanto si se trata de un pa�s independiente, como de un territorio bajo administraci�n fiduciaria, no aut�nomo o sometido a cualquier otra limitaci�n de soberan�a.");
								System.out.println(
										"Articulo 3:Todo individuo tiene derecho a la vida, a la libertad y a la seguridad de su persona.");
								System.out.println(
										"Articulo 4:Nadie estar� sometido a esclavitud ni a servidumbre, la esclavitud y la trata de esclavos est�n prohibidas en todas sus formas.");
								System.out.println(
										"Articulo 5:Nadie ser� sometido a torturas ni a penas o tratos crueles, inhumanos o degradantes");
								System.out.println(
										"Articulo 6:Todo ser humano tiene derecho, en todas partes, al reconocimiento de su personalidad jur�dica");
								System.out.println(
										"Articulo 7:Todos son iguales ante la ley y tienen, sin distinci�n, derecho a igual protecci�n de la ley. Todos tienen derecho a igual protecci�n contra toda discriminaci�n que infrinja esta Declaraci�n y contra toda provocaci�n a tal discriminaci�n.");
								System.out.println(
										"Articulo 8: Toda persona tiene derecho a un recurso efectivo ante los tribunales nacionales competentes, que la ampare contra actos que violen sus derechos fundamentales reconocidos por la constituci�n o por la ley");
								System.out.println(
										"Articulo 9:Nadie podr� ser arbitrariamente detenido, preso ni desterrado.");
								System.out.println(
										"Articulo 10:Toda persona tiene derecho, en condiciones de plena igualdad, a ser o�da p�blicamente y con justicia por un tribunal independiente e imparcial, para la determinaci�n de sus derechos y obligaciones o para el examen de cualquier acusaci�n contra ella en materia penal.");
								System.out.println(
										"Articulo 11:1. Toda persona acusada de delito tiene derecho a que se presuma su inocencia mientras no se pruebe su culpabilidad, conforme a la ley y en juicio p�blico en el que se le hayan asegurado todas las garant�as necesarias para su defensa.\r\n"
												+ "2. Nadie ser� condenado por actos u omisiones que en el momento de cometerse no fueron delictivos seg�n el Derecho nacional o internacional. Tampoco se impondr� pena m�s grave que la aplicable en el momento de la comisi�n del delito.");
								System.out.println(
										"Articulo 12:Nadie ser� objeto de injerencias arbitrarias en su vida privada, su familia, su domicilio o su correspondencia, ni de ataques a su honra o a su reputaci�n. Toda persona tiene derecho a la protecci�n de la ley contra tales injerencias o ataques.");
								System.out.println(
										"Articulo 13:1. Toda persona tiene derecho a circular libremente y a elegir su residencia en el territorio de un Estado.\r\n"
												+ "2. Toda persona tiene derecho a salir de cualquier pa�s, incluso del propio, y a regresar a su pa�s.");
								System.out.println(
										"Articulo 14:1. En caso de persecuci�n, toda persona tiene derecho a buscar asilo, y a disfrutar de �l, en cualquier pa�s.\r\n"
												+ "2. Este derecho no podr� ser invocado contra una acci�n judicial realmente originada por delitos comunes o por actos opuestos a los prop�sitos y principios de las Naciones Unidas.");
								System.out.println("Articulo 15:1. Toda persona tiene derecho a una nacionalidad.\r\n"
										+ "2. A nadie se privar� arbitrariamente de su nacionalidad ni del derecho a cambiar de nacionalidad.");
								System.out.println(
										"Articulo 16:1. Los hombres y las mujeres, a partir de la edad n�bil, tienen derecho, sin restricci�n alguna por motivos de raza, nacionalidad o religi�n, a casarse y fundar una familia, y disfrutar�n de iguales derechos en cuanto al matrimonio, durante el matrimonio y en caso de disoluci�n del matrimonio.\r\n"
												+ "2. S�lo mediante libre y pleno consentimiento de los futuros esposos podr� contraerse el matrimonio.\r\n"
												+ "3. La familia es el elemento natural y fundamental de la sociedad y tiene derecho a la protecci�n de la sociedad y del Estado.");
								System.out.println(
										"Articulo 17:1. Toda persona tiene derecho a la propiedad, individual y colectivamente.\r\n"
												+ "2. Nadie ser� privado arbitrariamente de su propiedad.");
								System.out.println(
										"Articulo 18:Toda persona tiene derecho a la libertad de pensamiento, de conciencia y de religi�n; este derecho incluye la libertad de cambiar de religi�n o de creencia, as� como la libertad de manifestar su religi�n o su creencia, individual y colectivamente, tanto en p�blico como en privado, por la ense�anza, la pr�ctica, el culto y la observancia.");
								System.out.println(
										"Articulo 19:Todo individuo tiene derecho a la libertad de opini�n y de expresi�n; este derecho incluye el de no ser molestado a causa de sus opiniones, el de investigar y recibir informaciones y opiniones, y el de difundirlas, sin limitaci�n de fronteras, por cualquier medio de expresi�n.");
								System.out.println(
										"Articulo 20: 1. Toda persona tiene derecho a la libertad de reuni�n y de asociaci�n pac�ficas.\r\n"
												+ "2. Nadie podr� ser obligado a pertenecer a una asociaci�n.");
								System.out.println(
										"Articulo 21:1. Toda persona tiene derecho a participar en el gobierno de su pa�s, directamente o por medio de representantes libremente escogidos.\r\n"
												+ "2. Toda persona tiene el derecho de acceso, en condiciones de igualdad, a las funciones p�blicas de su pa�s.\r\n"
												+ "3. La voluntad del pueblo es la base de la autoridad del poder p�blico; esta voluntad se expresar� mediante elecciones aut�nticas que habr�n de celebrarse peri�dicamente, por sufragio universal e igual y por voto secreto u otro procedimiento equivalente que garantice la libertad del voto.");
								System.out.println(
										"Articulo 22:Toda persona, como miembro de la sociedad, tiene derecho a la seguridad social, y a obtener, mediante el esfuerzo nacional y la cooperaci�n internacional, habida cuenta de la organizaci�n y los recursos de cada Estado, la satisfacci�n de los derechos econ�micos, sociales y culturales, indispensables a su dignidad y al libre desarrollo de su personalidad.");
								System.out.println(
										"Articulo 23: 1. Toda persona tiene derecho al trabajo, a la libre elecci�n de su trabajo, a condiciones equitativas y satisfactorias de trabajo y a la protecci�n contra el desempleo.\r\n"
												+ "2. Toda persona tiene derecho, sin discriminaci�n alguna, a igual salario por trabajo igual.\r\n"
												+ "3. Toda persona que trabaja tiene derecho a una remuneraci�n equitativa y satisfactoria, que le asegure, as� como a su familia, una existencia conforme a la dignidad humana y que ser� completada, en caso necesario, por cualesquiera otros medios de protecci�n social.\r\n"
												+ "4. Toda persona tiene derecho a fundar sindicatos y a sindicarse para la defensa de sus intereses.");
								System.out.println(
										"Articulo 24:Toda persona tiene derecho al descanso, al disfrute del tiempo libre, a una limitaci�n razonable de la duraci�n del trabajo y a vacaciones peri�dicas pagadas.");
								System.out.println(
										"Articulo 25:1. Toda persona tiene derecho a un nivel de vida adecuado que le asegure, as� como a su familia, la salud y el bienestar, y en especial la alimentaci�n, el vestido, la vivienda, la asistencia m�dica y los servicios sociales necesarios; tiene asimismo derecho a los seguros en caso de desempleo, enfermedad, invalidez, viudez, vejez u otros casos de p�rdida de sus medios de subsistencia por circunstancias independientes de su voluntad.\r\n"
												+ "2. La maternidad y la infancia tienen derecho a cuidados y asistencia especiales. Todos los ni�os, nacidos de matrimonio o fuera de matrimonio, tienen derecho a igual protecci�n social.");
								System.out.println(
										"Articulo 26:1. Toda persona tiene derecho a la educaci�n. La educaci�n debe ser gratuita, al menos en lo concerniente a la instrucci�n elemental y fundamental. La instrucci�n elemental ser� obligatoria. La instrucci�n t�cnica y profesional habr� de ser generalizada; el acceso a los estudios superiores ser� igual para todos, en funci�n de los m�ritos respectivos.\r\n"
												+ "2. La educaci�n tendr� por objeto el pleno desarrollo de la personalidad humana y el fortalecimiento del respeto a los derechos humanos y a las libertades fundamentales; favorecer� la comprensi�n, la tolerancia y la amistad entre todas las naciones y todos los grupos �tnicos o religiosos, y promover� el desarrollo de las actividades de las Naciones Unidas para el mantenimiento de la paz.\r\n"
												+ "3. Los padres tendr�n derecho preferente a escoger el tipo de educaci�n que habr� de darse a sus hijos");
								System.out.println(
										"Articulo 27:1. Toda persona tiene derecho a tomar parte libremente en la vida cultural de la comunidad, a gozar de las artes y a participar en el progreso cient�fico y en los beneficios que de �l resulten.\r\n"
												+ "2. Toda persona tiene derecho a la protecci�n de los intereses morales y materiales que le correspondan por raz�n de las producciones cient�ficas, literarias o art�sticas de que sea autora.");
								System.out.println(
										"Articulo 28:Toda persona tiene derecho a que se establezca un orden social e internacional en el que los derechos y libertades proclamados en esta Declaraci�n se hagan plenamente efectivos.");
								System.out.println(
										"Articulo 29:1. Toda persona tiene deberes respecto a la comunidad, puesto que s�lo en ella puede desarrollar libre y plenamente su personalidad.\r\n"
												+ "2. En el ejercicio de sus derechos y en el disfrute de sus libertades, toda persona estar� solamente sujeta a las limitaciones establecidas por la ley con el �nico fin de asegurar el reconocimiento y el respeto de los derechos y libertades de los dem�s, y de satisfacer las justas exigencias de la moral, del orden p�blico y del bienestar general en una sociedad democr�tica.\r\n"
												+ "3. Estos derechos y libertades no podr�n, en ning�n caso, ser ejercidos en oposici�n a los prop�sitos y principios de las Naciones Unidas.");
								System.out.println(
										"Articulo 30:Nada en esta Declaraci�n podr� interpretarse en el sentido de que confiere derecho alguno al Estado, a un grupo o a una persona, para emprender y desarrollar actividades o realizar actos tendientes a la supresi�n de cualquiera de los derechos y libertades proclamados en esta Declaraci�n.");

								System.out.println("Alguno de sus  derechos fundamentales ha sido vulnerado (si o no)");
								String respderecho = lector.nextLine();
								if (respderecho.equalsIgnoreCase("SI")) {
									System.out.println();
									System.out.println("Indique cual fue el derecho fundamental afectado");
									pu.setderecho(lector.nextLine());
								} else if (respderecho.equalsIgnoreCase("No")) {
									pu.setderecho(null);
								}
							} else if (respfund.equalsIgnoreCase("SI")) {
								System.out.println("Alguno de sus  derechos fundamentales ha sido vulnerado (si o no)");
								String respderecho2 = lector.nextLine();
								if (respderecho2.equalsIgnoreCase("SI")) {
									System.out.println();
									System.out.println("Indique cual fue el derecho fundamental afectado");
									pu.setderecho(lector.nextLine());
								} else if (respderecho2.equalsIgnoreCase("No")) {
									pu.setderecho(null);
								}
							}

							System.out.println("Para formalizar la denuncia le recordaremos lo que ha escrito:");

							System.out.println("Su nombre es:\"" + pu.nombre + "\" su cedula es:\"" + pu.cedula
									+ "\" su edad: \"" + pu.edad + "\" la ciudad en que sucedio el problema:\""
									+ pu.ciudad + "\" su tipo de denuncia fue: \"" + pu.tipoDenuncia
									+ "\"  lo que sucedio fue: \"" + pu.descripcion
									+ "\" y la fecha del registro de la denuncia es " + pu.fecha
									+ "\" para comunicarse con usted se tiene el numero " + pu.contacto
									+ " el nombre y/o descripcion del victimario es " + pu.victimario);

							System.out.println(
									"Si estos son los datos correctos escriba SI  o NO en caso de que haya  algun error");

							String respuesta2 = lector.nextLine();

							if (respuesta2.equalsIgnoreCase("SI")) {

								System.out.println(
										"Su denuncia ya ha sido cargada, gracias por visitar el portal, recuerde que puede comunicarse con nosotros a travez de los siguientes medios \\n"
												+ "Correo electronico: \\n "
												+ "juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co. \\nNumero telef�nico y mensaje de texto 3186517640 - 3219113875 - 3114671293 ");

							} else if (respuesta2.equalsIgnoreCase("NO")) {

								System.out.println(
										"Registre que dato fue el incorrecto (edad,ciudad,suceso, descripcion,fecha,contacto, victimario o derecho ) ");

								String respuesta3 = lector.nextLine();

								if (respuesta3.equalsIgnoreCase("edad")) {
									System.out.println("Usted seleccion� edad. Ingrese la correci�n del dato(edad)");
									pu.setEdad(lector.nextLine());
									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								} else if (respuesta3.equalsIgnoreCase("ciudad")) {
									System.out
											.println(" Usted seleccion� ciudad.Ingrese la correci�n del dato(ciudad)");
									pu.setCiudad(lector.nextLine());
									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								} else if (respuesta3.equalsIgnoreCase("suceso")) {
									System.out.println(
											"Usted seleccion� suceso. Ingrese la correci�n del dato(tipo de denuncia)");
									pu.setTipoDenuncia(lector.nextLine());
									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								} else if (respuesta3.equalsIgnoreCase("descripcion")) {
									System.out.println(
											"Usted seleccion� descripci�n.Ingrese la correci�n del dato(descripcion)");
									pu.setDescripcion(lector.nextLine());
									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								} else if (respuesta3.equalsIgnoreCase("fecha")) {
									System.out.println(
											" Usted selecciono fecha. Ingrese la correci�n del dato( recuerde el formato requerido AAAA,MM,DD)");
									pu.setFecha(lector.nextLine());

									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								} else if (respuesta3.equalsIgnoreCase("contacto")) {
									System.out.println(" Usted selecciono contacto. Ingrese la correci�n del dato");
									pu.setContacto(lector.nextLine());
									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

								} else if (respuesta3.equalsIgnoreCase("victimario")) {
									System.out.println(" Usted selecciono victimario. Ingrese la correci�n del dato");

									pu.setVictimario(lector.nextLine());
									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
								} else if (respuesta3.equalsIgnoreCase("derecho")) {
									System.out.println(" Usted selecciono derecho. Ingrese la correci�n del dato");

									pu.setderecho(lector.nextLine());
									System.out.println(
											"Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
								}

								System.out.println("Para cofirmar sus datos son los siguientes:");
								System.out.println("Su nombre es:\"" + pu.nombre + "\" su cedula es:\"" + pu.cedula
										+ "\" su edad: \"" + pu.edad + "\" la ciudad en que sucedio el problema:\""
										+ pu.ciudad + "\" su tipo de denuncia fue: \"" + pu.tipoDenuncia
										+ "\"  lo que sucedio fue: \"" + pu.descripcion
										+ "\" y la fecha del registro de la denuncia es " + pu.fecha
										+ "\" para comunicarse con usted se tiene el numero " + pu.contacto
										+ "  el nombre y/o descripcion del victimario es  " + pu.victimario);

							}

							pArray[persona] = pu;

							++persona;

						} else if (respuesta.equalsIgnoreCase("finalizar")) {

							System.out.println(
									"Gracias por visitar el portal tu denUNcia" + pu.nombre + ", hasta luego.");

						} else if (respuesta.equalsIgnoreCase("ayuda")) {

							System.out.println(
									"Para comunicarse con el administrador del portal cuenta con las siguientes opciones: Correo electronico: \"\r\n"
											+ " \"juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co. \n Numero telef�nico y mensaje de texto 3186517640 - 3219113875 - 3114671293");

							System.out.println("Pronto tendra respuesta. Gracias por su atencion");

						}

					}
				} else {
					System.out.println("Correo no valido, Intentelo nuevamente...");
					System.out.println("");
				}
			} else {
				System.out.println("Correo no valido, Intentelo nuevamente...");
				System.out.println("");
			}

		} while (persona <= max_usuarios);

		System.out.println(
				"Estimado usuario,lamentamos informarle que el portal no pudo cargar su denuncia exitosamente debido a que se alcanzo la capacidad m�xima del portal. Comuniquese con un administrador. ");
		System.out.println(
				"Para comunicarse con el administrador del portal cuenta con las siguientes opciones: Correo electronico: \"\r\n"
						+ " \"juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co.\\n Numero telef�nico y mensaje de texto 3186517640 - 3219113875 - 3114671293");

		System.out.println("Pronto tendra respuesta. Gracias por su atencion");
		lector.close();

	}

	public static boolean ValidarMail(String email) {
		// Patron para validar el email
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");

		Matcher mather = pattern.matcher(email);
		return mather.find();
	}
}
