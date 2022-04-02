/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class Sorted_Array_To_BST_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            TreeNode t = new TreeNode(nums[0]);
            return t;
        } else if (nums.length == 0)
            return null;
        TreeNode tn = build(nums, 0, nums.length - 1);
        return tn;
    }

    public TreeNode build(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode t = new TreeNode(nums[mid]);
        t.left = build(nums, start, mid - 1);
        t.right = build(nums, mid + 1, end);
        return t;
    }
}
