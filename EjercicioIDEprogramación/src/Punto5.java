import java.util.Scanner;

public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
int n,num;
n=(int) (Math.random()*10)+1;

System.out.println("Introduce  número: ");
num=scan.nextInt();

while(num!=n) {
	
	if(num>n)
		System.out.println("menor");
	else
		System.out.println("Mayor");

	System.out.println("Introduce otro número: ");
	num=scan.nextInt();
}
System.out.println("Acertaste");
	}

}
