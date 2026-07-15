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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        return inOrder(root,lst);
    }

    public List<Integer> inOrder(TreeNode node, List<Integer> lst){
        if(node == null) return lst;
        inOrder(node.left,lst);
        lst.add(node.val);
        inOrder(node.right,lst);
        return lst;
    }
}