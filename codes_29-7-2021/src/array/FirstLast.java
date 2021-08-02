package array;

import java.util.Scanner;

public class FirstLast {

	public static void main(String[] args) {
		int ar1[]= new int[10];
		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.println("-----find the palindromes in the array------");
		System.out.println("Enter the Elements of string ");
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.println("output array");
		for (int i = 0; i < ar1.length; i++) {
			
			String s=Integer.toString(ar1[i]);
			
			if(s.charAt(0)!=s.charAt(s.length()-1)) {
				
				System.out.println(s);
				
			}
		}

	}
}
