
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int num) {
        this.data = num;
        this.next = null; // fixed: should point to null, not num
    }
}

public class SinglyLinkedList {
    Node head = null;
    Node tail = null;
    Node temp;
    Node prev;
    
    //delet end
    public void delet_end(int num){
        
        Node temp;
        temp=head;
        while(temp!=null){
            prev=temp;
            temp=tail;

        }
        prev.next=null;
    }
    //deletion
   public void delet_s(int  num){
            temp=head;
            head=head.next;
            head.next=null;
    
   }

    // Method to insert into singly linked list
    public void insert_first(int num){
        Node  newNode=new Node(num);
        if(head==null){
            head=newNode;
            newNode=tail;
        }
        else{
            newNode.next=head;
            head=newNode;
       }

    }
    public void insert_end(int num){
        Node newNode=new Node(num);

        if(tail.next!=null){
            tail.next=newNode;
            tail=newNode;

        }
    }
    
    public void insert(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    // Method to display the list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(50);
        list.insert_first(67);
        list.insert_end(60);
        //list.insert_pos(54);
        
        list.display();
    }
}
