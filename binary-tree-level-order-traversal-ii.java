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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        List<List<Integer>> parent=new ArrayList<>();
        if(root!=null)
        q.offer(root);
        else new ArrayList<>();
        while(!q.isEmpty())
        {
            List<Integer> el=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode element=q.poll();
                el.add(element.val);
                if(element.left!=null)
                q.offer(element.left);

                if(element.right!=null)
                q.offer(element.right);
            }
        parent.add(el);
        }
        Collections.reverse(parent);// to reverse a list in order
        return parent;
        
    }
}