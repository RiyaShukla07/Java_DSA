package Linked_List1;

public class search {
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

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i =0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
   public int itrSearch(int key){
    Node temp = head;
    int i = 0;

    while(temp != null){
        if(temp.data == key){
            //key found
            return i;
        }
        temp = temp.next;
        i++;
    }
    //key not found
     return -1;
   }
   public static void main(String[] args) {
        search ll = new search(); 
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2 , 9);
        ll.print();
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
        
    }
}
