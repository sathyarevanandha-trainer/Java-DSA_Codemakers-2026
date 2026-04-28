package day01_StarPatterns;

import java.util.Scanner;

public class Pattern12_ButterflyLower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i,j;

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
