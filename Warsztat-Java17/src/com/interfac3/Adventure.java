package com.interfac3;

interface CanFight
{
    void fight();
}

interface CanSwim
{
    void swim();
}

interface CanFly
{
    void fly();
}

class Action
{
    public void fight()
    {
        System.out.println("Jestem fight z Action");
    }
}

class Hero extends Action implements CanFight, CanFly, CanSwim
{
    public void swim()
    {
        System.out.println("Jestem swim z Hero");
    }

    public void fly()
    {
    }
   /* public void fight()
    {
        System.out.println("Jestem fight z Hero");
    }*/
}
class NextHero extends Hero{
    
}
public class Adventure
{

    public static void main(String[] args)
    {
        
        Hero h1 = new Hero();
        NextHero h2 = new NextHero();
        h1.swim();
        h1.fight();
        h2.swim();
        h2.fight();
        
    }

}
