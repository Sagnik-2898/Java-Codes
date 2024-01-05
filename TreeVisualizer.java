import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class TreeVisualizer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the root value of the tree:");
        int rootValue = scanner.nextInt();

        TreeNode root = new TreeNode(rootValue);
        buildTree(root, scanner);

        System.out.println("Tree Structure:");
        printTree(root, "", true);
    }

    private static void buildTree(TreeNode root, Scanner scanner) {
        System.out.println("Do you want to add a left child for " + root.data + "? (y/n):");
        char choice = scanner.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            System.out.println("Enter the value for the left child:");
            int leftValue = scanner.nextInt();
            root.left = new TreeNode(leftValue);
            buildTree(root.left, scanner);
        }

        System.out.println("Do you want to add a right child for " + root.data + "? (y/n):");
        choice = scanner.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            System.out.println("Enter the value for the right child:");
            int rightValue = scanner.nextInt();
            root.right = new TreeNode(rightValue);
            buildTree(root.right, scanner);
        }
    }

    private static void printTree(TreeNode root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.data);
            printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
            printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
        }
    }
}
