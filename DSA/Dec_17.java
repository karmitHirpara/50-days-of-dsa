package DSA;

// LeetCode 701. Insert into a Binary Search Tree
// ```````````````````````````````````````````````

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class Dec_17 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 5;
        TreeNode newRoot = insertIntoBST(root, val);
        inorder(newRoot);
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        else if(val>root.val) {
           root.right = insertIntoBST(root.right, val);
        }else if(val<root.val) {
           root.left = insertIntoBST(root.left, val);
        }
        return root;
    }

    public static void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
}
