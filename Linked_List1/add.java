package Linked_List1;

import java.util.LinkedList;

public class add {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step 1 = create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head 
        newNode.next = head; // link

        //step3 - head = newNode
        head = newNode;

    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(); //<integer> add karne pr yellow line haat jayegi
        ll.addFirst(1);
        ll.addFirst(2);
        //System.out.println(ll);
    }
}
