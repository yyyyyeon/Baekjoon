package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int seq[];
		int n = sc.nextInt();
		int e = sc.nextInt();
		seq = new int [n];
		for(int i=0; i<seq.length; i++) {
			seq[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<seq.length; i++) {
			if(seq[i]<e) {
				System.out.print(seq[i]+" ");
			}
		}
	}
}
