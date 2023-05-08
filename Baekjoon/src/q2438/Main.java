package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		for (int a=0; a <n; a++) {
			for (int j=0; j <= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
