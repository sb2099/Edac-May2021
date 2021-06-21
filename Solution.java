import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc =new Scanner(System.in);
        int i, j;
        int n = sc.nextInt(); 
        int num1 = (n/2)*3;
        for(i = 0; i < n; i++)
        {
        for(j = 0; j < n; j++)
        {
        if(i == n/2 || j-i == n/2 || i+j == num1)
            System.out.print("*");
        else
            System.out.print(" ");
        }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        //System.out.println();

        for(i = 0; i < n; i++)
        {
        for(j = 0; j < n; j++)
        {
        if(i == n/2 || i-j == n/2 || i+j == n/2)
            System.out.print("*");
        else
            System.out.print(" ");
        }
            System.out.println();
        }
        }
}