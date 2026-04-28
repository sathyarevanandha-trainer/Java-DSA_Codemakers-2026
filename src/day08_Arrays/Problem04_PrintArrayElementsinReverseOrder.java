package day08_Arrays;

import java.util.Scanner;

public class Problem04_PrintArrayElementsinReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int[] a=new int[n];

        int i;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        printarrayelements_reverseorder(a);
    }

    static void printarrayelements_reverseorder(int[] a)
    {
        int n=a.length,i;

        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
