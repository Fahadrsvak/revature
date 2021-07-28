package hypotenuse;

import java.util.Scanner;
import java.lang.Math;

public class CalculateHypo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length of side 1:");
		double a=Double.parseDouble(sc.nextLine());
		System.out.println("enter the length of side 2:");
		double b=Double.parseDouble(sc.nextLine());
		
		System.out.println("hypotenose of rectangle:"+calculateHypo(a,b));
		sc.close();

	}
	public static double calculateHypo(double a,double b) {
		double hypo=Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)));
		return hypo;
}
}
