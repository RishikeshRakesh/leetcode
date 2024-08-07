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
    public void Inorder(TreeNode root,List<Integer> result){
         if(root == null){
            return;
         }       

         Inorder(root.left,result);
         result.add(root.val);
         Inorder(root.right,result);

     

    } 
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> result=new ArrayList<>();
         Inorder(root,result);
         return result;
    }
}