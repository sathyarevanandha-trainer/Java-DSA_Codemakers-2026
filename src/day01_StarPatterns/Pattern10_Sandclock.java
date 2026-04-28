package day01_StarPatterns;

import java.util.Scanner;

public class Pattern10_Sandclock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i,j;

        for(i=1;i<=2*n-1;i++)
        {
            for(j=1;j<=2*n-1;j++)
            {
                if(i==1 || j==1 || i==2*n-1|| j==2*n-1 || i==j || i+j==2*n )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
