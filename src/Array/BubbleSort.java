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
public class BubbleSort 
{
 public static void main(String [] args)
 {
     int pass,count;
     int n,temp;
     System.out.println("Enter N -> ");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     int a[];
     a=new int[n];
     for(int index=0;index<a.length;index++)
     {
         System.out.println("Enter your Elements -> ");
         a[index]=sc.nextInt();
     }
     for(pass=0;pass<a.length-1;pass++)
     {
      for(count=0;count<a.length-pass-1;count++)
      {
          if(a[count]>a[count+1])
          {
              temp=a[count];
              a[count]=a[count+1];
              a[count+1]=temp;
          }
      }
     }
     System.out.println("Bubble Sort");
     for(int index=0;index<a.length;index++)
         {
          System.out.println(a[index]); 
         }
 }
}
