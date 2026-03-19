package BST1;
public class search {
    static class Node {
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
     }

    public static Node insert(Node root, int val){
      if(root == null){
        root = new Node(val);
        return root;
      }

      if(root.data > val){
        root.left = insert(root.left, val);
      } else {
        root.right = insert(root.right, val);
      }
      return root;
    }

    public static boolean search1(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
           return search1(root.left, key);
        }
        else {
           return search1(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        if(search1(root, 1)){
            System.out.println("found");
        } else {
            System.out.println("no found");
        }
    }
}
