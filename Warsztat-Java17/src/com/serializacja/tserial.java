package com.serializacja;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Klasa1 implements Serializable
{
    private int n;
    public Klasa1(int n){this.n=n;}
 
    public String toString(){return Integer.toString(n);}
    
}

public class tserial implements Serializable
{

    /**
     * @param args
     */
    public static void main(String[] args)
    throws ClassNotFoundException ,IOException
    {
        Klasa1 k1 = new Klasa1(1);
        System.out.println("Klasa numer :"+k1);
        ObjectOutputStream out = new  ObjectOutputStream(
                new FileOutputStream("worm.out"));
       out.writeObject("Zapis Klasy1");
        out.writeObject(k1);
        out.close();
        
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("worm.out"));
        String s = (String)in.readObject();
        System.out.println(s);
        Klasa1 NowaK1 = (Klasa1)in.readObject();
        System.out.println(NowaK1);
        in.close();
    }
}
