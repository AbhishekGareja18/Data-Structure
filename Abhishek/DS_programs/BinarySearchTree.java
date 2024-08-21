// Write a menu driven program to implement Binary Search Tree (BST) & perform following operations:Insert a node, Delete a node, Search a node 
import java.util.Scanner;
public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BinarySearchTree().new BST();
        
        while (true) {
            System.out.println("\nBinary Search Tree Menu");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Search a node");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("\nEnter the value to be inserted: ");
                    int insertValue = sc.nextInt();
                    bst.insert(insertValue);
                    break;
                
                case 2:
                    System.out.print("\nEnter the value to be deleted: ");
                    int deleteValue = sc.nextInt();
                    bst.root = bst.deleteRec(bst.root, deleteValue);
                    break;
                
                case 3:
                    System.out.print("\nEnter the value to be searched: ");
                    int searchValue = sc.nextInt();
                    boolean found = bst.SearchRec(bst.root, searchValue);
                    if (found) {
                        System.out.println(searchValue + " is present in the BST.");
                    } else {
                        System.out.println(searchValue + " is not present in the BST.");
                    }
                    break;
                
                case 4:
                    bst.inorderTraversal();
                break;

                case 5:
                    System.out.println("Exited");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    class BST {
        TreeNode root;

        public BST() {
            this.root = null;
        }

        void insert(int key) {
            root = insertRec(root, key);
        }

        TreeNode insertRec(TreeNode root, int key) {
            if (root == null) {
                root = new TreeNode(key);
                return root;
            }
            if (key < root.val) {
                root.left = insertRec(root.left, key);
            } else if (key > root.val) {
                root.right = insertRec(root.right, key);
            }
            return root;
        }

        boolean SearchRec(TreeNode root, int key) {
            if (root == null) {
                return false;
            }
            if (key == root.val) {
                return true;
            }
            if (key < root.val) {
                return SearchRec(root.left, key);
            } else {
                return SearchRec(root.right, key);
            }
        }

        TreeNode deleteRec(TreeNode root, int key) {
            if (root == null) {
                return root;
            }
            if (key < root.val) {
                root.left = deleteRec(root.left, key);
            } else if (key > root.val) {
                root.right = deleteRec(root.right, key);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                root.val = minValue(root.right);
                root.right = deleteRec(root.right, root.val);
            }
            return root;
        }

        int minValue(TreeNode root) {
            int minValue = root.val;
            while (root.left != null) {
                minValue = root.left.val;
                root = root.left;
            }
            return minValue;
        }

        void inorderTraversal(){
            inorderRec(root);
        }

        void inorderRec(TreeNode root){
            if(root != null){
                inorderRec(root.left);
                System.out.println(root.val + " ");
                inorderRec(root.right);
            }
        }
    }
}