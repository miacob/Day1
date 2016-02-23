package Tree;

// Created by Andrei on 2/22/2016.

public class BinaryTree {
    Node root;

    public void add(int data)
    {
        Node nodeToAdd = new Node(data);

        if (root == null) //nu-s elemente
            root = nodeToAdd;

        traverseandadd(root, nodeToAdd);

    }
    private void traverseandadd (Node node, Node nodeToAdd)
    {
        if (nodeToAdd.data < node.data)
        {
            if (node.left == null)
            {
                node.left = nodeToAdd;
            }
            else
            {
                traverseandadd(node.left, nodeToAdd);
            }
        }
        else if (nodeToAdd.data > node.data)
        {
            if (node.right == null)
            {
                node.right = nodeToAdd;
            }
            else
            {
                traverseandadd(node.left, nodeToAdd);
            }
        }
    }
    public void traverse()
    {
        if (root != null)
        {
            Node nodeToTraverse = root;

            if(nodeToTraverse.left == null && nodeToTraverse.right == null)
            {
                System.out.println(nodeToTraverse.data);
            }
            else
            {
                if (nodeToTraverse.left != null)
                {
                    inTraversal(nodeToTraverse.left);
                }
                if (nodeToTraverse.right != null)
                {
                    inTraversal(nodeToTraverse.right);
                }
            }
        }
    }

    private void inTraversal(Node node)
    {
        if (node.left != null)
        {
            inTraversal(node.left);
        }

        System.out.println(node.data);

        if (node.right != null)
        {
            inTraversal(node.right);
        }
    }
}
