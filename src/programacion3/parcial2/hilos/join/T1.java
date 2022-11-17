package programacion3.parcial2.hilos.join;

public class T1 extends Thread{

    private int sum = 0;

    @Override
    public void run() {
        //sum=(suma(4, 2, 0));
        sum= 3;


    }

    public int suma(int num1, int num2, int i){

        if (i<9){
            return suma(num1,num2, i+1)+ num1+num2;
        }
        return num1+num2;



    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
