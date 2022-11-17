package Punto1.Productor;

import Punto1.Tuberia;

public class P2 extends Thread{

    private Tuberia tuberia;
    private String alfabeto = "qwrtypsdfghjklzxcvbnm";

    public P2( Tuberia t )
    {
        tuberia = t;
    }

    public void run() {
        char c;

        // Mete 10 letras en la tuberÌa
        for( int i=0; i < 5000; i++ )
        {
            c = alfabeto.charAt( (int)(Math.random()*21 ) );
            tuberia.lanzar( c );
            try
            {
                sleep( 3000 );
            }
            catch( InterruptedException e )
            {
                System.out.println(e);;
            }
        }
    }

}
