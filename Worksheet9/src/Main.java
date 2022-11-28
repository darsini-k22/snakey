import java.util.ArrayList;

class GreatestDivisor extends Thread {
    int N;
    int result;

    GreatestDivisor(int N) {
        this.N = N;
        this.result = 0;
    }

    public void run() {
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                result++;
            }
        }
    }

    int getResult() {
        return result;
    }

    int getN() {
        return N;
    }

}

class Main {
    public static void main(String[] argc) throws InterruptedException {
        ArrayList<GreatestDivisor> t1 = new ArrayList<GreatestDivisor>();
        for (int i = 0; i < 10000; i++) {
            GreatestDivisor gd = new GreatestDivisor(i);
            gd.start();
            t1.add(gd);
        }


        for (GreatestDivisor gd : t1) {
            gd.join();
        }

        int max = 0;
        ArrayList<Integer> maxN = new ArrayList<Integer>();
        for (GreatestDivisor gd : t1) {
            if (gd.getResult() > max) {
                max = gd.getResult();
                maxN.clear();
                maxN.add(gd.getN());
            } else if (gd.getResult() == max) {
                maxN.add(gd.getN());
            }
        }

        System.out.println(max);
        System.out.println(maxN);


    }
}