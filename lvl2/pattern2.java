package com.demo.lvl2;
import java.util.Scanner;

public class pattern2
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();

  

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print("* "+" ");
            }
            System.out.println();
        }
       
    }
}