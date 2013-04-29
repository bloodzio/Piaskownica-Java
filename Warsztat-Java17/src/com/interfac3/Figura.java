package com.interfac3;

interface IntFigura
{
    void setColor(String kolor);

    String getColor();

    String toString();
    

}
 class Kolo implements IntFigura{

    @Override
    public void setColor(String kolor)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getColor()
    {
        // TODO Auto-generated method stub
        return null;
    }
    public String toString()
    {
        return "Jestem kolem";
    
    }


}

class Kwadrat implements IntFigura
{

    @Override
    public void setColor(String kolor)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getColor()
    {
        // TODO Auto-generated method stub
        return null;
    }
    public String toString()
    {
        return "Jestem kwadrat";
    
    }
}
public class Figura
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        IntFigura [] Figury = { new Kolo(),new Kwadrat()};
        
       for (int i=0;i<=1;i++)
       {
           System.out.println(Figury[i].toString());
       }
    }

}
