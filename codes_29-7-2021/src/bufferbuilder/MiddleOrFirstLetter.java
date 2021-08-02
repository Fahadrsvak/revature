package bufferbuilder;

import java.util.Scanner;

public class MiddleOrFirstLetter {
	public static void main(String[] args) {
		System.out.println("enter line: ");
		Scanner sc=new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		convert(line);

	}
	public static void convert(String line) {
		String words[]=line.split(" ");
		StringBuffer s1 =new StringBuffer();
		for (int i = 0; i < words.length; i++) {
			int len=words[i].length();
			//System.out.println(len);
			if(len%2==0) {
				s1.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
			}
			else {
				s1.append(words[i].substring(0,(len/2))).append(Character.toUpperCase(words[i].charAt((len/2)))).append(words[i].substring(len/2+1)).append(" ");
			}
		}
		System.out.println(s1);
	}

}
