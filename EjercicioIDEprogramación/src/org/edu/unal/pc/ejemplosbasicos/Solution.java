package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner lector = new Scanner(System.in);

		int N;

		while (lector.hasNextInt()) {
			N = lector.nextInt();

			if (1000 >= N && N >= 1) {

				

				

				if (N % 3 == 0 && (N % 5 != 0)) {

					System.out.println("Tingo");

					continue;

				}

				if (N % 5 == 0 && (N % 3 != 0)) {

					System.out.println("Tango");

					continue;

				}

				if ((N % 3 == 0) && (N % 5 == 0)) {

					System.out.println("TingoTango");

					continue;

				}
				if ((N % 3 != 0) && (N % 5 != 0)) {
					System.out.println(+N);

					continue;
				}

			}
			else {
				System.out.println(+N);
			}
		}
		lector.close();
	}
}