import java.util.ArrayList;
import java.util.Random;

public class MaxValue extends Thread {
    int[] arr;
    int max;

    MaxValue(int[] arr) {
        this.arr = arr;
        this.max = 0;
    }

    public void run() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }

    public void start() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ", ");
        }
        System.out.println("\n");
        run();
    }

    public int getMax() {
        return max;
    }

}


class MaxValueApp {
    public static void main(String[] argc) throws InterruptedException {
        ArrayList<MaxValue> threads=new ArrayList<>();
        Random rd = new Random();
        int[] arr = new int[5];
        for (int j = 0; j < 5; j++) {
            arr[j] = rd.nextInt();
        }

        for(int i=0;i<4;i++){
            MaxValue mv=new MaxValue(arr);
            mv.start();
            threads.add(mv);
        }

        for(MaxValue mv:threads){
            mv.join();
        }

        int max=0;
        for(MaxValue mv:threads){
            if(mv.getMax()>max){
                max=mv.getMax();
            }
        }
        System.out.println(max);




    }
}
