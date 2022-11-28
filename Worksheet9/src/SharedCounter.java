import java.util.ArrayList;

public class SharedCounter extends Thread{
    static int counter=0;

    void increment(){
        SharedCounter.counter++;
    }

    public void run(){
        for(int i=0;i<10;i++){
            increment();
            try{
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static int getCounter(){
        return SharedCounter.counter;
    }
}

class SharedCounterApp{
    public static void main(String[] agc) throws InterruptedException {
        ArrayList<SharedCounter> threads= new ArrayList<>();

        for(int i=0;i<10;i++){
            SharedCounter sc=new SharedCounter();
            sc.start();
            threads.add(sc);
        }

        for(SharedCounter sc:threads){
            sc.join();
        }

        System.out.println(SharedCounter.getCounter());
    }
}
