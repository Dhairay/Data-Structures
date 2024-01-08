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
public class InsertionArray 
{
public static void main(String[] args)
{
int pos,item,index;
int n;

    System.out.println("Enter N -> ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int a[];
    a=new int[n];
    for(index=0;index<a.length-1;index++)
    {
        System.out.println("Enter Array Elements ->");
        a[index]=sc.nextInt();
    }   
    System.out.println("Enter item and pos You want to Insert ->");
    item=sc.nextInt();
    pos=sc.nextInt();
    for(index=a.length-2;index>=pos;index--)
    {
        a[index+1]=a[index];                
    }   
    a[pos]=item;
    System.out.println("Array After Insertion ->");
    for(index=0;index<a.length;index++)
    {
        System.out.println(a[index]);
    }
}
}
