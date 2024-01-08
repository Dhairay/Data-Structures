/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Scanner;

class Stack
{
    int n;
    int s[],top=-1;

    public Stack()
    {
        System.out.println("Enter N -> ");
        Scanner sc = new Scanner(System.in);
         n=sc.nextInt();
         s=new int[n];    
    }
    
    void Push()
    {
        int item=0;
        Scanner sc=new Scanner(System.in);
        if(top==n-1)
            System.out.println("Over-Flow");
        else
        {
            System.out.println("Enter Item");
            item=sc.nextInt();
            top++;
            s[top]=item;
        }
     }
    void pop()
    {
        if(top==-1)
            System.out.println("Under-Flow");
        else
        {
            System.out.println(s[top]);
            top--;
        }        
    }
    void display()
    {
        
        for(int index=top;index>=0;index--)
            System.out.print(s[index]+" ");
    }
}

/**
 *
 * @author My Pc
 */
public class PushPop 
{
public static void main(String [] args)
{
 
        int ch;
        Stack stk;
        stk=new Stack();
        Scanner sc=new Scanner(System.in);
        do
        {
        System.out.println("Enter your Choice ");
        System.out.println("Enter 1 to push");
        System.out.println("Enter 2 for pop");
        System.out.println("Enter 3 for Display");
        System.out.println("Enter 4 for Exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            stk.Push();
            break;
            case 2:
            stk.pop();
            break;
            case 3:
            stk.display();
            break;
            case 4:
            System.out.println("exit");
            break;
            default:
            System.out.println("Wrong Choice");
        }
        }
        while(ch!=4);
}
}
