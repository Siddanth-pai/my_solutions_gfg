/*
**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int lca(TreeNode A, int B, int C) {

        if (A == null) return -1;

        ArrayList<Integer> pathToB = new ArrayList<>();
        ArrayList<Integer> pathToC = new ArrayList<>();
        if(!findNode(B, A, pathToB) || !findNode(C, A, pathToC)){
            return -1;
        }

        if (pathToB.isEmpty() || pathToC.isEmpty()) return -1;

        int i;
        for (i = 0; i < pathToB.size() && i < pathToC.size(); i++) {
            if (!pathToB.get(i).equals(pathToC.get(i))) {
                break;
            }
        }

        return pathToB.get(i - 1);

    }

    private boolean findNode(int b, TreeNode a, ArrayList<Integer> path) {

        if (a == null) {
            return false;
        }

        path.add(a.val);

        if (a.val == b) {
            return true;
        }
        if (findNode(b, a.left, path)){
            return true;
        }
        if (findNode(b, a.right, path)){
            return true;
        }
        path.remove(path.size() - 1);
        return false;

    }
}


