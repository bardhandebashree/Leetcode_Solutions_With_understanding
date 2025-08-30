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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        List<List<Integer>> tnParent=new ArrayList<>();
        if(root==null) return new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> tn=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode currNode=q.poll();
                tn.add(currNode.val);
            if(currNode.left!=null){
                q.offer(currNode.left);
            }
            if(currNode.right!=null){
                q.offer(currNode.right);
            }
            }
            tnParent.add(tn);
        }
        return tnParent;
    }
}

Above code has TC O(n) and beat 91%