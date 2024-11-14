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
    public List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer>lst=new ArrayList<>();
        print(root,lst,0);
        return lst;

        
        
    }

    public static void print(TreeNode root,ArrayList<Integer>lst,int curr){
        if(root==null){
            return ;
        }

        if(curr==lst.size()){
            lst.add(root.val);
        }

        print(root.right,lst,curr+1);
        print(root.left,lst,curr+1);
    }
}