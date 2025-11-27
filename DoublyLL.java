public class MainDLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertLast(100);
        list.insertIndex(500,2);

        list.display();
        list.headDisplay();
        list.displayRev();
        list.headDisplay();
    }
}

class DLL {
    Node head;


    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void display(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void headDisplay(){
        if(head == null){
            System.out.println("Empty list");
        }else{
            System.out.println(head.val);
        }
    }

    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public void insertIndex(int val,int index){
        Node node = new Node(val);
        if(head == null){
            head = node;
            head.prev = null;
            return;
        }
        if(index == 0){
            node.next = head;
            node.prev = null;
            head = node;
            return;
        }
        Node temp = head;
        int i = 0;
        while(i<index-1 && temp!=null){
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Index out of range");
            return;
        }
        node.next = temp.next;
        node.prev = temp;
        if(temp.next!=null){
            temp.next.prev = node;
        }
        temp.next = node;
    }

    public void displayRev(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

