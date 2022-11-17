package programacion3.parcial2.hilos.join;

public class T2 extends Thread{

    private long factorial = 0;

    @Override
    public void run() {
        //factorial=fact(6);
        factorial=3;
    }

    public static long fact(long n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public long getFactorial() {
        return factorial;
    }

    public void setFactorial(long factorial) {
        this.factorial = factorial;
    }
}
