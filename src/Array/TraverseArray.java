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
public class TraverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n;
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[];
        a = new int [n];
        for(int index=0;index<a.length;index++)
        { 
            System.out.println("Enter Array elements -> ");
            a[index]=sc.nextInt();
        }
        for(int index=0;index<a.length;index++)
        {
            System.out.println("your array is ->"+a[index]);
        }
    }
    
}
