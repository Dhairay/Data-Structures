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
public class BinarySearch 
{
public static void main(String [] args)
{
    int n,item;
    System.out.println("Enter N -> ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int a[];
    a=new int[n];
    for(int index=0;index<a.length;index++)
    {
        System.out.println("Enter Elements ->");
        a[index]=sc.nextInt();
    }
    int first=0;
    int last=a.length-1;
    int mid;
    
    System.out.println("Enter your item your want to find");
    item=sc.nextInt();
    do
    {
       mid=(first+last)/2;
       if (a[mid]==item)
       {
           System.out.println("found at ->"+mid);
           break;
       }
       else
        if(a[mid]>item)   
        last=mid-1;
       else
        first=mid+1;
       
    }
    while(first<=last);
    if(first>last)
    System.out.println("not Found");
}
}
