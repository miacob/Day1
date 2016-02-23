package Tree;

public class test1 {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(30);
        tree.add(10);
        tree.add(20);
        tree.add(5);

        tree.traverse();
    }
}

