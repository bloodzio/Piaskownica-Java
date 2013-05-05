/**
 * 
 */
package com.watki;

/**
 * @author Leszek
 *
 */
public class demon extends Thread
{
    private int countDown = 5;
    private static int threadCount = 0 ;
    
    public demon()
    {
       
        super(""+ ++threadCount);
        System.out.println("Tworze nowy watek demony : #"+threadCount);
        setDaemon(true);
        start();
    }
    public void run()
    {
        while(true)
        {
            try{
                sleep(100);
            }catch ( InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println(" To ja niepokorny");
        }
       
    }
    public String toString()
    {
        return "#"+getName()+": "+ countDown;
    }
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        for (int i =0; i<10;i++)
        {
            new demon();
            
        }
        
    }

}
