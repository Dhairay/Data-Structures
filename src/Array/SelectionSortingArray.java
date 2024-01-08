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
public class SelectionSortingArray
{
public static void main(String[] args)
{
    int pass;
    int n,count,temp;
    System.out.println("Enter n -> ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int a[];
    a=new int[n];
    for(int index=0;index<a.length;index++) 
    {
        System.out.println("Enter Elements -> ");
        a[index]=sc.nextInt();
    }
    for(pass=0;pass<a.length-1;pass++)
    {
   
    for(count=pass+1;count<a.length;count++)
    {
        if(a[pass]>a[count])
        {
            temp=a[pass];
            a[pass]=a[count];
            a[count]=temp;
        }
       
    }
    
    }
    System.out.println("sorted array");
    for(int index=0;index<a.length;index++) 
    {
        System.out.println(a[index]);
    }
    
}
}
