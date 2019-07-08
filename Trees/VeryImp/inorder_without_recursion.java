public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (A == null) return ans;
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = A;
        while (curr != null || s.size() > 0){
            while (curr !=  null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            ans.add(curr.val);
            curr = curr.right;
        }
        return ans;
    }
}


