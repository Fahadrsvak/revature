package array;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesRemove {

	public static void main(String[] args) {
		//int ar1[]= new int[10];
		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.println("-----array duplicate remover------");
		//System.out.println("Enter the Elements of string ");
		int ar1[]= {12,33,11,23,4,11,12,11,52,52};
		
	/*	for (int i = 0; i < ar1.length; i++) {
			ar1[i]=Integer.parseInt(sc.nextLine());
		} */
		int n=ar1.length;
		sc.close();
		Arrays.sort(ar1);
		
		System.out.println("output array");
		for (int i = 0; i < n; i++) {
			
			if(ar1[i]==ar1[i+1]) {
				//System.out.println();
				//System.out.println(ar1[i]);
				for (int j = i; j < ar1.length-1; j++) {
					ar1[j]=ar1[j+1];
					//System.out.println(ar1[j]);
				}
				i--;
				n--;
			}
			
			}
		System.out.println();
		System.out.println();
		for (int i = 0; i < n+1; i++) {
			System.out.println(ar1[i]);
		}
		}

	}


