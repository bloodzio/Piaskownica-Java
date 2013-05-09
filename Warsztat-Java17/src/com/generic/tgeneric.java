package com.generic;

import java.util.*;

import java.lang.reflect.*;

class Klasa1<S,T>
{
    S frist;
    T last;
    
    public S getFrist()
    {
        return frist;
    }


    public void setFrist(S frist)
    {
        this.frist = frist;
    }


    public T getLast()
    {
        return last;
    }


    public void setLast(T last)
    {
        this.last = last;
    }





    public  Klasa1(S f,T l)
    {
        frist = f;
        last  = l;
    }
  
}

public class tgeneric
{

    public static void main(String[] args)
    {
      
      Klasa1<String,String>     k1 = new Klasa1<String,String>("Jan","Kowalski");
      Klasa1<String,Integer>    k2 = new Klasa1<String,Integer>("Jan",1);
      Klasa1<Integer,Integer>   k3 = new Klasa1<Integer,Integer>(1,2);
     
      /**
       *  Metoda refleksyjna
       *  */
      Class k1Class = k1.getClass();
      /** Zwraca tablicę metod deklarwoanych w klasie1
       * czyli getFrist(),
       *  */
      Method[] mets = k1Class.getDeclaredMethods();
      for (Method m : mets ) System.out.println(m);
     
      String sk1 = k1.getFrist();
      Klasa1 sk2 = new Klasa1("asda","asda");
      System.out.println(sk2.getFrist());
      
    }

}
