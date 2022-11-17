package Punto1.Productor;

import Punto1.Tuberia;

public class P3 extends Thread{

    private Tuberia tuberia;
    private String alfabeto = "0123456789";

    public P3( Tuberia t )
    {
        tuberia = t;
    }

    public void run() {
        char c;

        for( int i=0; i < 5000; i++ )
        {
            c = alfabeto.charAt( (int)(Math.random()*10 ) );
            tuberia.lanzar( c );
            try
            {
                sleep( 1000 );
            }
            catch( InterruptedException e )
            {
                System.out.println(e);;
            }
        }
    }

}
