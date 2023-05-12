package src;

public class Linked_List {
    Node head;
    Node tail;
    int size;
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
    public void InsertLast(int value){
        if (tail == null){
            InsertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
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
        Node(int value){
            this.value = value;
        }
        Node(int value , Node node){
            this.next = node;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.InsertFirst(4);
        list.InsertFirst(4);
        list.InsertLast(5);
        list.InsertFirst(4);
        list.display();
    }
}
