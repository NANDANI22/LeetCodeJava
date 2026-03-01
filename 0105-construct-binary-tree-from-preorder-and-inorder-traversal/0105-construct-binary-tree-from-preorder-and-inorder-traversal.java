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
    int i=0; 
    Map<Integer,Integer> map;
    public TreeNode fn(int[] preorder , int start , int end){
        if(start > end) return null;
        TreeNode root = new TreeNode(preorder[i++]);
        root.left = fn(preorder , start , map.get(root.val)-1);
        root.right = fn(preorder , map.get(root.val)+1 , end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<Integer,Integer>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i] , i);
        }
        return fn(preorder , 0 , preorder.length-1);
    }
}