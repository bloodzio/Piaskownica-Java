package com.watki;

import java.util.*;
import java.math.*;

public class Timeout extends Timer
{
    public Timeout(int delay,final String msg)
    {
        super(true); // watek demona
        schedule(new TimerTask()
        {
            public void run()
            {
                System.out.println(msg);
                System.exit(0);
            }
            
        },delay);
      
    }

    public static void main(String[] args)
    {
        
        
      new Timeout(9999," timeout ");
      System.out.println(fib(43));
    }


// 0, 1, 1, 2, 3, 5, 8, 13, 21, .
     
    public static int fib(int n) {
        if (n < 2) {
           return n;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
}
    
         
    
}