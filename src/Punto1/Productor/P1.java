package Punto1.Productor;

import Punto1.Tuberia;

public class P1 extends Thread{

    private Tuberia tuberia;
    private String alfabeto = "aeiou";

    public P1( Tuberia t )
    {
        tuberia = t;
    }

    public void run() {
        char c;

        for( int i=0; i < 5000; i++ )
        {
            c = alfabeto.charAt( (int)(Math.random()*5 ) );
            tuberia.lanzar( c );
            try
            {
                sleep( 2000 );
            }
            catch( InterruptedException e )
            {
                System.out.println(e);;
            }
        }
    }

}
