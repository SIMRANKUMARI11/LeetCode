class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        int totalSum=0;
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null){
                totalSum+=root.left.val;
            }else{
                totalSum+=sumOfLeftLeaves(root.left);
            }
        }
        if(root.right!=null){
            totalSum+=sumOfLeftLeaves(root.right);
        }
        return totalSum;
        
    }
}