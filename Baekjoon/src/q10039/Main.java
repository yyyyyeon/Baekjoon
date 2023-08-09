package q10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);	
		int sum=0;
		int a[]=new int [5];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			
		if(a[i]<40) {
			a[i]=40;
		}
		sum+=a[i];	
	}
		sc.close();	
		System.out.print(sum/a.length);
	}

}
