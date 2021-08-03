
public class ejerciciorecursion {
public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    scan.close();
	    
		int total = sumaRecursiva(num);
		
		System.out.println(total);
		
	}
static int sumaRecursiva(int num){
	  
	  if(num == 0) //caso base
	  {
	      return num;
	  }
	  else{ // caso recursivo
	      
	      return num + sumaRecursiva(num - 1);
	  }
	  	    
	}
}
