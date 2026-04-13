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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        return preOrder(root,lst);
    }

    public List<Integer> preOrder(TreeNode node,List<Integer> lst){
        if(node == null) return lst;
        lst.add(node.val);
        preOrder(node.left,lst);
        preOrder(node.right,lst);
        return lst;
    }
}