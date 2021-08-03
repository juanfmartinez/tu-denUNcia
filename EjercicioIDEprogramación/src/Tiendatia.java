import java.util.Scanner;

public class Tiendatia {

public static void main(String[] args) {
		
		Scanner lector= new Scanner (System.in);
		System.out.println("Ingrese cuantos zapatos llevará");
		int z= lector.nextInt();
		System.out.println(funcionestiendatia.zapatos(z));

		
		System.out.println("Ingrese cuantas camisas llevará");
		int c= lector.nextInt();
		System.out.println(funcionestiendatia.camisas(c));
		
		
		System.out.println("Ingrese cuantas medias llevará");
		int m= lector.nextInt();
		System.out.println(funcionestiendatia.medias(m));
		
		
				
		System.out.println("La factura es de:" + funcionestiendatia.total(funcionestiendatia.medias(m), funcionestiendatia.camisas(c), funcionestiendatia.zapatos(z) ) );
		
		System.out.println("Con que billete pagara");
		int b=lector.nextInt();
		
		System.out.println("Le debe a la tienda " + (b-funcionestiendatia.total(funcionestiendatia.medias(m), funcionestiendatia.camisas(c), funcionestiendatia.zapatos(z))));
		
		
}
}