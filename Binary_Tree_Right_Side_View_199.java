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
class Binary_Tree_Right_Side_View_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        List<List<Integer>> levelOrder = new ArrayList<>();
        Queue<TreeNode> qt = new LinkedList<>();
        if(root == null) return res;
        qt.offer(root);
        while(!qt.isEmpty()) {
            int size = qt.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i = 0; i < size; i++) {
                TreeNode n = qt.poll();
                list.add(n.val);
                if(n.left != null) qt.add(n.left);
                if(n.right != null) qt.add(n.right);
            }
            levelOrder.add(list);
        }
        for(List<Integer> item : levelOrder) {
            res.add(item.get(item.size() - 1));
        }
        return res;
    }
}