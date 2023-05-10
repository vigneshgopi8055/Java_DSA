package src;

public class Linked_List {
    private Node head;
    private Node tail;
    private int size;

    public Linked_List(){
        this.size = 0;
    }
    public void InsertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size+=1;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public class Node{
        int value;
        Node next;
        public Node(int value , Node node){
            this.value = value;
            this.next = node;
        }
        public Node(int value){
            this.value = value;
        }

    }
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.InsertFirst(1);
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.InsertFirst(4);
        list.InsertFirst(5);
        list.display();

    }
}
