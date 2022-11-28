import java.util.concurrent.Semaphore;

class Tickets {
    public static int numTickets;

}

class Seller extends Thread {

    Semaphore sem;
    int i=1;

    Seller(Semaphore sem, String name) {
        super(name);
        this.sem = sem;
    }

    public void run() {
        while (Tickets.numTickets > 0) {
            try {
                System.out.println(getName() + " is waiting for permit.");
                sem.acquire();
                System.out.println(getName() + " got the lock.");
                if (Tickets.numTickets > 0) {
                    Tickets.numTickets--;
                    sleep(10);
                }
                System.out.println(getName() + " sold "+i+" tickets.");
                sem.release();
                i++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

public class Q6 {
    public static void main(String[] argc) throws InterruptedException {
        Tickets.numTickets = 100;
        Semaphore sem = new Semaphore(1);
        Seller s1 = new Seller(sem, "Seller1");
        Seller s2 = new Seller(sem, "Seller2");
        Seller s3 = new Seller(sem, "Seller3");
        Seller s4 = new Seller(sem, "Seller4");

        s1.start();
        s2.start();
        s3.start();
        s4.start();

        s1.join();
        s2.join();
        s3.join();
        s4.join();

        System.out.println("Number of tickets: " + Tickets.numTickets);

    }
}
