class Node {
    int data;
    Node next;
    Node prev;

    Node(int num) {
        this.data = num;
        this.next = null;
        this.prev = null;
    }
}
public class doublelist {
    Node head = null;
    Node tail = null;

    // Insert at end
    public void insert(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

   
    public void delet_first() {
        if (head == null) {

           return;
        }
        if (head.next == null) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void delet_last() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        if (tail.prev == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

   
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void displayback(){
        Node temp=tail;
        while(temp!=head){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.print(temp.data);
        
    }

  
    public static void main(String[] args) {
        doublelist list = new doublelist();
        list.insert(10);
        list.insert(20);
        list.insert(30); 
        list.insert(40);
        list.insert(90);
        list.display();
        list.delet_first();
        list.display();
        list.displayback();
        list.delet_last();
        
    }
}
