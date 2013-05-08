package com.generic;

import java.util.*;

import java.lang.reflect.*;

class Klasa1<S,T>
{
   public S frist;
    T last;


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
     
      Class k1Class = k1.getClass();
      Method[] mets = k1Class.getDeclaredMethods();
      for (Method m : mets ) System.out.println(m);
      
    }

}
