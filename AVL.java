public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();

        for(int i = 0; i < 1000; i++){
            tree.insert(i);
        }

        System.out.println(tree.height());  // should print around 9 or 10
    }
}

class AVL {

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {}

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        int balance = height(node.left) - height(node.right);

        // LEFT HEAVY
        if (balance > 1) {
            if (height(node.left.left) >= height(node.left.right)) {
                // LL case
                return rightRotate(node);
            } else {
                // LR case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // RIGHT HEAVY
        if (balance < -1) {
            if (height(node.right.right) >= height(node.right.left)) {
                // RR case
                return leftRotate(node);
            } else {
                // RL case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        // ✔ FIXED HEIGHT FORMULA
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        // ✔ FIXED HEIGHT FORMULA
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;

        return p;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 &&
                balanced(node.left) &&
                balanced(node.right);
    }
}
