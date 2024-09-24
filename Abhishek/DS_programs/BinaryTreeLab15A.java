
class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class BinaryTreeLab15A {

    int preIndex = 0;

    TreeNode buildTree(int[] preorder, int[] postorder) {
        return constructTree(preorder, postorder, 0, postorder.length - 1);
    }

    TreeNode constructTree(int[] preorder, int[] postorder, int postStart, int postEnd) {
        if (postStart > postEnd || preIndex >= preorder.length) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);

        if (postStart == postEnd) {
            return root;
        }

        int leftRootValue = preorder[preIndex];
        int leftRootIndex = findIndex(postorder, leftRootValue, postStart, postEnd);

        root.left = constructTree(preorder, postorder, postStart, leftRootIndex);
        root.right = constructTree(preorder, postorder, leftRootIndex + 1, postEnd - 1);

        return root;
    }

    int findIndex(int[] postorder, int value, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (postorder[i] == value) {
                return i;
            }
        }
        return -1;
    }

    void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] preorder = {1, 2, 4, 5, 3};
        int[] postorder = {4, 5, 2, 3, 1};

        TreeNode root = tree.buildTree(preorder, postorder);
        System.out.println("Inorder Traversal of Constructed Tree:");
        tree.printInOrder(root);  // Output: 4 2 5 1 3
    }
}
