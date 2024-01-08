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
public class SearchingArray 
{
 public static void main(String [] args)
 {
     
     int n,item,index;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n ->");
    n=sc.nextInt();
     int a[];
     a=new int[n];
      for(index=0;index<a.length;index++)
     {
              System.out.println("Enter Array Elements->");
              a[index]=sc.nextInt();
     }
     System.out.println("Select Iteam");
     item=sc.nextInt();
     for(index=0;index<a.length;index++)
     {
         if(a[index]==item)
         {
             System.out.println("found at index-> " + index + " and array element is - " +a[index]);
             break;
         }
     
      }
     
         if(index==a.length)
         System.out.println("not found");
     }
     
         
}
