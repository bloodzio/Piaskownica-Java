package com.generic;
    
      
        
public class konkludowanieTypow
{

    public static <T extends Comparable<T>> T max(T[] arr) 
    {
        T max = arr[0];
        for (int i=1; i<arr.length; i++)
            if (arr[i].compareTo(max) > 0) max = arr[i];
            return max;
    }
  
    public static void main(String[] args)
    {
        Integer[] i = {1,2,3,4};
        int imax = max(i);
        Double[] d = {1.2,231.7};
        double dmax= max(d);
      
    }

}
