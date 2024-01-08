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
public class TwoDArray 
{
public static void main(String[] args)
{
    int n,m;
    int index;
    int row,col;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n ->");
    n=sc.nextInt();
    System.out.println("ENter m->");
    m=sc.nextInt();
    int a[][];
    a=new int[n][m];
    for(row=0;row<a.length;row++)
    {
     for(col=0;col<a.length;col++)
     {
         System.out.println("Enter you Array ->");
         a[row][col]=sc.nextInt();
     }
     for(row=0;row<a.length;row++)
     {
         for(col=0;col<a.length;col++)
         {
             System.out.print(a[row][col]+" ");
         }
     }
        System.out.println("");
    }
}
}