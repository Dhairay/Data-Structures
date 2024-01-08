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
public class DeletionArray 
{
    public static void main(String [] args)
    {
        int pos,item,index;
        int n;
        System.out.println("Enetr N -> ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[];
        a=new int[n];
        for(index=0;index<a.length;index++)
        {
            System.out.println("Enter Array Elements ->");
            a[index]=sc.nextInt();
        }
        System.out.println("Enter position you Want to Delete ->");
        pos=sc.nextInt();
          for(index=pos;index<a.length-1;index++)
        {
            a[index]=a[index+1];
        }
          System.out.println("After Deleting array");
          for(index=0;index<a.length-1;index++)
          {
              System.out.println(a[index]);
          }
    }
    
}
