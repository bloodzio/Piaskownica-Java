package wsti.modelowanie.LFSR;

public class LFSR
{

    static int znajdzNajwiekszaPotege(String wielomian)
    {
        int potega = 1;
        for (int i = 0; i < wielomian.length(); i++)
        {
            if (wielomian.charAt(i) == '^')
            {
                potega = 0;
                i++;
                do
                {
                    potega = potega * 10;
                    potega = potega + Character.digit(wielomian.charAt(i), 10);
                    i++;
                    if (i >= wielomian.length())
                    {
                        break;
                    }
                } while (wielomian.charAt(i) != '+');
            }
        }
        return potega;
    }

    static int[][] wielomianToMacierzPolaczen(String wielomian)
    {
        int max = znajdzNajwiekszaPotege(wielomian);
        int[][] Macierz = new int[max + 1][max + 1];
        CharSequence s = "1+x^";

        if (wielomian.contains(s))
        {
            Macierz[0][0] = 1;

        }
        for (int i = 1; i <= max; i++)
        {
            s = null;
            s = "x^" + i;
            if (wielomian.contains(s))
            {

                Macierz[i - 1][0] = 1;
                Macierz[i - 1][i] = 1;
                // System.out.println("ok " + i);

            } else
            {
                // System.out.println("no " + i);
                Macierz[i - 1][i] = 1;

            }

        }

        return Macierz;
    }

    static int[][] MacierzPolaczenToMaksymalnyCykl(String wielomian)
    {
        int max = znajdzNajwiekszaPotege(wielomian);
        int[][] mP = wielomianToMacierzPolaczen(wielomian);
        int stan[][] = new int[max+1][max+1];
        int wynik=0;
        int k=max;
        for (int i = 0; i <= max - 1; i++)
        {
            stan[0][i] = 0;

            if (i == max - 1)
            {
                stan[0][i] = 1;
            }
        }

        for (int i = 0; i <= max - 1; i++)
        {
            for (int x = 0; x <= max-1; x++)
            {
                wynik=0;
                for (int y = 0; y <= max-1; y++)
                {
                    //System.out.println(y+" poc "+k+" "+wynik);
                    wynik=mP[x][y]*stan[i][k]+wynik;
                    k--;
                    //System.out.println(y+" kon "+wynik);
                }
                
                stan[i+1][x]=wynik;
                k=max;
                
            }
        }
        return stan;
    }

    public static void pokazMaceirzPolaczen(String wielomian)
    {
        int max = znajdzNajwiekszaPotege(wielomian) - 1;
        int m[][] = wielomianToMacierzPolaczen(wielomian);
        System.out.print("  ");
        for (int x = 0; x <= max; x++)
        {
            System.out.print(" " + "Q" + x);
        }
        System.out.println();
        for (int x = 0; x <= max; x++)
        {
            System.out.print("Q" + x + " |");

            for (int y = 0; y <= max; y++)
            {
                System.out.print(m[y][x] + "  ");

            }
            System.out.println();
        }
    }

    public static void pokazMaksymalnyCykl(String wielomian)
    {

    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        String wielomian = "1+1*x^1+x^3";
        // System.out.println(znajdzNajwiekszaPotege(wielomian));
        // System.out.println(wielomianToMacierzPolaczen(wielomian));
        pokazMaceirzPolaczen(wielomian);
        MacierzPolaczenToMaksymalnyCykl(wielomian);
    }

}
