Time Complexity : O(n)
Space Complexity : O(n)

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if(root==null) return output;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            
            for(int i=0; i<size;i++){
                TreeNode front = queue.poll();
                temp.add(front.val);
                if(front.left != null)
                    queue.add(front.left);
                if(front.right != null)
                    queue.add(front.right);
            }
            output.add(temp);
        }
        return output;
    }
}