import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Mensajes {

	public static final int MENSAJE_AUTENTICACION_EMAIL = 1;

	public static void getMensajes(int mensajeNumero) {
		String mensaje = new String();

		switch (mensajeNumero) {
		case MENSAJE_AUTENTICACION_EMAIL: {
			mensaje = getMensajeAutenticacionEmail();
			break;
		}
		default:

		}

		System.out.println(mensaje);

	}

	private static String getMensajeAutenticacionEmail() {
		return 	Consolecolors.RED+"____________________________________ \n"+Consolecolors.RESET
				+"Bienvenido a tu denUNcia, el portal diseñado por y para que los estudiantes sean atendidos oportunamente \n"
				+ "Tu denUNcia es un proyecto desarrollado por 3 estudiantes de ingeniería química de la Universidad Nacional \n"
				+ "de Colombia en su sede Bogotá \n"
				+ " el portal se creo con el proposito de asegurar la adecuada respuesta a las muchas denuncias que se hacen hoy \n"
				+ "en día y quedan en el olvido. \n "
				+ "Es así como el portal pretende dar cumplimiento adecuado a los derechos fundamentales y evita que en los casos \n"
				+ " que se vean incumplidos \n" + "no haya proceso alguno" + " ";
	}

	public static final int DERECHOS = 2;

	public static void getDerechos(int mensajeDerechos) {
		String mensaje1 = new String();
		switch (mensajeDerechos) {
		case DERECHOS: {
			mensaje1 = getMensajeDerechos();
			break;
		}
		default:
		}
		System.out.println(mensaje1);
	}

	private static String getMensajeDerechos() {
		return "A continuacion se le dara un contexto a cuales son los derechos humanos fundamentales \n" +

				"De manera que le quede mas claro identificar si alguno ha sido vulnerado o no \n" +

				"La declaración universal de los derechos humanos fue proclamada por la Naciones Unidas en diciembre del año 1948 \n"
				+

				"Esta declaracion reconoce la dignidad intrinseca y los derechos iguales en todos los humanos del mundo \n"
				+ "Esto se promulgo con el fin de evitar mas barbaries en la humanidad \n" +

				"Esta declaración tiene 30 articulos en las que se establecen los derechos humanos fundamentales e inalienables \n"
				+ "Estos derechos son:\n" +

				Consolecolors.RED + "Articulo 1:" + Consolecolors.RESET
				+ "Todos los seres humanos nacen libres e iguales en dignidad y derechos y, \n"
				+ " dotados como están \n de razón y conciencia, deben comportarse fraternalmente los unos con los otros. \n"
				+ " " +

				Consolecolors.RED + "Articulo 2:" + Consolecolors.RESET
				+ "Toda persona tiene todos los derechos y libertades proclamados en esta Declaración, sin \n"
				+ "   distinción alguna de raza, color, sexo, idioma, religión, opinión política o de cualquier otra índole, \n "
				+ " origen nacional o social, posición económica, nacimiento o cualquier otra condición. \n"
				+ "Además, no se hará distinción alguna fundada en la condición política, \n"
				+ "jurídica o internacional del país o territorio de cuya jurisdicción dependa una persona, \n"
				+ " tanto si se trata de un país independiente,\n como de un territorio bajo administración fiduciaria, \n "
				+ "no autónomo o sometido a cualquier otra limitación de soberanía.\n" + " " +

				Consolecolors.RED + "Articulo 3:" + Consolecolors.RESET
				+ "Todo individuo tiene derecho a la vida, a la libertad y a la seguridad de su persona.\n" + " " +

				Consolecolors.RED + "Articulo 4:" + Consolecolors.RESET
				+ "Nadie estará sometido a esclavitud ni a servidumbre, la esclavitud y la trata de esclavos \n "
				+ " están prohibidas en todas sus formas. \n" + " " +

				Consolecolors.RED + "Articulo 5:" + Consolecolors.RESET
				+ "Nadie será sometido a torturas ni a penas o tratos crueles, inhumanos o degradantes \n" + " " +

				Consolecolors.RED + "Articulo 6:" + Consolecolors.RESET
				+ "Todo ser humano tiene derecho, en todas partes, al reconocimiento de su personalidad jurídica \n"
				+ " " +

				Consolecolors.RED + "Articulo 7:" + Consolecolors.RESET
				+ "Todos son iguales ante la ley y tienen, sin distinción, derecho a igual protección de la ley. \n "
				+ "Todos tienen derecho a igual protección contra toda discriminación que infrinja esta Declaración \n "
				+ " y contra toda provocación a tal discriminación. \n" + " " +

				Consolecolors.RED + "Articulo 8:" + Consolecolors.RESET
				+ "Toda persona tiene derecho a un recurso efectivo ante los tribunales nacionales competentes, \n"
				+ " que la ampare contra actos que violen sus derechos fundamentales reconocidos por la constitución \n o por la ley"
				+ " " +

				Consolecolors.RED + "Articulo 9:" + Consolecolors.RESET
				+ "Nadie podrá ser arbitrariamente detenido, preso ni desterrado. \n" + " " +

				Consolecolors.RED + "Articulo 10:" + Consolecolors.RESET
				+ "Toda persona tiene derecho, en condiciones de plena igualdad, a ser oída públicamente y con \n"
				+ "justicia por un tribunal independiente e imparcial, para la determinación de sus derechos y obligaciones \n"
				+ " o para el examen de cualquier acusación contra ella en materia penal. \n" + " " +

				Consolecolors.RED + "Articulo 11:" + Consolecolors.RESET
				+ "1. Toda persona acusada de delito tiene derecho a que se presuma su inocencia mientras no se \n"
				+ " pruebe su culpabilidad, conforme a la ley y en juicio público en el que se le hayan asegurado todas las garantías \n "
				+ " necesarias para su defensa. \n"
				+ "  2. Nadie será condenado por actos u omisiones que en el momento de cometerse no fueron delictivos según el Derecho nacional o internacional. \n"
				+ " Tampoco se impondrá pena más grave que la aplicable en el momento de la comisión del delito. \n"
				+ " " +

				Consolecolors.RED + "Articulo 12:" + Consolecolors.RESET
				+ "Nadie será objeto de injerencias arbitrarias en su vida privada, su familia, su domicilio o su correspondencia, \n "
				+ " ni de ataques a su honra o a su reputación. Toda persona tiene derecho a la protección de la ley \n"
				+ " contra tales injerencias o ataques. \n" + " " +

				Consolecolors.RED + "Articulo 13:" + Consolecolors.RESET
				+ "1. Toda persona tiene derecho a circular libremente y a elegir su residencia en el territorio de un Estado. \n"
				+ "2. Toda persona tiene derecho a salir de cualquier país, incluso del propio, y a regresar a su país.\n "
				+ " " +

				Consolecolors.RED + "Articulo 14:" + Consolecolors.RESET
				+ "1. En caso de persecución, toda persona tiene derecho a buscar asilo, y a disfrutar de él, en cualquier país. \n"
				+ "2. Este derecho no podrá ser invocado contra una acción judicial realmente originada por delitos \n "
				+ " comunes o por actos opuestos a los propósitos y principios de las Naciones Unidas. \n" + " "
				+ Consolecolors.RED + "Articulo 15:" + Consolecolors.RESET
				+ "1. Toda persona tiene derecho a una nacionalidad. \n"
				+ "2. A nadie se privará arbitrariamente de su nacionalidad ni del derecho a cambiar de nacionalidad.\n"
				+ " " +

				Consolecolors.RED + "Articulo 16:" + Consolecolors.RESET
				+ "	1. Los hombres y las mujeres, a partir de la edad núbil, tienen derecho, sin restricción alguna por motivos de raza, nacionalidad \n "
				+ " o religión, a casarse y fundar una familia, y disfrutarán de iguales derechos en cuanto al matrimonio, durante el matrimonio y \n"
				+ "en caso de disolución del matrimonio. \n"
				+ "2. Sólo mediante libre y pleno consentimiento de los futuros esposos podrá contraerse el matrimonio. \n"
				+ "3. La familia es el elemento natural y fundamental de la sociedad y tiene derecho a la protección de la sociedad y del Estado. \n"
				+ " " +

				Consolecolors.RED + "Articulo 17:" + Consolecolors.RESET
				+ "1. Toda persona tiene derecho a la propiedad, individual y colectivamente.\r\n"
				+ "2. Nadie será privado arbitrariamente de su propiedad." + " " +

				Consolecolors.RED + "Articulo 18:" + Consolecolors.RESET
				+ "Toda persona tiene derecho a la libertad de pensamiento, de conciencia y de religión; este derecho incluye \n"
				+ "la libertad de cambiar de religión o de creencia, así como la libertad de manifestar su religión o su creencia, \n"
				+ " individual y colectivamente, tanto en público como en privado, por la enseñanza, \n"
				+ " la práctica, el culto y la observancia. \n" + " " +

				Consolecolors.RED + "Articulo 19:" + Consolecolors.RESET
				+ "Todo individuo tiene derecho a la libertad de opinión y de expresión; este derecho incluye el de no ser molestado \n"
				+ " a causa de sus opiniones, el de investigar y recibir informaciones y opiniones, y el de difundirlas, \n"
				+ " sin limitación de fronteras, por cualquier medio de expresión.\n" + " " +

				Consolecolors.RED + "Articulo 20: " + Consolecolors.RESET
				+ "1. Toda persona tiene derecho a la libertad de reunión y de asociación pacíficas.\n"
				+ "2. Nadie podrá ser obligado a pertenecer a una asociación.\n" + " " +

				Consolecolors.RED + "Articulo 21:" + Consolecolors.RESET
				+ "1. Toda persona tiene derecho a participar en el gobierno de su país, directamente o por medio de representantes libremente escogidos. \n"
				+ "2. Toda persona tiene el derecho de acceso, en condiciones de igualdad, a las funciones públicas de su país.\n"
				+ "3. La voluntad del pueblo es la base de la autoridad del poder público; esta voluntad se expresará mediante elecciones auténticas que habrán \n"
				+ " de celebrarse periódicamente, por sufragio universal e igual y por voto secreto u otro procedimiento equivalente que garantice la libertad del voto. \n"
				+ " " +

				Consolecolors.RED + "Articulo 22:" + Consolecolors.RESET
				+ "Toda persona, como miembro de la sociedad, tiene derecho a la seguridad social, y a obtener, \n"
				+ "mediante el esfuerzo nacional y la cooperación internacional, habida cuenta de la organización y los recursos de cada Estado, \n"
				+ "la satisfacción de los derechos económicos, sociales y culturales, indispensables a su dignidad  y al libre desarrollo de su personalidad.\n"
				+ " " +

				Consolecolors.RED + "Articulo 23: " + Consolecolors.RESET
				+ "1. Toda persona tiene derecho al trabajo, a la libre elección de su trabajo, a condiciones equitativas \n"
				+ " y satisfactorias de trabajo y a la protección contra el desempleo.\n"
				+ "2. Toda persona tiene derecho, sin discriminación alguna, a igual salario por trabajo igual. \n"
				+ "3. Toda persona que trabaja tiene derecho a una remuneración equitativa y satisfactoria, que le asegure, \n "
				+ " así como a su familia, una existencia conforme a la dignidad humana y que será completada, en caso necesario,\n "
				+ " por cualesquiera otros medios de protección social.\n"
				+ "4. Toda persona tiene derecho a fundar sindicatos y a sindicarse para la defensa de sus intereses.\n"
				+

				" "

				+ Consolecolors.RED + "Articulo 24:" + Consolecolors.RESET
				+ "Toda persona tiene derecho al descanso, al disfrute del tiempo libre, a una limitación razonable de la duración \n"
				+ " del trabajo y a vacaciones periódicas pagadas. \n" + " "

				+ Consolecolors.RED + "Articulo 25:" + Consolecolors.RESET
				+ "1. Toda persona tiene derecho a un nivel de vida adecuado que le asegure, así como a su familia, la salud y el bienestar \n "
				+ " , y en especial la alimentación, el vestido, la vivienda, la asistencia médica y los servicios sociales necesarios; \n "
				+ " tiene asimismo derecho a los seguros en caso de desempleo, enfermedad, invalidez, viudez, vejez u otros casos de pérdida \n  "
				+ "de sus medios de subsistencia por circunstancias independientes de su voluntad. \n"
				+ "2. La maternidad y la infancia tienen derecho a cuidados y asistencia especiales. \n "
				+ "Todos los niños, nacidos de matrimonio o fuera de matrimonio, tienen derecho a igual protección social. \n"
				+ " " +

				Consolecolors.RED + "Articulo 26:" + Consolecolors.RESET
				+ "1. Toda persona tiene derecho a la educación. La educación debe ser gratuita, al menos en lo concerniente \n"
				+ "a la instrucción elemental y fundamental. La instrucción elemental será obligatoria. \n"
				+ " La instrucción técnica y profesional habrá de ser generalizada; el acceso a los estudios superiores será igual para todos \n"
				+ ", en función de los méritos respectivos. \n"
				+ "2. La educación tendrá por objeto el pleno desarrollo de la personalidad humana y el fortalecimiento del respeto \n"
				+ "a los derechos humanos y a las libertades fundamentales; favorecerá la comprensión, \n"
				+ " la tolerancia y la amistad entre todas las naciones y todos los grupos étnicos o religiosos, y promoverá el desarrollo  \n"
				+ " de las actividades de las Naciones Unidas para el  mantenimiento de la paz.\n"
				+ "3. Los padres tendrán derecho preferente a escoger el tipo de educación que habrá de darse a sus hijos\n"
				+ " " + Consolecolors.RED + "Articulo 27:" + Consolecolors.RESET
				+ "1. Toda persona tiene derecho a tomar parte libremente en la vida cultural de la comunidad, a gozar de las artes \n"
				+ " y a participar en el progreso científico y en los beneficios que de él resulten.\n"
				+ "2. Toda persona tiene derecho a la protección de los intereses morales y materiales que le correspondan por razón \n "
				+ "de las producciones científicas, literarias o artísticas de que sea autora. \n" + " " +

				Consolecolors.RED + "Articulo 28:" + Consolecolors.RESET
				+ "Toda persona tiene derecho a que se establezca un orden social e internacional en el que los derechos y libertades \n "
				+ "proclamados en esta Declaración se hagan plenamente efectivos. \n" + " " +

				Consolecolors.RED + "Articulo 29:" + Consolecolors.RESET
				+ "1. Toda persona tiene deberes respecto a la comunidad, puesto que sólo en ella puede desarrollar libre y plenamente su personalidad.\n"
				+ "2. En el ejercicio de sus derechos y en el disfrute de sus libertades, toda persona estará solamente sujeta a las limitaciones \n"
				+ "  establecidas por la ley con el único fin de asegurar el reconocimiento y el respeto de los derechos \n"
				+ " y libertades de los demás, y de satisfacer las justas exigencias de la moral, del orden público \n"
				+ " y del bienestar general en una sociedad democrática.\n"
				+ "3. Estos derechos y libertades no podrán, en ningún caso, ser ejercidos en oposición a los propósitos y principios de las Naciones Unidas.\n"
				+ " " +

				Consolecolors.RED + "Articulo 30:" + Consolecolors.RESET
				+ "Nada en esta Declaración podrá interpretarse en el sentido de que confiere derecho alguno al Estado, a un grupo o a \n"
				+ " una persona, para emprender y desarrollar actividades o realizar actos tendientes a la supresión de cualquiera de los derechos \n"
				+ " y libertades proclamados en esta Declaración.\n" + " ";
	}

	public static final int DATOSCOM = 3;

	public static void getDatos(int mensajedatos) {
		String mensaje2 = new String();
		switch (mensajedatos) {
		case DATOSCOM: {
			mensaje2 = getMensajedatos();
			break;
		}
		default:

		}
		System.out.println(mensaje2);
	}

	private static String getMensajedatos() {
		return "Para comunicarse con el administrador del portal cuenta con las siguientes opciones: Correo electronico: \n "
				+ Consolecolors.RED + " \"juamartinezro@unal.edu.co - cospinaho@unal.edu.co - anbarreras@unal.edu.co.\n"
				+ Consolecolors.RESET + "Numero telefónico y mensaje de texto" + Consolecolors.RED
				+ "3186517640 - 3219113875 - 3114671293\n" + Consolecolors.RESET
				+ "Pronto tendra respuesta. Gracias por su atencion";

	}

	public static final int DIVISIONES = 1;

	public static void getDivisiones(int mensajeDivisiones) {
		String mensaje3 = new String();
		switch (mensajeDivisiones) {
		case DIVISIONES: {
			mensaje3 = getMensajeDivisiones();
			break;
		}
		}
		System.out.println(mensaje3);

	}

	private static String getMensajeDivisiones() {
		return "Recuerde que las Universidad Nacional de Colombia en su sede bogotá se encuentra dividida en: \n"
				+ Consolecolors.RED + "Consejos" + Consolecolors.RESET
				+ " entre estos se encuentran el Consejo Superior Universitario, el Consejo Academico "
				+ " y la Secretaría general" + "" + Consolecolors.RED + "\n Vicerrectorias" + Consolecolors.RESET
				+ " entre estos se encuentran la Vicerrectoría Academica, Vicerrectoria de investigación "
				+ " Vicerrectoria General, cada una vicerrectoria con sus respectivas divisiones" + ""
				+ Consolecolors.RED + "\n Oficinas Nacionales" + Consolecolors.RESET
				+ " entre estos se encuentran la Dirección de relaciones exteriores, la Dirección de planeación\n"
				+ "y estádistica, la Oficina Júridica Nacional, la Oficina Nacional de gestión y patrimonio, la Oficina Nacional de Control interno y la Dirección "
				+ " Nacional de veeduría Disciplinaría" + "" + "Para obtener más información por favor visite "
				+ Consolecolors.RED + " https://unal.edu.co/la-universidad/estructura.html" + Consolecolors.RESET;
	}
}
