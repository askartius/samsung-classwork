import java.util.ArrayList;

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
                return node.leftChild = new MyBinaryTree(targetValue);
            } else {
                return insertNode(node.leftChild, targetValue);
            }
        } else if (node.value < targetValue) {
            if (node.rightChild == null) {
                return node.rightChild = new MyBinaryTree(targetValue);
            } else {
                return insertNode(node.rightChild, targetValue);
            }
        }

        return null;
    }

    public void printHorizontalTree(MyBinaryTree node, int level) {
        if (node != null) {
            printHorizontalTree(node.leftChild, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            System.out.println(node.value);
            printHorizontalTree(node.rightChild, level + 1);
        }
    }

    private void buildTreeArray(MyBinaryTree node, int level, ArrayList<ArrayList<String>> treeArray) {
        // Add a row for values if it doesn't exist
        if (level == treeArray.size()) {
            treeArray.add(new ArrayList<String>());
        }

        if (node != null) {
            treeArray.get(level).add(Integer.toString(node.value)); // Put the value of the node into its row/level
            buildTreeArray(node.leftChild, level + 1, treeArray);
            buildTreeArray(node.rightChild, level + 1, treeArray);
        } else {
            treeArray.get(level).add(" "); // Put a filler into the row if the node doesn't exist
        }
    }

    public void printVerticalTree(MyBinaryTree node, int level) {
        ArrayList<ArrayList<String>> treeArray = new ArrayList<>();
        buildTreeArray(node, level, treeArray);

        for (ArrayList<String> row : treeArray) {
            // Put more spaces before the first node the lower its row/level is
            for (int i = 0; i < Math.pow(2, treeArray.size() - treeArray.indexOf(row)) - 1; i++) {
                System.out.print(" ");
            }

            for (String value : row) {
                System.out.print(value);
                // Put more spaces between nodes the lower their row/level is
                for (int i = 0; i < Math.pow(2, treeArray.size() - treeArray.indexOf(row) + 1) - 1; i++) {
                    System.out.print(" ");
                }
            }

            System.out.println(); // Switch to new line for the next row
        }
    }
}