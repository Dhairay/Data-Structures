/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Scanner;

class Circular
{
        int q[],max;
        int front=-1,rear=-1;

    public Circular()
    {
        
        System.out.println("Enter N ->");
        Scanner sc=new Scanner(System.in);
        max=sc.nextInt();
        q=new int[max];
    }
    void insertion()
    {
        Scanner sc=new Scanner(System.in);
            if(((rear+1)%(max))==front)
            System.out.println("Over-Flow");
            else
            {
                int item;
                System.out.println("Enter Item -> ");
                item=sc.nextInt();
                if(front==-1)
                {
                    front++;
                    rear++;
                }
                else
                {
                    rear=(rear+1)%(max);
                }
                System.out.println(rear);
                q[rear]=item;
           }
    }
    void deletion()
    {
        if(front==-1)
            System.out.println("Under-Flow");
        else
        {
            System.out.println(q[front]);
            if(front==rear)
                front=rear=-1;
            else
                front=(front+1)%(max);
        }
    }
    void Display()
    {
        int index;
        for(index=front;index<=rear;index++)
        {
            System.out.println(q[index]);
        }
    }
}
/**`
 *
 * @author Dhair
 */
public class CircularQueue
{
public static void main(String [] args)
{
    int ch;
    Circular cir=new Circular();
    Scanner sc=new Scanner(System.in);
    do
    {
        System.out.println("Enter 1 for Insertion ->");
        System.out.println("Enter 2 for Deletion ->");
        System.out.println("Enter 3 to display ->");
        System.out.println("Enter 4 to exit ->");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                cir.insertion();
                break;
            case 2:
                cir.deletion();
                break;
            case 3:
                cir.Display();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.err.println("Wrong choice");                
        }
    }while(ch!=4);
}
}
