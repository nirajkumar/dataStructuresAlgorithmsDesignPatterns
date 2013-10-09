package dataStructures.binarySearchTree;

/**
 * This class tests all logic within class BinarySearchTree.
 *
 * @author Quinn Liu (quinnliu@vt.edu)
 * @version Oct 4, 2013
 */
public class BinarySearchTreeTest extends junit.framework.TestCase {
    private BinarySearchTree<Comparable<? super Key>, Element> BST;

    public void setUp() {
	this.BST = new BinarySearchTree<>();
    }
}
