package q2440;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int a = sc.nextInt();
		sc.close();
		for (int i=0; i<a; i++) {
			for(int j=a; j>i; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
}