package day03_AlphabetPatterns;

import java.util.Scanner;

public class Pattern04_InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int i,j,k,ans;

        //Reverse the i loop
        for(i=n;i>=1;i--)
        {
            ans=i;
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<i;j++)
            {
                System.out.print((char)(ans+64));
                ans--;
            }

            for (j = 1; j <=i; j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
