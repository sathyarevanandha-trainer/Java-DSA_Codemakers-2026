package day08_Arrays;

import java.util.Scanner;

public class Problem05_ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int[] a=new int[n];

        int i;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        reversearray(a);

        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    static void reversearray(int[] a)
    {
        int s=0,e=a.length-1,temp;

        while(s<e)
        {
            temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
}
