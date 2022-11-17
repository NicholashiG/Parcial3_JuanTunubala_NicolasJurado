package Punto1;

import Punto1.Consumidor.Consumidor;
import Punto1.Productor.P1;
import Punto1.Productor.P2;
import Punto1.Productor.P3;

public class Main1 {

    /*
     * @authors Nicolás Jurado Ramirez y Juan Manuel Tunubala
     */

    // Para pruebas, se necesita bajar los tiempos de espera, de lo
    // contrario, se va a demorar una eternidad

    public static void main( String args[] ) {
        Tuberia t = new Tuberia();
        P1 p1 = new P1( t );
        P2 p2 = new P2( t );
        P3 p3 = new P3( t );
        Consumidor c = new Consumidor(t);

        p1.start();
        p2.start();
        p3.start();
        c.start();
    }
}