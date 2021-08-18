package PROYECTOFINAL;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FuncionesUsuario {
	Scanner lector = new Scanner(System.in);
	/* MENSAJE BIENVENIDA */
	public void bienvenidageneral() {
		System.out.println(
				"Bienvenido a tu denUNcia, el portal diseñado por y para que los estudiantes sean atendidos oportunamente");
		System.out.println(
				"Tu denUNcia es un proyecto desarrollado por 3 estudiantes de ingeniería química de la Universidad Nacional de Colombia en su sede Bogotá");
		System.out.println(
				"El portal se creo con el proposito de asegurar la adecuada respuesta a las muchas denuncias que se hacen hoy en día y quedan en el olvido.");
		System.out.println(
				"Es así como el portal pretende dar cumplimiento adecuado a los derechos fundamentales y evita que en los casos que se vean incumplidos");
		System.out.println("no haya proceso alguno");
		System.out.println(" ");
		System.out.println("Bienvenido a la versión de la institucion Universidad Nacional ");
		System.out.println("Para poder acceder a la plataforma introduzca su correo institucional: ");
		
	}

	/* VERIFICA EL FORMATO DE CORREO INSTITUCIONAL*/
	public boolean verif_correoINS(String email) {
		String[] Arrayss = email.split("@");
		
		return /*(Arrayss[1].equals("unal.edu.co"));*/ true;

		
	}
	 //VERIFICA FORMATO DE CORREO
	public boolean verif_correoFORM(String email) {
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");
		return /*ValidarMail(email);*/true;
		
		
		

		
	}
	

	// ACCIONES USUARIO
	public void AccionesUser(personas[] pArray, int persona) {
		Scanner lector = new Scanner(System.in);
		personas pu = new personas();
		System.out.println(
				" Bienvenido al portal del sistema de denuncias, por favor ingrese sus nombres y sus apellidos ");

		pu.setNombre(lector.nextLine());

		System.out.println(" Bienvenido, " + pu.getNombre(pu.nombre)
				+ " ¿Desea ingresar una denuncia, consultar el estado de una,  cerrar sesión o solicitar ayuda ? ( RESPONDA CON \"consultar\", con \"denunciar\", con \"finalizar\" o con \"ayuda\" según sea su caso ( sin espacios )) ");

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
		pu.setContacto(lector.nextLine());

		System.out.println("Ingrese un nombre y/o descripcion del victimario en caso de tenerla.");
		pu.setVictimario(lector.nextLine());
		System.out.println("Conoce usted cuales son los derechos fundamentales (si o no)");
		String respfund = lector.nextLine();
		if (respfund.equalsIgnoreCase("NO")) {

			System.out.println("A continuacion se le dara un contexto a cuales son los derechos humanos fundamentales");
			System.out.println("De manera que le quede mas claro identificar si alguno ha sido vulnerado o no ");
			System.out.println(
					"La declaración universal de los derechos humanos fue proclamada por la Naciones Unidas en diciembre del año 1948");
			System.out.println(
					"Esta declaracion reconoce la dignidad intrinseca y los derechos iguales en todos los humanos del mundo");
			System.out.println("Esto se promulgo con el fin de evitar mas barbaries en la humanidad");
			System.out.println(
					"Esta declaración tiene 30 articulos en las que se establecen los derechos humanos fundamentales e inalienables");
			System.out.println("Estos derechos son:");
			System.out.println(
					"Articulo 1:Todos los seres humanos nacen libres e iguales en dignidad y derechos y, dotados como están de razón y conciencia, deben comportarse fraternalmente los unos con los otros.");
			System.out.println(
					"Articulo 2:Toda persona tiene todos los derechos y libertades proclamados en esta Declaración, sin distinción alguna de raza, color, sexo, idioma, religión, opinión política o de cualquier otra índole, origen nacional o social, posición económica, nacimiento o cualquier otra condición. Además, no se hará distinción alguna fundada en la condición política, jurídica o internacional del país o territorio de cuya jurisdicción dependa una persona, tanto si se trata de un país independiente, como de un territorio bajo administración fiduciaria, no autónomo o sometido a cualquier otra limitación de soberanía.");
			System.out.println(
					"Articulo 3:Todo individuo tiene derecho a la vida, a la libertad y a la seguridad de su persona.");
			System.out.println(
					"Articulo 4:Nadie estará sometido a esclavitud ni a servidumbre, la esclavitud y la trata de esclavos están prohibidas en todas sus formas.");
			System.out.println(
					"Articulo 5:Nadie será sometido a torturas ni a penas o tratos crueles, inhumanos o degradantes");
			System.out.println(
					"Articulo 6:Todo ser humano tiene derecho, en todas partes, al reconocimiento de su personalidad jurídica");
			System.out.println(
					"Articulo 7:Todos son iguales ante la ley y tienen, sin distinción, derecho a igual protección de la ley. Todos tienen derecho a igual protección contra toda discriminación que infrinja esta Declaración y contra toda provocación a tal discriminación.");
			System.out.println(
					"Articulo 8: Toda persona tiene derecho a un recurso efectivo ante los tribunales nacionales competentes, que la ampare contra actos que violen sus derechos fundamentales reconocidos por la constitución o por la ley");
			System.out.println("Articulo 9:Nadie podrá ser arbitrariamente detenido, preso ni desterrado.");
			System.out.println(
					"Articulo 10:Toda persona tiene derecho, en condiciones de plena igualdad, a ser oída públicamente y con justicia por un tribunal independiente e imparcial, para la determinación de sus derechos y obligaciones o para el examen de cualquier acusación contra ella en materia penal.");
			System.out.println(
					"Articulo 11:1. Toda persona acusada de delito tiene derecho a que se presuma su inocencia mientras no se pruebe su culpabilidad, conforme a la ley y en juicio público en el que se le hayan asegurado todas las garantías necesarias para su defensa.\r\n"
							+ "2. Nadie será condenado por actos u omisiones que en el momento de cometerse no fueron delictivos según el Derecho nacional o internacional. Tampoco se impondrá pena más grave que la aplicable en el momento de la comisión del delito.");
			System.out.println(
					"Articulo 12:Nadie será objeto de injerencias arbitrarias en su vida privada, su familia, su domicilio o su correspondencia, ni de ataques a su honra o a su reputación. Toda persona tiene derecho a la protección de la ley contra tales injerencias o ataques.");
			System.out.println(
					"Articulo 13:1. Toda persona tiene derecho a circular libremente y a elegir su residencia en el territorio de un Estado.\r\n"
							+ "2. Toda persona tiene derecho a salir de cualquier país, incluso del propio, y a regresar a su país.");
			System.out.println(
					"Articulo 14:1. En caso de persecución, toda persona tiene derecho a buscar asilo, y a disfrutar de él, en cualquier país.\r\n"
							+ "2. Este derecho no podrá ser invocado contra una acción judicial realmente originada por delitos comunes o por actos opuestos a los propósitos y principios de las Naciones Unidas.");
			System.out.println("Articulo 15:1. Toda persona tiene derecho a una nacionalidad.\r\n"
					+ "2. A nadie se privará arbitrariamente de su nacionalidad ni del derecho a cambiar de nacionalidad.");
			System.out.println(
					"Articulo 16:1. Los hombres y las mujeres, a partir de la edad núbil, tienen derecho, sin restricción alguna por motivos de raza, nacionalidad o religión, a casarse y fundar una familia, y disfrutarán de iguales derechos en cuanto al matrimonio, durante el matrimonio y en caso de disolución del matrimonio.\r\n"
							+ "2. Sólo mediante libre y pleno consentimiento de los futuros esposos podrá contraerse el matrimonio.\r\n"
							+ "3. La familia es el elemento natural y fundamental de la sociedad y tiene derecho a la protección de la sociedad y del Estado.");
			System.out.println(
					"Articulo 17:1. Toda persona tiene derecho a la propiedad, individual y colectivamente.\r\n"
							+ "2. Nadie será privado arbitrariamente de su propiedad.");
			System.out.println(
					"Articulo 18:Toda persona tiene derecho a la libertad de pensamiento, de conciencia y de religión; este derecho incluye la libertad de cambiar de religión o de creencia, así como la libertad de manifestar su religión o su creencia, individual y colectivamente, tanto en público como en privado, por la enseñanza, la práctica, el culto y la observancia.");
			System.out.println(
					"Articulo 19:Todo individuo tiene derecho a la libertad de opinión y de expresión; este derecho incluye el de no ser molestado a causa de sus opiniones, el de investigar y recibir informaciones y opiniones, y el de difundirlas, sin limitación de fronteras, por cualquier medio de expresión.");
			System.out.println(
					"Articulo 20: 1. Toda persona tiene derecho a la libertad de reunión y de asociación pacíficas.\r\n"
							+ "2. Nadie podrá ser obligado a pertenecer a una asociación.");
			System.out.println(
					"Articulo 21:1. Toda persona tiene derecho a participar en el gobierno de su país, directamente o por medio de representantes libremente escogidos.\r\n"
							+ "2. Toda persona tiene el derecho de acceso, en condiciones de igualdad, a las funciones públicas de su país.\r\n"
							+ "3. La voluntad del pueblo es la base de la autoridad del poder público; esta voluntad se expresará mediante elecciones auténticas que habrán de celebrarse periódicamente, por sufragio universal e igual y por voto secreto u otro procedimiento equivalente que garantice la libertad del voto.");
			System.out.println(
					"Articulo 22:Toda persona, como miembro de la sociedad, tiene derecho a la seguridad social, y a obtener, mediante el esfuerzo nacional y la cooperación internacional, habida cuenta de la organización y los recursos de cada Estado, la satisfacción de los derechos económicos, sociales y culturales, indispensables a su dignidad y al libre desarrollo de su personalidad.");
			System.out.println(
					"Articulo 23: 1. Toda persona tiene derecho al trabajo, a la libre elección de su trabajo, a condiciones equitativas y satisfactorias de trabajo y a la protección contra el desempleo.\r\n"
							+ "2. Toda persona tiene derecho, sin discriminación alguna, a igual salario por trabajo igual.\r\n"
							+ "3. Toda persona que trabaja tiene derecho a una remuneración equitativa y satisfactoria, que le asegure, así como a su familia, una existencia conforme a la dignidad humana y que será completada, en caso necesario, por cualesquiera otros medios de protección social.\r\n"
							+ "4. Toda persona tiene derecho a fundar sindicatos y a sindicarse para la defensa de sus intereses.");
			System.out.println(
					"Articulo 24:Toda persona tiene derecho al descanso, al disfrute del tiempo libre, a una limitación razonable de la duración del trabajo y a vacaciones periódicas pagadas.");
			System.out.println(
					"Articulo 25:1. Toda persona tiene derecho a un nivel de vida adecuado que le asegure, así como a su familia, la salud y el bienestar, y en especial la alimentación, el vestido, la vivienda, la asistencia médica y los servicios sociales necesarios; tiene asimismo derecho a los seguros en caso de desempleo, enfermedad, invalidez, viudez, vejez u otros casos de pérdida de sus medios de subsistencia por circunstancias independientes de su voluntad.\r\n"
							+ "2. La maternidad y la infancia tienen derecho a cuidados y asistencia especiales. Todos los niños, nacidos de matrimonio o fuera de matrimonio, tienen derecho a igual protección social.");
			System.out.println(
					"Articulo 26:1. Toda persona tiene derecho a la educación. La educación debe ser gratuita, al menos en lo concerniente a la instrucción elemental y fundamental. La instrucción elemental será obligatoria. La instrucción técnica y profesional habrá de ser generalizada; el acceso a los estudios superiores será igual para todos, en función de los méritos respectivos.\r\n"
							+ "2. La educación tendrá por objeto el pleno desarrollo de la personalidad humana y el fortalecimiento del respeto a los derechos humanos y a las libertades fundamentales; favorecerá la comprensión, la tolerancia y la amistad entre todas las naciones y todos los grupos étnicos o religiosos, y promoverá el desarrollo de las actividades de las Naciones Unidas para el mantenimiento de la paz.\r\n"
							+ "3. Los padres tendrán derecho preferente a escoger el tipo de educación que habrá de darse a sus hijos");
			System.out.println(
					"Articulo 27:1. Toda persona tiene derecho a tomar parte libremente en la vida cultural de la comunidad, a gozar de las artes y a participar en el progreso científico y en los beneficios que de él resulten.\r\n"
							+ "2. Toda persona tiene derecho a la protección de los intereses morales y materiales que le correspondan por razón de las producciones científicas, literarias o artísticas de que sea autora.");
			System.out.println(
					"Articulo 28:Toda persona tiene derecho a que se establezca un orden social e internacional en el que los derechos y libertades proclamados en esta Declaración se hagan plenamente efectivos.");
			System.out.println(
					"Articulo 29:1. Toda persona tiene deberes respecto a la comunidad, puesto que sólo en ella puede desarrollar libre y plenamente su personalidad.\r\n"
							+ "2. En el ejercicio de sus derechos y en el disfrute de sus libertades, toda persona estará solamente sujeta a las limitaciones establecidas por la ley con el único fin de asegurar el reconocimiento y el respeto de los derechos y libertades de los demás, y de satisfacer las justas exigencias de la moral, del orden público y del bienestar general en una sociedad democrática.\r\n"
							+ "3. Estos derechos y libertades no podrán, en ningún caso, ser ejercidos en oposición a los propósitos y principios de las Naciones Unidas.");
			System.out.println(
					"Articulo 30:Nada en esta Declaración podrá interpretarse en el sentido de que confiere derecho alguno al Estado, a un grupo o a una persona, para emprender y desarrollar actividades o realizar actos tendientes a la supresión de cualquiera de los derechos y libertades proclamados en esta Declaración.");

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

		System.out.println("Su nombre es:\"" + pu.nombre + "\" su cedula es:\"" + pu.cedula + "\" su edad: \"" + pu.edad
				+ "\" la ciudad en que sucedio el problema:\"" + pu.ciudad + "\" su tipo de denuncia fue: \""
				+ pu.tipoDenuncia + "\"  lo que sucedio fue: \"" + pu.descripcion
				+ "\" y la fecha del registro de la denuncia es " + pu.fecha
				+ "\" para comunicarse con usted se tiene el numero " + pu.contacto
				+ " el nombre y/o descripcion del victimario es " + pu.victimario);

		System.out.println("Si estos son los datos correctos escriba SI  o NO en caso de que haya  algun error");

		String respuesta2 = lector.nextLine();

		if (respuesta2.equalsIgnoreCase("SI")) {

			System.out.println(
					"Su denuncia ya ha sido cargada, gracias por visitar el portal, recuerde que puede comunicarse con nosotros a travez de los siguientes medios \\n"
							+ "Correo electronico: \\n "
							+ "juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co. \\nNumero telefónico y mensaje de texto 3186517640 - 3219113875 - 3114671293 ");

		} else if (respuesta2.equalsIgnoreCase("NO")) {

			System.out.println(
					"Registre que dato fue el incorrecto (edad,ciudad,suceso, descripcion,fecha,contacto, victimario o derecho ) ");

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
				System.out.println("Usted seleccionó suceso. Ingrese la correción del dato(tipo de denuncia)");
				pu.setTipoDenuncia(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

			} else if (respuesta3.equalsIgnoreCase("descripcion")) {
				System.out.println("Usted seleccionó descripción.Ingrese la correción del dato(descripcion)");
				pu.setDescripcion(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

			} else if (respuesta3.equalsIgnoreCase("fecha")) {
				System.out.println(
						" Usted selecciono fecha. Ingrese la correción del dato( recuerde el formato requerido AAAA,MM,DD)");
				pu.setFecha(lector.nextLine());

				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

			} else if (respuesta3.equalsIgnoreCase("contacto")) {
				System.out.println(" Usted selecciono contacto. Ingrese la correción del dato");
				pu.setContacto(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");

			} else if (respuesta3.equalsIgnoreCase("victimario")) {
				System.out.println(" Usted selecciono victimario. Ingrese la correción del dato");

				pu.setVictimario(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
			} else if (respuesta3.equalsIgnoreCase("derecho")) {
				System.out.println(" Usted selecciono derecho. Ingrese la correción del dato");

				pu.setderecho(lector.nextLine());
				System.out.println("Su denuncia ya esta siendo cargada, en breve recibira mas informacion");
			}

			System.out.println("Para cofirmar sus datos son los siguientes:");
			System.out.println("Su nombre es:\"" + pu.nombre + "\" su cedula es:\"" + pu.cedula + "\" su edad: \""
					+ pu.edad + "\" la ciudad en que sucedio el problema:\"" + pu.ciudad
					+ "\" su tipo de denuncia fue: \"" + pu.tipoDenuncia + "\"  lo que sucedio fue: \"" + pu.descripcion
					+ "\" y la fecha del registro de la denuncia es " + pu.fecha
					+ "\" para comunicarse con usted se tiene el numero " + pu.contacto
					+ "  el nombre y/o descripcion del victimario es  " + pu.victimario);

		}

		pArray[persona] = pu;

		return pArray;
	}

	// FUNCIÓN CONSULTAR
	public void consultar(personas[] pArray) {
		int i;
		Scanner lector = new Scanner(System.in);
		personas pu = new personas();

		System.out.println(
				"Digite su numero de identificación Cedula de ciudadania, tajeta de identidad, registro civil, pasaporte, etc");

		pu.setCedula(lector.nextInt());

		for (i = 0; i < pArray.length; i++) {
			if (pArray[i].cedula == pu.cedula) { // PArray[i].getCedula(p.cedula)
				System.out.println(" la denuncia hecha fue realizada por:\"" + pArray[i].nombre + "\" su cedula es: \""
						+ pArray[i].cedula + "\" su edad: \"" + pArray[i].edad
						+ "\" la ciudad en que sucedio el problema:\"" + pArray[i].ciudad
						+ "\" su tipo de denuncia fue: \"" + pArray[i].tipoDenuncia + "\"  lo que sucedio fue: \""
						+ pArray[i].descripcion + ", la fecha de ingreso de su denuncia fue" + pArray[i].fecha
						+ "y su numero de contacto es " + pArray[i].contacto
						+ " el nombre y/o descripcion del victimario es " + pArray[i].victimario);
				System.out.println("Su denuncia actualmente tiene el status de " + pArray[i].Status);

				break;
			}

		}
		if (i >= pArray.length) {
			System.out.println("No se encontró una denuncia con ese número de documento, intente nuevamente");
		}

	}

	public void finalizar(personas pu, String nombre) {
		pu.nombre = nombre;
		
		System.out.println("Gracias por visitar el portal tu denUNcia" + pu.nombre + ", hasta luego.");
	}

	public void ayuda(personas pu) {
		System.out.println(
				"Para comunicarse con el administrador del portal cuenta con las siguientes opciones: Correo electronico: \"\r\n"
						+ " \"juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co. \n Numero telefónico y mensaje de texto 3186517640 - 3219113875 - 3114671293");

		System.out.println("Pronto tendra respuesta. Gracias por su atencion");

	}

	public static boolean ValidarMail(String email) {
		// Patron para validar el email
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");

		Matcher mather = pattern.matcher(email);
		return mather.find();
	}

}
