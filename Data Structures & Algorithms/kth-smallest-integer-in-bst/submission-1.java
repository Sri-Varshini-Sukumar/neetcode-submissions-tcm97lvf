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

//Using Priority Queue Solution

// class Solution {
//     public int kthSmallest(TreeNode root, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         traverse(root,pq);

//         for(int i=0; i<k-1; i++){
//             pq.poll();
//         }

//         return pq.peek();
//     }

//     public void traverse(TreeNode root, PriorityQueue<Integer> pq){
//         if(root == null) return;
//         pq.add(root.val);
//         traverse(root.left,pq);
//         traverse(root.right,pq);
//     }
// }


//Using Optimal Approach
class Solution{
    int count = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k){
        inorder(root,k);
        return result;
    }

    private void inorder(TreeNode node, int k){
        if(node == null) return;
        inorder(node.left,k);
        count++;

        if(count == k){
            result = node.val;
            return;
        }
        inorder(node.right,k);
    }
}