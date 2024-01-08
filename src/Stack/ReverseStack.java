/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Scanner;

class ReverseDemo
{
   
    int Max;
    char S[];
    int Top;

    public ReverseDemo(int len) 
    {
        Max = len;
        S = new char[Max];
        Top=-1;
      }
    
    void push(char ch)
    {
       if(Top==Max-1)
            System.out.println("Over-Flow");
       else 
       {
           Top++;
           S[Top]=ch;
       }
    }
    char pop()
    {
        char ch=' ';
    if(Top==-1)
            System.out.println("Under-Flow");
    else
    {
        
        ch=S[Top];
        Top--;
        
    }
    return ch;
    }
   
}
public class ReverseStack 
{
public static void main(String[] args)
{
    int ch;
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    str =sc.nextLine();
    ReverseDemo obj = new ReverseDemo(str.length());    
    char ar[]= str.toCharArray();
    int index=0;
    while(index<ar.length)
    {
        obj.push(ar[index]);
        index++;
    }
    
    while(obj.Top>=0)
    {
        System.out.println(obj.pop());
    }
               
}
    
}

