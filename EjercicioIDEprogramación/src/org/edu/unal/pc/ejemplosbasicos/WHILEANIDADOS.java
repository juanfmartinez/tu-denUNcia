package org.edu.unal.pc.ejemplosbasicos;

public class WHILEANIDADOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int j=1, i=1;

while(j<=3) {
	System.out.println("La tabla del "+j+":");
	
	i=1;
	while(i<=10) {
		System.out.println(+j+ "*" +i+ "=" +j*i);
		i++;
	}
	j++;
}
	}

}
