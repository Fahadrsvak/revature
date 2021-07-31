package areacheck;

import java.util.Scanner;

public class MainChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------Area Calculator----------------------");
		System.out.println("Select the shape and enter the corresponding number ");
		System.out.println("1.Rectangle    2.Square    3.Trapezium");
		Scanner sc=new Scanner(System.in);
		int shape =Integer.parseInt(sc.nextLine());
		if(shape==1) {
			System.out.println("Enter the length of sides:");
			float side1 =Float.parseFloat(sc.nextLine());
			float side2 =Float.parseFloat(sc.nextLine());
			RectangleArea area=new RectangleArea(side1, side2);
			area.areaCalc();
		}
		else if(shape==2) {
			System.out.println("Enter the length of side:");
			float side1 =Float.parseFloat(sc.nextLine());
			SquareArea area=new SquareArea(side1,side1);
			area.areaCalc();
			
		}
		else if(shape==3) {
			System.out.println("Enter the length of Sides and Height:");
			float side1 =Float.parseFloat(sc.nextLine());
			float side2 =Float.parseFloat(sc.nextLine());
			float height =Float.parseFloat(sc.nextLine());
			TrapeziumArea area=new TrapeziumArea(side1,side2,height);
			area.areaCalc();
		}
		else {
			System.out.println("Wrong input");
			
		}
		sc.close();	
	}

}
