package day01_StarPatterns;

import java.util.Scanner;

public class Pattern04_Paralellogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i,j,k;

        for(i=1;i<=n;i++)
        {
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
