package PROYECTOFINAL;

import java.util.*;

public class FuncionesAdministrador {
	int max_usuarios;

	// VALIDAR ADMINISTRADOR
	public boolean validarAdmin(String intentoUser, String intentoContraseña) {

		String AdminContraseña = "";
		String AdminUsuario = "";

		return (AdminContraseña.equals(intentoUser) && AdminUsuario.equals(intentoUser));
	}

	// ACCIONES ADMINISTRADOR
	public personas[] AccionesAdmin(String admin, personas[] pArray, personas[] temporalArray) {
		Scanner lector = new Scanner(System.in);

		System.out.println("Bienvenido al area de administradores " + admin + "¿Qué desea hacer el día de hoy?");
		System.out.println(
				"Recuerde que puede: Ver, Ordenar, Actualizar y Borrar las denuncias. Indique la accion deseada  ");
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
		for (personas g : pArray) {
			if (g != null) {
				System.out.println("Denuncia presentada por \"" + g.nombre + "\", identificado con el documento \""
						+ g.cedula + "la edad del denunciante es de " + g.edad + "\", hecha en \"" + g.ciudad
						+ "\", el \"" + g.fecha + "\", cuya descripción es \"" + g.descripcion
						+ "\" el numero de contacto del denunciante es:" + g.contacto
						+ "el nombre y/o descripcion del victimario es " + g.victimario);
			} else
				break;
		}
	}

	// FUNCION ORDENAR
	public personas[] ordenar(String admin, personas[] pArray, personas[] temporalArray) {
		Scanner lector = new Scanner(System.in);
		int contador = 0;

		System.out.println("Estimado admin " + admin + "a continuación ordenara todas las denuncias del portal");
		System.out.println("Desea ordenar según \" FECHA \" o por \"EDAD\"");

		String orden = lector.nextLine();

		if (orden.equalsIgnoreCase("FECHA")) {
			System.out.println("Desea ordenar por \"MAS RECIENTES PRIMERO\" o \"MAS ANTIGUOS PRIMERO\"");
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

				for (personas g : pArray) {
					if (g != null) {
						System.out.println(
								"Denuncia presentada por \"" + g.nombre + "\", identificado con el documento \""
										+ g.cedula + "la edad del denunciante es de " + g.edad + "\", hecha en \""
										+ g.ciudad + "\", el \"" + g.fecha + "\", cuya descripción es \""
										+ g.descripcion + "\" el numero de contacto del denunciante es :" + g.contacto);
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
					if (g != null) {
						System.out.println(
								"Denuncia presentada por \"" + g.nombre + "\", identificado con el documento \""
										+ g.cedula + "la edad del denunciante es de " + g.edad + "\", hecha en \""
										+ g.ciudad + "\", el \"" + g.fecha + "\", cuya descripción es \""
										+ g.descripcion + "\" el numero de contacto del denunciante es:" + g.contacto
										+ " el nombre y/o descripcion del victimario es " + g.victimario);
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
						System.out.println(
								"Denuncia presentada por \"" + h.nombre + "\", identificado con el documento \""
										+ h.cedula + "la edad del denunciante es de " + h.edad + "\", hecha en \""
										+ h.ciudad + "\", el \"" + h.fecha + "\", cuya descripción es \""
										+ h.descripcion + "\" el numero de contacto del denunciante es:" + h.contacto
										+ " el nombre y/o descripcion del victimario es " + h.victimario);
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
					System.out.println("Denuncia presentada por \"" + h.nombre + "\", identificado con el documento \""
							+ h.cedula + "la edad del denunciante es de " + h.edad + "\", hecha en \"" + h.ciudad
							+ "\", el \"" + h.fecha + "\", cuya descripción es \"" + h.descripcion
							+ "\" el numero de contacto del denunciante es:" + h.contacto);
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

		System.out.println("Estimado administrador" + admin + "a continuacion actualizará las denuncias del portal");
		System.out.println("Recuerde que las denuncias que en el momento se encuentran presentes son:");
		for (personas g : pArray) {
			if (g != null) {
				System.out.println("Denuncia presentada por \"" + g.nombre + "\", identificado con el documento \""
						+ g.cedula + "la edad del denunciante es de " + g.edad + "\", hecha en \"" + g.ciudad
						+ "\", el \"" + g.fecha + "\", cuya descripción es \"" + g.descripcion
						+ "\" el numero de contacto del denunciante es:" + g.contacto
						+ "el nombre y/o descripcion del victimario es " + g.victimario);
			} else
				break;
		}
		System.out.println("Indique el numero de documento de la denuncia a actualizar ");
		pu.setCedula(lector.nextInt());
		for (int i = 0; i < max_usuarios; i++) {
			if (pArray[i].cedula == pu.cedula) { // PArray[i].getCedula(p.cedula)
				System.out.println(" la denuncia hecha fue realizada por:\"" + pArray[i].nombre + "\" su cedula es: \""
						+ pArray[i].cedula + "\" su edad: \"" + pArray[i].edad
						+ "\" la ciudad en que sucedio el problema:\"" + pArray[i].ciudad
						+ "\" su tipo de denuncia fue: \"" + pArray[i].tipoDenuncia + "\"  lo que sucedio fue: \""
						+ pArray[i].descripcion + ", la fecha de ingreso de su denuncia fue" + pArray[i].fecha
						+ "y su numero de contacto es " + pArray[i].contacto
						+ " el nombre y/o descripcion del victimario es " + pArray[i].victimario);
				break;
			}
		}
		System.out
				.println("Ingrese el nuevo status de la denuncia.(Recibida, tramitada, solucionada,prioritada o  NA)");
		pu.setStatus(lector.nextLine());

		System.out.println(
				"En caso de que su denuncia ya haya sido enviada se le informa que fue referida hacia la division de ");
		System.out.println(
				"Recuerde que la universidad nacional de colombia tiene muchas divisiones si tiene alguna duda respecto a las mismas ");
		System.out.println("por favor escriba la palabra: divisiones ");
		String respdiv = lector.nextLine();
		if (respdiv.equalsIgnoreCase("divisiones")) {

		} else {
			System.out
					.println("Si ya tiene claro la division a la cual desea ingresar su denuncia por favor inscribala");
		}
		
		return pArray;
	}

	// FUNCIÓN BORRAR
	public static personas[] borrar(String admin, personas[] pArray) {
		System.out.println("Estimado admin " + admin + "a continuación borrará las denuncias del portal");
		return pArray;
	}

}
