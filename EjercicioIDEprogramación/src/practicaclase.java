import java.util.Scanner;

public class practicaclase {
	public static void main(String[] args) {
	
	int total= sumaRecursiva(2,2);
	System.out.println(total);
	}
	
	static int sumaRecursiva(int num, int num2){
		
		if(num2 == 0) {
			return num  ;
		}else {
			return sumaRecursiva(num +1 , num2 -1);
		}
		
		
	    
	}
}
