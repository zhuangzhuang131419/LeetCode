package Q94;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeInorderTraversalTest {
    BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
    @Test
    public void inorderTraversal() {
        BinaryTreeInorderTraversal.TreeNode r = new BinaryTreeInorderTraversal.TreeNode(1);
        r.right = new BinaryTreeInorderTraversal.TreeNode(2);
        System.out.println(b.inorderTraversal(r));
    }
}