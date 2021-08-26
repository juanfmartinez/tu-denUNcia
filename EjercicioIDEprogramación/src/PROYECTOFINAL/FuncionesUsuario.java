package PROYECTOFINAL;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Accionesusuario {

	Scanner lector = new Scanner(System.in);
	/* MENSAJE BIENVENIDA */
	public void bienvenidageneral() {
		Mensajes.getMensajes(Mensajes.MENSAJE_AUTENTICACION_EMAIL);
		System.out.println(" ");
		System.out.println("Bienvenido a la versión de la institucion Universidad Nacional ");
		System.out.println("Para poder acceder a la plataforma introduzca su correo institucional: ");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		
	}

	/* VERIFICA EL FORMATO DE CORREO INSTITUCIONAL*/
	public boolean verif_correoINS(String email) {
		String[] Arrayss = email.split("@");
		
		return (Arrayss[1].equals("unal.edu.co")); //true;

		
	}
	 //VERIFICA FORMATO DE CORREO
	public boolean verif_correoFORM(String email) {
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");
		return /ValidarMail(email);/true;
		
		
		

		
	}
	

	// ACCIONES USUARIO
	public void AccionesUser(personas[] pArray, int persona) {
		Scanner lector = new Scanner(System.in);
		personas pu = new personas();
		System.out.println(
				" Bienvenido al portal del sistema de denuncias, por favor ingrese sus " + Consolecolors.RED
				+ "nombres " + Consolecolors.RESET + "y " + Consolecolors.RED + "apellidos" + Consolecolors.RESET);
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		pu.setNombre(lector.nextLine());
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		System.out.println(" Bienvenido, " + pu.getNombre(pu.nombre)
		+ " ¿Desea ingresar una denuncia, consultar el estado de una,  cerrar sesión o \n solicitar ayuda? "
		+ Consolecolors.RED
		+ " (responda con \"consultar\", \"denunciar\", \"finalizar\" \"ayuda\" según sea su caso.) "
		+ Consolecolors.RESET);
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		

		String respuesta = lector.nextLine();
		if (respuesta.equalsIgnoreCase("consultar")) {
			consultar(pArray);
		} else if (respuesta.equalsIgnoreCase("denunciar")) {
			pArray = denunciar(pArray, persona,pu.nombre);
		} else if (respuesta.equalsIgnoreCase("finalizar")) {
			finalizar(pu, pu.nombre);
		}
		else if (respuesta.equalsIgnoreCase("ayuda")) {
			ayuda(pu);
		}

	}

	public personas[] denunciar(personas[] pArray, int persona, String nombre) {
		Scanner lector = new Scanner(System.in);
		personas pu = new personas();
		pu.nombre = nombre;
		System.out.println("Bienvenido al servicio de denuncias " + Consolecolors.RED + pu.nombre + Consolecolors.RESET
				+ ", a continuación se iniciará el proceso para \n registrar una denuncia. \n");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		System.out.println("Digite su numero de documento " + Consolecolors.RED
				+ "(cedula de ciudadania, tarjeta de identidad, registro civil, pasaporte, etc.)"
				+ Consolecolors.RESET);
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		pu.setCedula(lector.nextInt());
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		String prueba = lector.nextLine();

		System.out.println("Digite su " + Consolecolors.RED + "edad " + Consolecolors.RESET);
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		pu.setEdad(lector.nextLine());
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		System.out.println("Escriba el nombre de la " + Consolecolors.RED + "ciudad" + Consolecolors.RESET
				+ " donde tuvo lugar el suceso ");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		pu.setCiudad(lector.nextLine());
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		System.out.println(
				"¿Qué suceso fue? " + Consolecolors.RED + "(robo, estafa, engaño, abuso, otro)" + Consolecolors.RESET);
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		pu.setTipoDenuncia(lector.nextLine());
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		System.out.println("Describa brevemente lo que sucedio:");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		pu.setDescripcion(lector.nextLine());
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		System.out.println(
				"Ingrese la fecha de hoy en formato " + Consolecolors.RED + "AAAA,MM,DD " + Consolecolors.RESET);
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		pu.setFecha(lector.nextLine());
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		System.out.println("Ingrese por favor un " + Consolecolors.RED + "numero telefonico" + Consolecolors.RESET
				+ " de contacto ejemplo: 3145607612");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		pu.setContacto(lector.nextLine());
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		System.out.println("Ingrese un nombre y/o descripcion del " + Consolecolors.RED + "victimario"
				+ Consolecolors.RESET + " en caso de tenerla.");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		pu.setVictimario(lector.nextLine());
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		System.out.println("Conoce usted cuales son" + Consolecolors.RED + " los derechos fundamentales "
				+ Consolecolors.RESET + Consolecolors.RED + " si " + Consolecolors.RESET + "o" + Consolecolors.RED
				+ " no )" + Consolecolors.RESET);
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		String respfund = lector.nextLine();
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		
		if (respfund.equalsIgnoreCase("NO")) {

		Mensajes.getDerechos(Mensajes.DERECHOS);
			System.out.println("Alguno de sus  derechos fundamentales ha sido vulnerado(" + Consolecolors.RED + " si "
					+ Consolecolors.RESET + "o" + Consolecolors.RED + " no )" + Consolecolors.RESET);
			String respderecho = lector.nextLine();
			if (respderecho.equalsIgnoreCase("SI")) {
				System.out.println();
				System.out.println("Indique cual fue el derecho fundamental afectado");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
				pu.setderecho(lector.nextLine());
			} else if (respderecho.equalsIgnoreCase("No")) {
				pu.setderecho("00");
			}
		} else if (respfund.equalsIgnoreCase("SI")) {
			System.out.println("Alguno de sus  derechos fundamentales ha sido vulnerado(" + Consolecolors.RED + " si "
					+ Consolecolors.RESET + "o" + Consolecolors.RED + " no )" + Consolecolors.RESET);
			
			String respderecho2 = lector.nextLine();
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
			if (respderecho2.equalsIgnoreCase("SI")) {
				System.out.println();
				System.out.println("Indique cual fue el derecho fundamental afectado");
				pu.setderecho(lector.nextLine());
			} else if (respderecho2.equalsIgnoreCase("No")) {
				pu.setderecho("00");
				
			}
		}

		System.out.println("Para formalizar la denuncia le recordaremos lo que ha escrito:");

		System.out.println("Su nombre es:\" " + Consolecolors.RED + " " + pu.nombre + " " + Consolecolors.RESET
				+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET + " \" su cedula es:\" "
				+ Consolecolors.RED + " " + pu.cedula + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND
				+ "||" + Consolecolors.RESET + "\" su edad: \" \n" + Consolecolors.RED + " " + pu.edad + " "
				+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
				+ " \"\n  la ciudad en que sucedio el problema:\"" + Consolecolors.RED + " " + pu.ciudad + " "
				+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
				+ " \" \n su tipo de denuncia fue: \" " + Consolecolors.RED + " " + pu.tipoDenuncia + " "
				+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
				+ "\"  lo que sucedio fue: \" " + Consolecolors.RED + " " + pu.descripcion + " "
				+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
				+ " \"\n y la fecha del registro de la denuncia es  " + Consolecolors.RED + " " + pu.fecha + " "
				+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
				+ " \"\n para comunicarse con usted se tiene el numero " + Consolecolors.RED + " " + pu.contacto
				+ " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
				+ " \n el nombre y/o descripcion del victimario es " + Consolecolors.RED + " " + pu.victimario + " "
				+ Consolecolors.RESET + "\n");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		System.out.println("Si estos son los datos correctos escriba SI  o NO en caso de que haya  algun error");

		String respuesta2 = lector.nextLine();
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		if (respuesta2.equalsIgnoreCase("SI")) {

			Mensajes.getDatos(Mensajes.DATOSCOM);
			System.out.println("Gracias por visitar el portal");
			System.out.println("");
					
		} else if (respuesta2.equalsIgnoreCase("NO")) {

			System.out.println(
					"Registre que dato fue el incorrecto" + Consolecolors.RED
					+ " (edad,ciudad,suceso, descripcion,fecha,contacto, victimario o derecho ) "
					+ Consolecolors.RESET);
			

			String respuesta3 = lector.nextLine();

			if (respuesta3.equalsIgnoreCase("edad")) {
				System.out.println("Usted seleccionó edad. Ingrese la correción del dato"+Consolecolors.RED+"(edad)"+Consolecolors.RESET);
				pu.setEdad(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
			} else if (respuesta3.equalsIgnoreCase("ciudad")) {
				System.out.println(" Usted seleccionó ciudad.Ingrese la correción del dato"+Consolecolors.RED+"(ciudad)"+Consolecolors.RESET);
				pu.setCiudad(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

			} else if (respuesta3.equalsIgnoreCase("suceso")) {
				System.out.println("Usted seleccionó suceso. Ingrese la correción del dato"+Consolecolors.RED+"(tipo de denuncia)"+Consolecolors.RESET);
				pu.setTipoDenuncia(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

			} else if (respuesta3.equalsIgnoreCase("descripcion")) {
				System.out.println("Usted seleccionó descripción.Ingrese la correción del dato"+Consolecolors.RED+"(descripcion)"+Consolecolors.RESET);
				pu.setDescripcion(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

			} else if (respuesta3.equalsIgnoreCase("fecha")) {
				System.out.println(
						" Usted selecciono" +Consolecolors.RED+"fecha."+Consolecolors.RESET +"Ingrese la correción del dato( recuerde el formato requerido AAAA,MM,DD)");
				pu.setFecha(lector.nextLine());

				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

			} else if (respuesta3.equalsIgnoreCase("contacto")) {
				System.out.println(" Usted selecciono" +Consolecolors.RED+"contacto."+Consolecolors.RESET+ "Ingrese la correción del dato");
				pu.setContacto(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

			} else if (respuesta3.equalsIgnoreCase("victimario")) {
				System.out.println(" Usted selecciono"+Consolecolors.RED+ "victimario."+Consolecolors.RESET+ "Ingrese la correción del dato");

				pu.setVictimario(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
			} else if (respuesta3.equalsIgnoreCase("derecho")) {
				System.out.println(" Usted selecciono"+Consolecolors.RED+ "derecho."+Consolecolors.RESET+ "Ingrese la correción del dato");

				pu.setderecho(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
			}

			System.out.println("Para comfirmar sus datos son los siguientes:");
			System.out.println("Su nombre es:\" " + Consolecolors.RED + " " + pu.nombre + " " + Consolecolors.RESET
					+ Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET + " \" su cedula es:\" "
					+ Consolecolors.RED + " " + pu.cedula + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND
					+ "||" + Consolecolors.RESET + "\" su edad: \" \n" + Consolecolors.RED + " " + pu.edad + " "
					+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
					+ " \"\n  la ciudad en que sucedio el problema:\"" + Consolecolors.RED + " " + pu.ciudad + " "
					+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
					+ " \" \n su tipo de denuncia fue: \" " + Consolecolors.RED + " " + pu.tipoDenuncia + " "
					+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
					+ "\"  lo que sucedio fue: \" " + Consolecolors.RED + " " + pu.descripcion + " "
					+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
					+ " \"\n y la fecha del registro de la denuncia es  " + Consolecolors.RED + " " + pu.fecha + " "
					+ Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
					+ " \"\n para comunicarse con usted se tiene el numero " + Consolecolors.RED + " " + pu.contacto
					+ " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
					+ " \n el nombre y/o descripcion del victimario es " + Consolecolors.RED + " " + pu.victimario + " "
					+ Consolecolors.RESET + "\n");
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
			System.out.println(" ");
		}
		
		pu.setCode(pu.getCode(pu.cedula, pu.fecha, pu.derecho));
		System.out.println("Su código para la denuncia es "+Consolecolors.RED+pu.code+Consolecolors.RESET);
		pArray[persona] = pu;

		return pArray;
	}

	// FUNCIÓN CONSULTAR
	public void consultar(personas[] pArray) {
		int i;
		Scanner lector = new Scanner(System.in);
		personas pu = new personas();
		
		System.out.println("¿Desea consultar usando su CODIGO o su DOCUMENTO?");
		String critBusqueda = lector.nextLine();
		if(critBusqueda.equalsIgnoreCase("DOCUMENTO")){

		System.out.println(
				"Digite su numero de identificación Cedula de ciudadania, tajeta de identidad, registro civil, pasaporte, etc");

		pu.setCedula(lector.nextInt());
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

		for (i = 0; i < pArray.length; i++) {
			if(pArray[i] != null) {
			if (pArray[i].cedula == pu.cedula) { // PArray[i].getCedula(p.cedula)
				System.out.println(" la denuncia hecha fue realizada por:\" " + Consolecolors.RED + " "
						+ pArray[i].nombre + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
						+ Consolecolors.RESET + " \"\n su cedula es: \" " + Consolecolors.RED + " "
						+ pArray[i].cedula + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
						+ Consolecolors.RESET + " \"\n su edad: \" " + Consolecolors.RED + " " + pArray[i].edad
						+ " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ " \" \nla ciudad en que sucedio el problema:\" " + Consolecolors.RED + " "
						+ pArray[i].ciudad + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + " || "
						+ Consolecolors.RESET + " \" su tipo de denuncia fue: \" " + Consolecolors.RED + " "
						+ pArray[i].tipoDenuncia + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
						+ Consolecolors.RESET + " \" \n lo que sucedio fue: \" " + Consolecolors.RED + " "
						+ pArray[i].descripcion + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
						+ Consolecolors.RESET + "\n , la fecha de ingreso de su denuncia fue " + Consolecolors.RED
						+ " " + pArray[i].fecha + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
						+ Consolecolors.RESET + "  \n y su numero de contacto es " + Consolecolors.RED + " "
						+ pArray[i].contacto + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
						+ Consolecolors.RESET + " el nombre y/o descripcion del victimario es " + Consolecolors.RED
						+ " " + pArray[i].victimario + " " + Consolecolors.RESET);
				System.out.println(Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
						+ " Su denuncia actualmente tiene el status de " + Consolecolors.RED + pArray[i].Status
						+ Consolecolors.RESET);
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
				break;
			}
		}
		}
		if (i >= pArray.length) {
			System.out.println("No se encontró una denuncia con ese número de documento, intente nuevamente");
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
		}
		}
		else if (critBusqueda.equalsIgnoreCase("CODIGO")){
			

			System.out.println(
					"Digite su codigo asignado.");

			pu.setCode(lector.nextLine());
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
			
			for (i = 0; i < pArray.length; i++) {
				if(pArray[i] != null) {
				if (pArray[i].code.equals(pu.code)) { // PArray[i].getCedula(p.cedula)
					System.out.println(" la denuncia hecha fue realizada por:\" " + Consolecolors.RED + " "
							+ pArray[i].nombre + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
							+ Consolecolors.RESET + " \"\n su cedula es: \" " + Consolecolors.RED + " "
							+ pArray[i].cedula + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
							+ Consolecolors.RESET + " \"\n su edad: \" " + Consolecolors.RED + " " + pArray[i].edad
							+ " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
							+ " \" \nla ciudad en que sucedio el problema:\" " + Consolecolors.RED + " "
							+ pArray[i].ciudad + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + " || "
							+ Consolecolors.RESET + " \" su tipo de denuncia fue: \" " + Consolecolors.RED + " "
							+ pArray[i].tipoDenuncia + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
							+ Consolecolors.RESET + " \" \n lo que sucedio fue: \" " + Consolecolors.RED + " "
							+ pArray[i].descripcion + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
							+ Consolecolors.RESET + "\n , la fecha de ingreso de su denuncia fue " + Consolecolors.RED
							+ " " + pArray[i].fecha + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
							+ Consolecolors.RESET + "  \n y su numero de contacto es " + Consolecolors.RED + " "
							+ pArray[i].contacto + " " + Consolecolors.RESET + Consolecolors.CYAN_BACKGROUND + "||"
							+ Consolecolors.RESET + " el nombre y/o descripcion del victimario es " + Consolecolors.RED
							+ " " + pArray[i].victimario + " " + Consolecolors.RESET);
					System.out.println(Consolecolors.CYAN_BACKGROUND + "||" + Consolecolors.RESET
							+ " Su denuncia actualmente tiene el status de " + Consolecolors.RED + pArray[i].Status
							+ Consolecolors.RESET);
					System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

					break;
				}
				}
			}
			if (i >= pArray.length) {
				System.out.println("No se encontró una denuncia con ese código, intente nuevamente");
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");
			}
			
		}

	}

	public void finalizar(personas pu, String nombre) {
		pu.nombre = nombre;
		System.out.println("Gracias por visitar el portal tu denUNcia" + pu.nombre + ", hasta luego.");
		System.exit(0);
	}

	public void ayuda(personas pu) {
		Mensajes.getDatos(Mensajes.DATOSCOM);

	}

	public static boolean ValidarMail(String email) {
		// Patron para validar el email
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");

		Matcher mather = pattern.matcher(email);
		return mather.find();
	}

}
