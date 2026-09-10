class Solution {
    
    int result = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return result;
    }

    // Returns {sum, count} of the subtree
    private int[] dfs(TreeNode root) {
        
        if (root == null) {
            return new int[]{0, 0};
        }

        // Get sum and count from left subtree
        int[] left = dfs(root.left);

        // Get sum and count from right subtree
        int[] right = dfs(root.right);

        // Calculate sum of current subtree
        int sum = root.val + left[0] + right[0];

        // Calculate number of nodes in current subtree
        int count = 1 + left[1] + right[1];

        // Check whether current node equals subtree average
        if (root.val == sum / count) {
            result++;
        }

        return new int[]{sum, count};
    }
}