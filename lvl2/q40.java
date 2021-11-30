package com.demo.lvl2;

import java.util.Scanner;

public class q40 
{

    static String isDivisible(long n)
    {
        long temp = n;
        int sum = 0;
        while (n != 0)
        {
            int k = (int) n % 10;
            sum += k;
            n /= 10;
        }
     
        // check if sum of digits divides n
        if (temp % sum == 0)
            return "YES";
     
        return "NO";
    }
     

    public static void main(String []args)
    {
    	Scanner sc= new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(isDivisible(n));
    }
}
