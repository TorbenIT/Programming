package javax.tools.utilities;

public class TreeNode {

	private String word;
	private String definition;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(String w, String def) {
		this.word = w;
		this.definition = def;
	}
	
	public String getWord() {
		return this.word;
	}
	public String getDefinition() {
		return this.definition;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	public TreeNode getRight() {
		return right;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
}
