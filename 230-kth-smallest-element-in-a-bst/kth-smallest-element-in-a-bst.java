/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int result = 0;
    int smallest = 0;
    public int kthSmallest(TreeNode root, int k) {

        inorder(root, k);
        return result;
    }

    public void inorder(TreeNode root, int k){

        if (root == null) {
            return;
        }

        inorder(root.left, k);
        smallest++;
        System.out.println("smallest" + smallest);
        System.out.println("value" + root.val);
        if (k == smallest) {
            result = root.val;
            System.out.println("result" + result);
            return;
        }
        inorder(root.right, k);
    }
}