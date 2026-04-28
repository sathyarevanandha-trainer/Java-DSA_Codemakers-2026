package day03_AlphabetPatterns;

import java.util.Scanner;

public class Pattern02_RightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i,j,k,ans;

        for(i=1;i<=n;i++)
        {
            ans=i;
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(ans+64));
                ans--;
            }
            System.out.println();
        }
    }
}
