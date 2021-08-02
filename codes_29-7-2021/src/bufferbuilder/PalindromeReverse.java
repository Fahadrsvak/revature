package bufferbuilder;

import java.util.Scanner;

public class PalindromeReverse {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		StringBuilder s2=new StringBuilder("");
		String words[]=line.split(" ");
		for (int i = 0; i < words.length; i++) {
			String res=isPalindrome(words[i]);
			s2.append(res+" ");
		}
		System.out.println(s2);
	}

	public static String isPalindrome(String s) {
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s1=sb.toString();
		//System.out.println(s1);
		if(s.equals(s1)){
			return s;
		}
		else {
			return s1;
		}
	}
}
