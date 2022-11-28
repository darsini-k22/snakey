public class PriorityThread extends Thread {
    String name;
    int priority;
    int count;
    Thread t;

    PriorityThread(String name, int priority) {
        this.name = name;
        this.priority = priority;
        t = new Thread(this, name);
        t.setPriority(priority);
        this.count = 0;
        start();
    }

    public void run() {
        try {
            if (t.getPriority() > 7) {
                sleep(100);
            }

            System.out.println(t.getName()+" is Alive? "+t.isAlive());

            while(t.isAlive() && count!=5){
                System.out.println(t.getName()+" counted to "+count);
                count++;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class PriorityThreadApp {
    public static void main(String[] argc) {
        PriorityThread pt1 = new PriorityThread("Thread-1",2);
        PriorityThread pt2 = new PriorityThread("Thread-2",3);
        PriorityThread pt3 = new PriorityThread("Thread-3",4);
        PriorityThread pt4 = new PriorityThread("Thread-4",8);
        pt1.setPriority(2);
        pt2.setPriority(3);
        pt1.setPriority(4);
        pt2.setPriority(8);
        System.out.println(pt1.getPriority());
        System.out.println(pt2.getPriority());
        System.out.println(pt3.getPriority());
        System.out.println(pt4.getPriority());


    }
}

