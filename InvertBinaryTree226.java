public class InvertBinaryTree226 {
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
    public static TreeNode invertTree(TreeNode root){
        if(root==null){
            return null;
        }//basecase
        invertTree(root.left);
        invertTree(root.right);//postorder to insure left and right is under the same node
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;//swap Node between left and right node
        return root;
    }
}
