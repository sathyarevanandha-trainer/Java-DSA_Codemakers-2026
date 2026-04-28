package day01_StarPatterns;

import java.util.Scanner;

public class Pattern13_Butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i,j;

        //Butterfly Star ---> Combine ButterflyUpper and ButterflyLower
        //remove the center row from the ButterflyUpper or ButterflyLower


        for(i=1;i<n;i++)
        {

            for(j=1;j<=2*n-1;j++)
            {
                if(j<=i || i+j>=2*n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for(i=n;i>=1;i--)
        {

            for(j=1;j<=2*n-1;j++)
            {
                if(j<=i || i+j>=2*n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
