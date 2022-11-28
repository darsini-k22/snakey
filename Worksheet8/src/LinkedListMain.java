
class LkList{
     static Node head;
    static class Node{
        Node next;
        String data;
        Node(String data){
            this.data=data;
            next=null;
        }
        Node getNext(){
            return next;
        }
    }

    void createNode(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }

        newNode.next=null;
    }

    void reverseNodeModify(){
        Node current=head;
        Node prev=null;
        Node newNext=null;
        if(current!=null){
            newNext=current.next;
            current.next=prev;
            prev=current;
            current=newNext;
        }
        head=prev;

    }

    void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data+" ");
        }
    }

}
public class LinkedListMain{
    public static void main(String[] argc){
        LkList lk=new LkList();
        lk.createNode("hello");
        lk.createNode("World");
        lk.createNode("I'm");
        lk.createNode("Darsini");
        lk.reverseNodeModify();
        lk.display();
    }
}
