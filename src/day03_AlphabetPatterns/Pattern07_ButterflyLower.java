package day03_AlphabetPatterns;

import java.util.Scanner;

public class Pattern07_ButterflyLower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int i,j,ans;



        //Reverse the i loop
        for(i=n;i>=1;i--)
        {
            ans=i;
            for(j=1;j<=2*n-1;j++)
            {
                if(i+j>=2*n)
                {
                    System.out.print((char)(ans+64));
                    ans--;
                }
                else if(j<=i)
                {
                    System.out.print((char)(j+64));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
