
package Queue;

import java.util.Scanner;

class Queue
{
        int n,q[];
        int front=-1,rear=-1;
        public Queue()
    {
        
        System.out.println("Enter N ->");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        q=new int[n];
    }
    void Insert()
    {
      int item;
        Scanner sc=new Scanner(System.in);
      if(rear==n-1)
            System.out.println("Over-Flow");
      else
      {
          System.out.println("Enter Item");
          item=sc.nextInt();
          if(front==-1)
              front++;
          rear++;
          q[rear]=item;
      }
    }
    void Delete()
    {
        if(front==-1)
            System.out.println("Under-FLow");
        else
        {
            System.out.println(q[front]);
            front++;
            if(front>rear)
                front=rear=0;
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
    void InsertionAtBegg()
    {
        int item;
        Scanner sc=new Scanner(System.in);
        if(front==0)
            System.out.println("Over-flow");
        else
        {
            
            System.out.println("Enter Item");
            item=sc.nextInt();
            if (front==-1)
                front=rear=0;
            else
                front--;
            q[front]=item;
        }
    }
    void DeletionAtBegg()
    {
        if(rear==-1)
            System.out.println("Under-Flow");
        else
        {
            System.out.println(q[rear]);
            rear--;
            if(front>rear)
                front=rear=-1;
        }
    }
}
/**
 *
 * @author My Pc
 */
public class QueueInsDel 
{
public static void main(String [] args)
{
    int ch;
    Queue que;
    que=new Queue();
    Scanner sc=new Scanner(System.in);
    do
    {
        System.out.println("Enter 1 for Insertion ->");
        System.out.println("Enter 2 for Deletion ->");
        System.out.println("Enter 3 For Insertion At Begenning ->");
        System.out.println("Enter 4 For Deletion At Begenning ->");
        System.out.println("Enter 5 for Display ->");
        System.out.println("Enter 6 to exit ->");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                que.Insert();
                break;
            case 2:
                que.Delete();
                break;
            case 3:
                que.InsertionAtBegg();
                break;
            case 4:
                que.DeletionAtBegg();
                break;
            case 5:
                que.Display();
                break;
            case 6:
                System.out.println("exit");
            default:
                System.err.println("Wrong choice");
                    
        }
    }while(ch!=6);
}
}
