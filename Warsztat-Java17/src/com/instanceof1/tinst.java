package com.instanceof1;
interface Oko
{
    void Show();
}

class klasa1 implements Oko
{
    public void Show()
    {
        System.out.println("Klasa1");
    }
}

class klasa2 implements Oko
{
    public void Show()
    {
        System.out.println("Klasa2");
    }
}
public class tinst
{

   

    /**
     * @param args
     */
    public static void main(String[] args)
    {
    
  
     Oko[] o ={new klasa1(),new klasa2()};
         
         for (int i=0;i<=1;i++)
         {
             o[i].Show();
             System.out.println(o[i].getClass());
             System.out.println(klasa1.class.isInstance(o[i]));
             
             if (o[i] instanceof klasa1)
             {
                 System.out.println("to byla klasa1");
             
             }
         }
    }

}
