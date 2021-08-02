 package bufferbuilder;

import java.util.Scanner;

public class LastUpper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to convert:");
		String line=sc.nextLine();
		convertLine(line);
		sc.close();
		
	}
	public static void convertLine(String line) {
		String words[]=line.split(" ");
		StringBuilder s1=new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			int l=words[i].length()-1;
			s1.append(words[i].substring(0,l )).append(Character.toUpperCase(words[i].charAt(l))).append(" ");
			
		}
		System.out.println("converted string is :"+s1);
	}

}
