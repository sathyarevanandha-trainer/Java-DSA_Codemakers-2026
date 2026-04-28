package day08_Arrays;

import java.util.Scanner;

public class Problem01_SumOfElements {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int[] a=new int[n];

        int i;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int ans=sum_of_elements_array(a);

        System.out.println(ans);


    }

    static int sum_of_elements_array(int[] a)
    {
        int i,n=a.length,sum=0;

        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
}
