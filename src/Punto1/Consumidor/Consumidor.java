package Punto1.Consumidor;

import Punto1.Tuberia;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Consumidor extends Thread{

    private Tuberia tuberia;
    private char[] palabra = {'p','r','o','g','r','a','m','a','c','i','o','n','3'};
    private char[] palabraNueva =new char[13];

    private ArrayList<Character> letrasQueNoEstan = new ArrayList<Character>();

    private String palabra1 = "programacion3";

    public Consumidor( Tuberia t )
    {
        // Mantiene una copia propia del objeto compartido
        tuberia = t;
    }

    public void run() {
        char c;

        // Consume 10 letras de la tuberÌa
        for( int i=0; i < 500; i++ )
        {
            c = tuberia.recoger();
            // Imprime las letras retiradas
            if (palabra1.contains(""+c)){
                //System.out.print(c);
                for (int j =0;j<palabraNueva.length;j++){
                    if(c==palabra[j]){
                        palabraNueva[j]=c;
                        System.out.println(palabraNueva);
                    }

                }

            }
            else{
                letrasQueNoEstan.add(c);
            }


            // Espera un poco antes de coger m·s letras
            try
            {
                sleep( 1500 );
            }
            catch( InterruptedException e )
            {

            }
        }
        System.out.println(letrasQueNoEstan);
    }
}
