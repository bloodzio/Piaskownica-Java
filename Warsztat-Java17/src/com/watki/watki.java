package com.watki;

public class watki extends Thread
{
    private int countDown = 5;
    private static int threadCount = 0 ;
    public watki()
    {
        super(""+ ++threadCount);
        start();
        if (countDown%2==0)
        {
        setPriority(MAX_PRIORITY);
        }else
        {
            setPriority(MIN_PRIORITY);
        }
    }
    
    public void run()
    {
        while(true)
        {
        
            System.out.println(this);
            if (countDown==5)
            {
                try{
                    sleep(100);
                }catch(InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
            else if(countDown <= 1)
            {
                yield();
                return;
            }
            --countDown;
        }
          
    }
    
    public String toString()
    {
        return "#"+getName()+": "+ countDown;
    }
    
    
   
    public static void main(String[] args)
    throws InterruptedException
    {
        for (int i = 1; i<=5; i++)
        {
            new watki();
            
            System.out.println("Tworzenie watka #"+i);
        }

    }

}
