package Q1038;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeToGreaterSumTreeTest {

    @Test
    void bstToGst() {
        BinarySearchTreeToGreaterSumTree b = new BinarySearchTreeToGreaterSumTree();
        BinarySearchTreeToGreaterSumTree.TreeNode root = new BinarySearchTreeToGreaterSumTree.TreeNode(6);
        BinarySearchTreeToGreaterSumTree.TreeNode n1 = new BinarySearchTreeToGreaterSumTree.TreeNode(5);
        BinarySearchTreeToGreaterSumTree.TreeNode n2 = new BinarySearchTreeToGreaterSumTree.TreeNode(7);
        BinarySearchTreeToGreaterSumTree.TreeNode n3 = new BinarySearchTreeToGreaterSumTree.TreeNode(8);
        root.left = n1;
        root.right = n2;
        n2.right = n3;

        b.bstToGst(root);



    }
}