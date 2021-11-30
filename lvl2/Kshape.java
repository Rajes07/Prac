package com.demo.lvl2;

import java.util.Scanner;
//q21
public class Kshape {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);	
		
		int i, j;
		
		System.out.print("Enter K Shape Number Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing K Shape Numbers Pattern");		
		
		for (i = rows; i >= 1; i-- ) 
		{
			for (j = 1 ; j <= i; j++ ) 	
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		for (i = 2 ; i <= rows; i++ ) 
		{
			for (j = 1 ; j <= i; j++ ) 	
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}