package com.klasy_wewnetrzne;

public class ZwracanieReferencjiKlasyWew
{
 
    class KlasaWew1
    {
        private int  i = 11;
        int value(){ return i;}
    }
 
    public KlasaWew1 RefKlasyWew1()
    {
        return new KlasaWew1();
    };
    
    public static void main(String[] args)
    {
        ZwracanieReferencjiKlasyWew zew = new ZwracanieReferencjiKlasyWew();
        ZwracanieReferencjiKlasyWew.KlasaWew1 c = zew.RefKlasyWew1();
        System.out.println(c.value());
        //KlasaZew1 c2 = zew.RefKlasyWew1();
        
    }

}
