package day01_StarPatterns;

import java.util.Scanner;

public class Pattern06_InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i,j,k;

        //Reverse the i loop
        for(i=n;i>=1;i--)
        {
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
