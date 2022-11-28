import java.sql.Array;
import java.util.ArrayList;

class EOdd extends Thread{
     int n;
     int result=0;

     EOdd(int n){
         this.n=n;
     }

     public void run(){
         for(int i=1;i<n;i++){
             result+=1/factorial(2*i+1);
         }
     }

     int factorial(int n){
         int fact=1;
         for(int i=1;i<n;i++){
             fact*=i;
         }
         return fact;
     }

     int getResult(){
         return result;
     }
}

class EEven extends Thread{
    int n;
    int eresult=0;

    EEven(int n){
        this.n=n;
    }

    public void run(){
        for(int i=1;i<n;i++){
            eresult+=1/factorial(2*i);
        }
    }

    int factorial(int n){
        int fact=1;
        for(int i=1;i<n;i++){
            fact*=i;
        }
        return fact;
    }

    int getResult(){
        return eresult;
    }
}

public class Q5 {
    public static void main(String[] argc) throws InterruptedException {
        ArrayList<Thread> threads=new ArrayList<>();
        for(int i=0;i<10;i++){
            EOdd odd=new EOdd(i);
            EEven even=new EEven(i);
            odd.start();
            even.start();
            threads.add(odd);
            threads.add(even);
        }

        for(Thread t:threads){
            t.join();
        }

        double result=0;
        for(Thread t: threads){
            if( t instanceof EEven){
                result+=((EEven)t).getResult();
            }else{
                result+=((EOdd) t).getResult();
            }
        }

        System.out.println(result);
    }

}
