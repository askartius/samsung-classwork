public class Main {
    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree(10);
        tree.insertNode(tree, 25);
        tree.insertNode(tree, 20);
        tree.insertNode(tree, 6);
        tree.insertNode(tree, 4);
        tree.insertNode(tree, 8);
        tree.insertNode(tree, 50);
        tree.insertNode(tree, 30);
        tree.insertNode(tree, 6);

        tree.printVerticalTree(tree, 0);
    }
}