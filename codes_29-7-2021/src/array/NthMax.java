package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NthMax {

	public static void main(String[] args) {
		//int ar1[]= {12,33,11,23,4,11,12,11,12,11};
		int ar1[]= new int[10];
		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.println("-----find the nth max of an array------");
		System.out.println("Enter the Elements of string ");
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.println("enter the value of N :");
		
		int n =Integer.parseInt(sc.nextLine());
		Arrays.sort(ar1);
		//String s=Arrays.toString(ar1);
		//System.out.println(s);
		int temp=ar1[ar1.length-1];
		int n2=1;
		//System.out.println(temp);
		for (int i = ar1.length-1; i>=0; i--) {
			if(n2==n) {
				System.out.println(n+" th max value in array is :"+temp);
				break;
			}
			else {
				if(ar1[i]<temp) {
					temp=ar1[i];
					n2++;
				}
				if(ar1[i]==ar1[0]) {
					System.out.println("only "+n2+" unique value in the array");
					System.out.println(n2+" th max value in array is :"+temp);
					break;
				}
			}
		}
		sc.close();
		
	}

}
