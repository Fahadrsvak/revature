package getpack;


import java.util.Scanner;

public class WebsiteDomain {

	public static void main(String[] args) {
		System.out.print("Enter the url of website:");
		Scanner sc =new Scanner(System.in);
		
		String url =sc.nextLine();
		sc.close();
		
		System.out.println("Domain is :"+ domainExtract( url));
		
	}
	public static String domainExtract(String url) {
		String s[] = url.split("/");
		return s[2];
	}

}
