/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

public class SmallestArray 
{
public static void main(String [] args)
{
    int n,index;
    System.out.println("Enter n Number -> ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int a[];
    a=new int [n];
    for(index=0;index<a.length;index++)
    {
        System.out.println("Enter your Array Elements ->");
        a[index]=sc.nextInt();     
    }
    int small=a[0];
    for(index=1;index<a.length;index++)
    {
        if(a[index]<small)
        small=a[index];              
    }
        System.out.println("Your Smallest Number is-> "+small);
    
}
}
