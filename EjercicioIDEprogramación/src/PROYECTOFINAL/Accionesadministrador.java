package PROYECTOFINAL;

import java.util.*;

public class Accionesadministrador {

	int max_usuarios;

// VALIDAR ADMINISTRADOR
	public boolean validarAdmin(String intentoUser, String intentoContraseña) {

		String AdminContraseña = "chiguiro24";
		String AdminUsuario = "ELBICHO";

		return (AdminContraseña.equals(intentoContraseña) && AdminUsuario.equals(intentoUser));
	}

// ACCIONES ADMINISTRADOR
	public personas[] AccionesAdmin(String admin, personas[] pArray, personas[] temporalArray) {
		Scanner lector = new Scanner(System.in);

		System.out.println("Bienvenido al area de administradores " + admin + "¿Qué desea hacer el día de hoy?");
		System.out.println(
				"Recuerde que puede:" +Consolecolors.RED+"Ver, Ordenar, Actualizar y Borrar"+Consolecolors.RESET+ "las denuncias. Indique la accion deseada  ");
		String respadmin = lector.nextLine();
		switch (respadmin) {
		case "Ver":
			ver(admin, pArray);
			break;
		case "Ordenar":
			pArray = ordenar(admin, pArray, temporalArray);
			break;
		case "Actualizar":
			actualizar(admin, pArray);
			break;
		case "Borrar":
			pArray = borrar(admin, pArray);
			break;
		}

		return pArray;
	}

// FUNCION VER
	public void ver(String admin, personas[] pArray) {
		System.out.println("Estimado admin " + admin + "a continuación vera todas las denuncias del portal");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		for (personas g : pArray) {
			if (g != null) {
				System.out.println("Denuncia presentada por \"" + Consolecolors.RED + " " + g.nombre + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "\", identificado con el documento \"" + Consolecolors.RED + " " + g.cedula + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "la edad del denunciante es de " + Consolecolors.RED + " " + g.edad + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "\", hecha en \"" + Consolecolors.RED + " " + g.ciudad + " " + Consolecolors.RESET
						+ "\", el \"" + Consolecolors.RED + " " + g.fecha + " " + Consolecolors.RESET
						+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET + "\", cuya descripción es \""
						+ Consolecolors.RED + " " + g.descripcion + " " + Consolecolors.RESET
						+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "\" \n el numero de contacto del denunciante es:" + Consolecolors.RED + " " + g.contacto + ""
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "el nombre y/o descripcion del victimario es " + Consolecolors.RED + " " + g.victimario + " "
						+ Consolecolors.RESET + "\n");
				System.out.println("El status de la denuncia es "+Consolecolors.RED+g.Status+Consolecolors.RESET);
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
			} else
				break;
		}
	}

// FUNCION ORDENAR
	public personas[] ordenar(String admin, personas[] pArray, personas[] temporalArray) {
		Scanner lector = new Scanner(System.in);
		int contador = 0;

		System.out.println("Estimado admin " + admin + "a continuación ordenara todas las denuncias del portal");
		System.out.println("Desea ordenar según \"FECHA \" o por \"EDAD\"");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		String orden = lector.nextLine();

		if (orden.equalsIgnoreCase("FECHA")) {
			System.out.println("Desea ordenar por \"MAS RECIENTES PRIMERO\" o \"MAS ANTIGUOS PRIMERO\"");
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
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
							} else if (cp.getFecha(pArray[c].fecha).after(cd.getFecha(pArray[d].fecha))) {
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
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
				for (personas g : pArray) {
					if (g != null) {
						System.out.println("Denuncia presentada por \"" + Consolecolors.RED + " " + g.nombre + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\", identificado con el documento \"" + Consolecolors.RED + " " + g.cedula + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "la edad del denunciante es de " + Consolecolors.RED + " " + g.edad + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\", hecha en \"" + Consolecolors.RED + " " + g.ciudad + " " + Consolecolors.RESET
								+ "\", el \"" + Consolecolors.RED + " " + g.fecha + " " + Consolecolors.RESET
								+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\", cuya descripción es \"" + Consolecolors.RED + " " + g.descripcion + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\" \n el numero de contacto del denunciante es:" + Consolecolors.RED + " "
								+ g.contacto + "" + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
								+ Consolecolors.RESET + "el nombre y/o descripcion del victimario es "
								+ Consolecolors.RED + " " + g.victimario + " " + Consolecolors.RESET + "\n");
						System.out.println("El status de la denuncia es "+Consolecolors.RED+g.Status+Consolecolors.RESET);
						System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
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
							} else if (cp.getFecha(pArray[c].fecha).before(cd.getFecha(pArray[d].fecha))) {
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
					System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
					if (g != null) {
						System.out.println("Denuncia presentada por \"" + Consolecolors.RED + " " + g.nombre + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\", identificado con el documento \"" + Consolecolors.RED + " " + g.cedula + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "la edad del denunciante es de " + Consolecolors.RED + " " + g.edad + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\", hecha en \"" + Consolecolors.RED + " " + g.ciudad + " " + Consolecolors.RESET
								+ "\", el \"" + Consolecolors.RED + " " + g.fecha + " " + Consolecolors.RESET
								+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\", cuya descripción es \"" + Consolecolors.RED + " " + g.descripcion + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\" \n el numero de contacto del denunciante es:" + Consolecolors.RED + " "
								+ g.contacto + "" + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
								+ Consolecolors.RESET + "el nombre y/o descripcion del victimario es "
								+ Consolecolors.RED + " " + g.victimario + " " + Consolecolors.RESET + "\n");
						System.out.println("El status de la denuncia es "+Consolecolors.RED+g.Status+Consolecolors.RESET);
						System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
					} else
						break;
				}

			}
		} else if (orden.equalsIgnoreCase("edad")) {
			System.out.println("Desea organizar por \"MÁS JOVENES PRIMERO\" o \"MAS LONGEVOS PRIMERO\".");
			String orden2 = lector.nextLine();
			if (orden2.equalsIgnoreCase("MAS JOVENES PRIMERO")) {
				do {
					contador = 0;
					int temporal;
					for (int c = 0, d = 1; c < pArray.length; c++, d++) {
						personas ca = new personas();
						personas cb = new personas();
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
						System.out.println("Denuncia presentada por \"" + Consolecolors.RED + " " + h.nombre + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\", identificado con el documento \"" + Consolecolors.RED + " " + h.cedula + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "la edad del denunciante es de " + Consolecolors.RED + " " + h.edad + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\", hecha en \"" + Consolecolors.RED + " " + h.ciudad + " " + Consolecolors.RESET
								+ "\", el \"" + Consolecolors.RED + " " + h.fecha + " " + Consolecolors.RESET
								+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\", cuya descripción es \"" + Consolecolors.RED + " " + h.descripcion + " "
								+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
								+ "\" \n el numero de contacto del denunciante es:" + Consolecolors.RED + " "
								+ h.contacto + "" + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
								+ Consolecolors.RESET + "el nombre y/o descripcion del victimario es "
								+ Consolecolors.RED + " " + h.victimario + " " + Consolecolors.RESET + "\n");
						System.out.println("El status de la denuncia es "+Consolecolors.RED+h.Status+Consolecolors.RESET);
						System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
					} else
						break;
				}
			} else if (orden2.equalsIgnoreCase("MAS LONGEVOS PRIMERO")) {
				do {
					contador = 0;
					int temporal;
					for (int c = 0, d = 1; c < pArray.length; c++, d++) {
						personas ca = new personas();
						personas cb = new personas();
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
					System.out.println("Denuncia presentada por \"" + Consolecolors.RED + " " + h.nombre + " "
							+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
							+ "\", identificado con el documento \"" + Consolecolors.RED + " " + h.cedula + " "
							+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
							+ "la edad del denunciante es de " + Consolecolors.RED + " " + h.edad + " "
							+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
							+ "\", hecha en \"" + Consolecolors.RED + " " + h.ciudad + " " + Consolecolors.RESET
							+ "\", el \"" + Consolecolors.RED + " " + h.fecha + " " + Consolecolors.RESET
							+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET + "\", cuya descripción es \""
							+ Consolecolors.RED + " " + h.descripcion + " " + Consolecolors.RESET
							+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
							+ "\" \n el numero de contacto del denunciante es:" + Consolecolors.RED + " " + h.contacto
							+ "" + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
							+ "el nombre y/o descripcion del victimario es " + Consolecolors.RED + " " + h.victimario
							+ " " + Consolecolors.RESET + "\n");
					System.out.println("El status de la denuncia es "+Consolecolors.RED+h.Status+Consolecolors.RESET);
					System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
				} else
					break;
			}

		}

		return pArray;
	}

// FUNCION ACTUALIZAR
	public personas[] actualizar(String admin, personas[] pArray) {
		Scanner lector = new Scanner(System.in);
		personas pu = new personas();
		int temporal=0;
		System.out.println("Estimado administrador" + admin + "a continuacion actualizará las denuncias del portal");
		System.out.println("Recuerde que las denuncias que en el momento se encuentran presentes son:");
		for (personas g : pArray) {
			if (g != null) {
				System.out.println("Denuncia presentada por \"" + Consolecolors.RED + " " + g.nombre + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "\", identificado con el documento \"" + Consolecolors.RED + " " + g.cedula + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "la edad del denunciante es de " + Consolecolors.RED + " " + g.edad + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "\", hecha en \"" + Consolecolors.RED + " " + g.ciudad + " " + Consolecolors.RESET
						+ "\", el \"" + Consolecolors.RED + " " + g.fecha + " " + Consolecolors.RESET
						+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET + "\", cuya descripción es \""
						+ Consolecolors.RED + " " + g.descripcion + " " + Consolecolors.RESET
						+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "\" \n el numero de contacto del denunciante es:" + Consolecolors.RED + " " + g.contacto + ""
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "el nombre y/o descripcion del victimario es " + Consolecolors.RED + " " + g.victimario + " "
						+ Consolecolors.RESET + "\n");
				System.out.println("El status de la denuncia es "+Consolecolors.RED+g.Status+Consolecolors.RESET);
				System.out.println("El "+Consolecolors.RED+"codigo "+Consolecolors.RESET +" de la denuncia es " +g.code);
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
			} else
				break;
		}
		System.out.println("Indique el codigo de la denuncia a actualizar ");
		
	
		pu.setCode(lector.nextLine());
		
		
		
		for (int i = 0; i < max_usuarios; i++) {
			if (pArray[i].code.equals(pu.code)) { // PArray[i].getCedula(p.cedula)
				System.out.println(" la denuncia hecha fue realizada por:\" " + Consolecolors.RED + " "
						+ pArray[i].nombre + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
						+ Consolecolors.RESET + " \" su cedula es: \" " + Consolecolors.RED + " " + pArray[i].cedula
						+ " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ " \" su edad: \" " + Consolecolors.RED + " " + pArray[i].edad + " " + Consolecolors.RESET
						+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ " \" la ciudad en que sucedio el problema:\" " + Consolecolors.RED + " " + pArray[i].ciudad
						+ " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + " || " + Consolecolors.RESET
						+ " \" su tipo de denuncia fue: \" " + Consolecolors.RED + " " + pArray[i].tipoDenuncia + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ " \" \n lo que sucedio fue: \" " + Consolecolors.RED + " " + pArray[i].descripcion + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ " , la fecha de ingreso de su denuncia fue " + Consolecolors.RED + " " + pArray[i].fecha + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "  \n y su numero de contacto es " + Consolecolors.RED + " " + pArray[i].contacto + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ " el nombre y/o descripcion del victimario es " + Consolecolors.RED + " "
						+ pArray[i].victimario + " " + Consolecolors.RESET);
				System.out.println(Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ " Su denuncia actualmente tiene el status de " + Consolecolors.RED + pArray[i].Status
						+ Consolecolors.RESET + "\n");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
				
				 temporal = i;
				 
				break;
			}
		}
		System.out
				.println("Ingrese el nuevo status de la denuncia.(Recibida, tramitada, solucionada,prioritada o  NA)");
		
		pu=pArray[temporal];
		pu.setStatus(lector.nextLine());
		pArray[temporal]=pu;
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		System.out.println(
				"En caso de desear referir la denuncia hacia alguna division de la universidad:");
		System.out.println(
				"Recuerde que la universidad nacional de colombia tiene muchas divisiones si tiene alguna duda respecto a las mismas ");
		System.out.println("por favor escriba la palabra: divisiones ");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		String respdiv = lector.nextLine();
		
		if (respdiv.equalsIgnoreCase("divisiones")) {
			Mensajes.getDivisiones(Mensajes.DIVISIONES);
		} 

		return pArray;
	}

// FUNCIÓN BORRAR
	public static personas[] borrar(String admin, personas[] pArray) {
		System.out.println("Estimado admin " + admin + "a continuación borrará las denuncias del portal");
		System.out.println(" ");
		System.out.println("Recuerde que las denuncias que en el momento se encuentran presentes son:");
		for (personas g : pArray) {
			if (g != null) {
				System.out.println(
						" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
				System.out.println("Denuncia presentada por \"" + Consolecolors.RED + " " + g.nombre + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "\", identificado con el documento \"" + Consolecolors.RED + " " + g.cedula + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "la edad del denunciante es de " + Consolecolors.RED + " " + g.edad + " "
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "\", hecha en \"" + Consolecolors.RED + " " + g.ciudad + " " + Consolecolors.RESET
						+ "\", el \"" + Consolecolors.RED + " " + g.fecha + " " + Consolecolors.RESET
						+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET + "\", cuya descripción es \""
						+ Consolecolors.RED + " " + g.descripcion + " " + Consolecolors.RESET
						+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "\" \n el numero de contacto del denunciante es:" + Consolecolors.RED + " " + g.contacto + ""
						+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ "el nombre y/o descripcion del victimario es " + Consolecolors.RED + " " + g.victimario + " "
						+ Consolecolors.RESET + "\n");
				System.out.println("El status de la denuncia es "+Consolecolors.RED+g.Status+Consolecolors.RESET);

			} else
				break;

		}
		System.out.println(
				" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		System.out.println(
				"¿Desea seguir con el proceso? Si lo elimina tenga en cuenta que se eliminaran todas las denuncias"
						+ Consolecolors.RED + " si " + Consolecolors.RESET + "o " + Consolecolors.RED + "no)"
						+ Consolecolors.RESET);
		System.out.println(
				" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		Scanner lector = new Scanner(System.in);
		System.out.println(
				" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		String rta = lector.nextLine();
		if (rta.equalsIgnoreCase("si")) {
			pArray = null;

		} else {
			System.out.println("Las denuncias se mantendran en el portal");

		}
		return pArray;
	}

}
