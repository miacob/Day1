public class BinaryTree {

    Node root;

    public void addNode(int key, String nume) {

        Node newNode = new Node(key, nume);

        if (root == null) {

            root = newNode;

        } else {

            Node focusNode = root;

            Node parent;

            while (true){

                parent = focusNode;

                if (key < focusNode.key) {

                    focusNode = focusNode.left;

                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;

                    if (focusNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void traverse(Node focusNode){
        if (focusNode != null){
            traverse(focusNode.left);
            System.out.println(focusNode);
            traverse(focusNode.right);
        }
    }
    public static void main(String[] args){
        BinaryTree theTree = new BinaryTree();

        theTree.addNode(1, "bau");
        theTree.addNode(50, "sss");
        theTree.addNode(75, "grr");
        theTree.addNode(17, "sasa");
        theTree.addNode(2, "hau");

        theTree.traverse(theTree.root);
    }
}

class Node {

    int key;
    String nume;

    Node left;
    Node right;

    Node(int key, String nume) {
        this.key = key;
        this.nume = nume;
    }

    public String toString() {
        return nume + " cheia " + key;
    }
}