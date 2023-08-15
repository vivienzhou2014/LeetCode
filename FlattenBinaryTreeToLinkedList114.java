import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList114 {

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
        List<TreeNode> list = new ArrayList<>();
        public void flatten(TreeNode root) {
            process(root);
            for (int i = 1; i < list.size(); i++) {
                TreeNode pre = list.get(i-1), cur = list.get(i);
                pre.left = null;
                pre.right = cur;

            }
        }

        public void process(TreeNode root){
            if(root==null){
                return;
            }
            list.add(root);
            process(root.left);
            process(root.right);
        }
    }
}
