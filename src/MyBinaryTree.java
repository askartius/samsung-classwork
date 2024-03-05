public class MyBinaryTree {
    private int value;
    private MyBinaryTree leftChild;
    private MyBinaryTree rightChild;

    public MyBinaryTree(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public MyBinaryTree insertNode(MyBinaryTree node, int targetValue) {
        if(node == null) {
            node = new MyBinaryTree(targetValue);
            return node;
        }

        if (node.value > targetValue) {
            if (node.leftChild == null) {
                node.leftChild = new MyBinaryTree(targetValue);
            } else {
                return insertNode(node.leftChild, targetValue);
            }
        } else if (node.value < targetValue) {
            if (node.rightChild == null) {
                node.rightChild = new MyBinaryTree(targetValue);
            } else {
                return insertNode(node.rightChild, targetValue);
            }
        }
    }
}