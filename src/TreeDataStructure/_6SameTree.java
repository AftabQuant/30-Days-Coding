package TreeDataStructure;

public class _6SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p == null) return false;
        if(q == null) return false;
        if(p.val != q.val) return false;
        if(!isSameTree(p.left,q.left)) return false;
        return isSameTree(p.right, q.right);
    }
}
