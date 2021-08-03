
import java.util.*;

public class calculando {
	
	public static void main(String[] args) {
		
		Scanner lector= new Scanner (System.in);
		
		
	int contador=0;
		
		
			
			do {
				System.out.println("Ingrese con que numero va a trabajar");
				int a= lector.nextInt();
				int b= lector.nextInt();
				System.out.println("Indique que operacion desea realizar");
				int op=lector.nextInt();
				
				if (op==0) {
					System.out.println("Hasta luego");
					break;
				
				}
				else if (op==1) {
					System.out.println(Operacionesconfunciones.suma(a,b));
				;
				}
				else if (op==2) {
					System.out.println(Operacionesconfunciones.resta(a,b));
				
				}
				else if (op==3) {
					System.out.println(Operacionesconfunciones.multiplicacion(a,b));
				
				}
				else if (op==4) {
					System.out.println(Operacionesconfunciones.division(a,b));
					
				}
			}  
		
			while (contador<=10);
				
			contador++;
			
		
	
		
		
		
	}

	
	
	
	
	
}
