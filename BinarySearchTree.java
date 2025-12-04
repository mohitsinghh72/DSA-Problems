import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();

    }
}

class BinaryTree {
    private Node root;

    BinaryTree(){

    }

    class Node{
        int value;
        Node left;
        Node right;
        int height;

        private Node(int value){
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    public void insert(int value){
        root = insert(value,root);

    }
    public Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value>node.value){
            node.right= insert(value,node.right);
        }

        node.height = Math.max(height(node.left),height(node.right))+1;

        return node;
    }

    public void populate(int[] nums){
        for(int i = 0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(this.root,"Root Node : ");
    }
    private void display(Node node,String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.value);

        display(node.left,"Left child of : "+node.value + " : ");
        display(node.right,"Right child of : "+node.value+" : ");
    }
}