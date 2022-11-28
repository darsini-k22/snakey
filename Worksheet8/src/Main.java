import java.util.Dictionary;
import java.util.Hashtable;
import java.util.PriorityQueue;
class QueueEmptyException extends Exception{
    QueueEmptyException(String s){
        super(s);
    }
}
class PriorQueue{
    PriorityQueue<Integer> pq;
    Hashtable value;

    public PriorQueue(){
        pq=new PriorityQueue<>();
        value=new Hashtable();
    }

    void insert(int x,String s){
        pq.add(x);
        value.put(x,s);
    }

    String remove(){
        try {
            if (pq.isEmpty()) {
                throw new QueueEmptyException("Queue is Empty!");
            }
            else{
                return (String) value.get(pq.poll());
            }
        }catch(Exception e){
            return e.getMessage();

        }
    }


}

class Main{
    public static void main(String[] argc){
        PriorQueue pq=new PriorQueue();
        pq.insert(2,"Manny");
        pq.insert(5,"Golria");
        pq.insert(6,"Jay");
        pq.insert(10,"Phil");

        for(int i=0;i<6;i++){
            System.out.println(pq.remove());
        }
    }
}