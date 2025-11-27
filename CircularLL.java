package JAVA_BASICS;

public class MainCLL {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();

        list.insertFirst(23);
        list.insertFirst(24);
        list.insertFirst(25);
        list.insertFirst(27);

        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        list.deleteVal(248);
        list.display();
        list.size();
    }
}
class CircularLL {
    Node head;
    Node tail;
    int size;

    CircularLL(){
        this.size = 0;
    }
    public class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        tail.next = head;
        size++;
    }

    public int deleteFirst(){
        if(head == null){
            System.out.println("Empty list");
            return -1;
        }
        int value = head.val;
        size--;
        if(head == tail){
            head = null;
            tail = null;
            return value;
        }
        head = head.next;
        tail.next = head;
        return value;
    }

    public void deleteVal(int val) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if(head.val == val){
            head = null;
            tail = null;
            return;
        }
        Node temp = head;

        do{
            if(temp.next.val == val){
                if(temp.next == tail){
                    tail = temp;
                    tail.next = head;
                    size--;
                    return;
                }
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }while(temp!=head);
        System.out.println("Value not found");
    }

    public void size(){
        System.out.println(size);
    }


    public void display(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }while(temp!=head);
        System.out.println("Head");
    }
}
