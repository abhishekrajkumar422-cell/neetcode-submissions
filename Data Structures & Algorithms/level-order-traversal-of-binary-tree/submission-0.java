

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        List<Integer> level = new ArrayList<>();

        while(!q.isEmpty()){

            TreeNode curr = q.poll();

            if(curr ==null){
                result.add(level);
                level = new ArrayList<>();

                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                level.add(curr.val);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);

            }
        }

        return result;

    }
}
