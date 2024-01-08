/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author My Pc
 */
class RecDemo
{
     int fact(int n1)
    {
        if(n1==1 || n1==0)
            return 1;
        else
            return n1*fact(n1-1);
        
        
    }
    int power(int x1, int n1) 
    {
        if(n1==0)
            return 1;
        else
            return x1*power(x1,n1-1);
    }
}
public class Recursion {
    public static void main(String[] args) {        
         System.out.println( new RecDemo().fact(5));
         System.out.println( new RecDemo().power(2,3));
    }
    
}
