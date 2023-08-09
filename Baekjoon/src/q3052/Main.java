package q3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] a  = new int [10];
		for (int i=0; i<a.length; i++) {
				a[i] = sc.nextInt();
		}
		sc.close();
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
	}
		System.out.println();
		int [] b = new int [10];
		for (int i=0; i<b.length; i++) {
			b[i]= b[i] % 42;
		}
		for (int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
			
	}

}
}
