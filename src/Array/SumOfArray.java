/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class SumOfArray
{
public static void main(String [] args)
{
    int n;
    int sum=0;
    System.out.println("Enter n -> ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int a[];
    a= new int[n];
    for(int index=0;index<a.length;index++)
    {
        System.out.println("Enter Array Element ->");
        a[index]=sc.nextInt();
        sum=sum+a[index];
    }
    for(int index=0;index<1;index++)
    {
        System.out.println("Your Answer ->" +sum);
    }
}
}
