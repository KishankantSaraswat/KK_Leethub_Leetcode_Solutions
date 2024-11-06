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

        
        List<List<Integer>>ans=new ArrayList<>();

        Queue<TreeNode>q=new LinkedList<>();

        if(root==null) return ans;
        q.add(root);


        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer>lst=new ArrayList<>();

            for(int i=0;i<levelsize;i++){
                 TreeNode current=q.poll();
            lst.add(current.val);

            if(current.left!=null) q.add(current.left); 
            if(current.right!=null) q.add(current.right);
            }
            ans.add(lst);
           

        }
        return ans;

        
    }
}