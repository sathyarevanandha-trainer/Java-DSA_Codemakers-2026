package day05_Methods;

import java.util.Scanner;

public class Classification02_NoArgsWithReturnType {
    public static void main(String[] args) {
        int ans=sum();
        System.out.println(ans);
    }
    static int  sum()
    {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int c=a+b;

        return c;
    }
}
