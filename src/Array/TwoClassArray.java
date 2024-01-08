/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

class InputArray
{
    int n;
    int a[];
    int pass,count,temp,item,sum;

    public InputArray()
    {
    System.out.println("Enter n->");
    Scanner sc=new Scanner(System.in);    
    n=sc.nextInt();
    a=new int[n];    
    }
    
    void input()
    {
    for(int index=0;index<a.length;index++)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements -> ");
        a[index]=sc.nextInt();
    }
    }

    void SortArray()
   
    {
        int ch; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Bubble Sort");
        System.out.println("Enter 2 for Selection sort");
        ch=sc.nextInt();
        switch(ch)
        {
        case 1:
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
     break;
     case 2:
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
    break;
    }
    }
    void SearchArray()
    {
    int first=0;
    int last=a.length-1;
    int mid;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your item your want to find");
    item=sc.nextInt();
    do
    {
       mid=(first+last)/2;
       if (a[mid]==item)
       {
           System.out.println("found at -> "+mid);
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
    void select()
    {
        int ch;
        int index,pos,m;
       do
       {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for insert ->");
        System.out.println("Enter 2 for Delete ->");
        System.out.println("Enter 3 for Merging ->");
        System.out.println("Enter 4 If you want to find Smaller Array ->");
        System.out.println("Enter 5 if you want to find Bigger Array ->");
        System.out.println("Enter 6 for sum ->");
        System.out.println("Enter 7 if you want to Reverse -> ");
        System.out.println("Enter 8 for Exit ->");
        ch=sc.nextInt();
        switch(ch)
        {
        case 1:
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
        break;
        case 2:
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
          break;
        case 3:
        System.out.println("Enter m values");
        m=sc.nextInt();
        int b[];
        b=new int[m];
    for(index=0;index<b.length;index++)
    {
        System.out.println("Enter B Array Elements -> ");
        b[index]=sc.nextInt();
    }
    int c[];
    c=new int[n+m];
    for(index=0;index<c.length;index++)
    {
        if(index<m)
            c[index]=a[index];
        else
            c[index]=b[index-m];
        System.out.println(c[index]);
    }
        break;
        case 4:
        int small=a[0];
        for(index=1;index<a.length;index++)
    {
        if(a[index]<small)
        small=a[index];              
    }
        System.out.println("Your Smallest Number is-> "+small);
        break;
        case 5:
        int big=a[0];
        for(index=1;index<a.length;index++)
        {
            if(a[index]>big)
            big=a[index];
        }
            System.out.println("Your Bigger Nuber is "+big);
            break;
        case 6:
            for(index=0;index<a.length;index++)
               sum=sum+a[index];
            {
                System.out.println("Your sum is ->" +sum );
            }
            break;
        case 7:
            for(index=a.length-1;index>=0;index--)
    {
        System.out.println(a[index]);
    }
            break;
        case 8:
            System.out.println("Exit");
            break;
        default:
            System.out.println("Wrong Choice");
            
            
       }
       
    }
       while(ch!=8);
    
}
}
public class TwoClassArray
{
public static void main(String [] args)
{
 InputArray inarr;
 inarr= new InputArray();
 inarr.input();
 inarr.SortArray();
 inarr.SearchArray();
 inarr.select();
}
}
