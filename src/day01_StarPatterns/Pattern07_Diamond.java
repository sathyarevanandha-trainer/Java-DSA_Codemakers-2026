package day01_StarPatterns;

import java.util.Scanner;

public class Pattern07_Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i,j,k;

        //Diamond Star ---> Combine pyramid and inverted pyramid
        //remove the center row from the pyramid or inverted pyramid

        for(i=1;i<n;i++)
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
