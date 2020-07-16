package lec2;

import java.util.Scanner;

public class Func {
	public static void prin(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		prin(n);

	}

}
