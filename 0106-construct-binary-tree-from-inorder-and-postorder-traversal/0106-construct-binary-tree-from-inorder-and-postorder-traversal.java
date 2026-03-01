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
    int i;
    Map<Integer, Integer> map;
    public TreeNode fn(int[] postorder , int start , int end){
        if(start > end) return null;
        TreeNode root = new TreeNode(postorder[i--]);
        root.right = fn(postorder , map.get(root.val) +1 , end);
        root.left = fn(postorder , start , map.get(root.val)-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<Integer,Integer>();
        for(int j=0; j<inorder.length; j++){
            map.put(inorder[j] , j);
        }
        i=postorder.length - 1;
        return fn(postorder , 0 , inorder.length-1);
    }
}