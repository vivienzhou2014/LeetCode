public class DiameterOfBinaryTree543 {

     // Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    class Solution {
          int maxDiameter = 0;
        public int diameterOfBinaryTree(TreeNode root) {
            calDepth(root);
            return maxDiameter;
        }
        public int calDepth(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = calDepth(root.left);
            int right = calDepth(root.right);
            maxDiameter = Math.max(maxDiameter, left + right);

            return 1+Math.max(left, right);
        }
    }
}
