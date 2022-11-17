package Punto1;

public class Tuberia {
    private char buffer[] = new char[8];

    private int siguiente = 0;
    // Flags para saber el estado del buffer
    private boolean estaLlena = false;
    private boolean estaVacia = true;


    // MÈtodo para retirar letras del buffer
    public synchronized char recoger()
    {
        // No se puede consumir si el buffer est· vacÌo
        while( estaVacia == true )
        {
            try {
                wait(); // Se sale cuando estaVacia cambia a false
            } catch( InterruptedException e ) {

            }
        }
        // Decrementa la cuenta, ya que va a consumir una letra
        siguiente--;
        // Comprueba si se retirÛ la ˙ltima letra
        if( siguiente == 0 )
            estaVacia = true;
        // El buffer no puede estar lleno, porque acabamos
        // de consumir
        estaLlena = false;
        notify();

        // Devuelve la letra al thread consumidor
        return( buffer[siguiente] );
    }



    // MÈtodo para aÒadir letras al buffer
    public synchronized void lanzar( char c )
    {

        // Espera hasta que haya sitio para otra letra
        while( estaLlena == true )
        {
            try {
                wait(); // Se sale cuando estaLlena cambia a false
            } catch( InterruptedException e ) {

            }
        }
        // AÒade una letra en el primer lugar disponible
        buffer[siguiente] = c;
        // Cambia al siguiente lugar disponible
        siguiente++;
        // Comprueba si el buffer est· lleno
        if( siguiente == 8 )
            estaLlena = true;
        estaVacia = false;
        notify();
    }
}

