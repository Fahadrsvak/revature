package website_checker;

import java.util.Scanner;

public class WebsiteSecurity {

	public static void main(String[] args) {
		System.out.println("Enter the website url:");
		Scanner sc= new Scanner(System.in);
		String url = sc.nextLine();
		sc.close();
		isWebsiteSafe(url);
		
		
	}
	public static void isWebsiteSafe(String url) {
		
		if(url.startsWith("https")) {
			System.out.println("this website is safe");
		}
		else {
			System.out.println("this website is not safe");
		}
		
		

	}
	
	
}
	
