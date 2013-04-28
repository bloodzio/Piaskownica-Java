package com.dziedziczenie;

abstract class  OwocAbs{
    public void f(){System.out.println("jestem F z Owocu");}
}
class FigaAbs extends OwocAbs{
    public void f(){System.out.println("jestem F z figi");}
    public void u(){System.out.println("jestem U z figi");}
}


class Owoc{
    public void f(){System.out.println("jestem F z Owocu");}
    
}

class Figa extends Owoc{
    public void f(){System.out.println("jestem F z figi");}
    public void u(){System.out.println("jestem U z figi");}
}

public class RzutowanieWDol
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
       Owoc [] x={new Owoc(),new Figa()};
       x[0].f();
       x[1].f();
       //x[1].u(); //blad
      ((Figa) x[1]).u(); /// Rzutowanie z z klasy figi
    
    }

}
