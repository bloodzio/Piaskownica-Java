package com.generic;

class Klasa2<T>
{
    private T frist;
    private T last;
    
    public T getFrist()
    {
        return frist;
    }

    public T getLast()
    {
        return last;
    }

    public Klasa2(T f,T l)
    {
        frist   =   f;
        last    =   l;
        
    }
}

class GenerujTablice<T >
{
    private T[] arr;
    private Klasa2<T> k2;
    public GenerujTablice(T[] a)
    {
        init(a);
    }
    public void init(T[] a)
    {
        k2 = null;
        arr = a;
    }
  
    public Klasa2<T> getKlasa2(){
        
        T frist= arr[0];
        T last=arr[1];
        
        k2 = new Klasa2<T>(frist,last);
        
        return k2; 
                
    }
    
}


public class OgraniczenieParametrowTypu_T 
{


    public static void main(String[] args)
    {
      Integer[] arr1 = {1,2,7,-3};
      Integer[] arr2 ={ 2,7,8,-10};
      String[] napisy = {"A","Z","C"};
      
      // Integer
      GenerujTablice<Integer> t1 = new GenerujTablice<Integer>(arr1);
      Klasa2<Integer> kInt = t1.getKlasa2();
      System.out.println(kInt.getFrist());
      
      t1.init(arr2);
      kInt = t1.getKlasa2();
      System.out.println(kInt.getFrist());
      
      // String
      
      GenerujTablice<String> t2 = new GenerujTablice<>(napisy);
      Klasa2<String> kString = t2.getKlasa2();
      System.out.println(kString.getFrist());
      
      for (int i=0;i<1;i++)
      {
         
      }
      
      
    }

}
