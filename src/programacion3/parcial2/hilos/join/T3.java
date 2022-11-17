package programacion3.parcial2.hilos.join;

public class T3 extends Thread{

    private int numerosCons = 0;

    @Override
    public void run() {
        //numerosCons = (numeroConsonantes());
        numerosCons = 3;
    }

    public int numeroConsonantes(){
        int consonantes = 0;
        String palabra = "electroencefalografista";
        for (int i = 0; i<palabra.length();i++){
            char letra = palabra.charAt(i);
          if(!Character.isDigit(letra) && letra!='a' && letra!='e'&& letra!='i'&& letra!='o'&& letra!='u'){
              consonantes++;
          }
        }
        return consonantes;
    }

    public int getNumerosCons() {
        return numerosCons;
    }

    public void setNumerosCons(int numerosCons) {
        this.numerosCons = numerosCons;
    }
}
