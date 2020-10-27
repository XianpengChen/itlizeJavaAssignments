package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        if (root.left != null) {
            list.addAll(preorderTraversal(root.left));
        }
        if (root.right != null) {
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode tn = new TreeNode();
        System.out.println(tn.val);
    }
}



//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
