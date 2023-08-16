public class MaximumDepthOfBinaryTree104 {

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
    class Solution1 {//get the max depth by getting the left or right tree's max depth
        public int maxDepth(TreeNode root) {
            if(root == null){
                return 0;
            }
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right)  +1;
        }

    }
    class Solution2 {
          int res = 0;
          int depth = 0;
        public int maxDepth(TreeNode root) {
            process(root);
            return res;
        }
        public void process(TreeNode root){//get each TreeNode's depth and return the max depth
            if(root == null){
                res = Math.max(res, depth);
                return;
            }
            depth++;
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            depth--;
        }

    }
}
