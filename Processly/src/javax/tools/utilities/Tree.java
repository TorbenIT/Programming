package javax.tools.utilities;

public class Tree {

	TreeNode root;
	
	
	
	
	
	
	
	public void insert(TreeNode node) {
	
		if (root == null) root = node;
		
		else insert(root, node);
	}


	public void print() {
	
		print(root);
	}

	
	public void search(String word) {
	
		search(root, word);
	}
	
	


	protected String search(TreeNode root, String yourWord) {
		
		if (root == null) return null;
		
		if (root.getWord() == yourWord) {
		
			System.out.println("Definition: " + root.getDefinition());
			return root.getDefinition();
		}
		
		if (root.getWord().compareTo(yourWord) > 0) return search(root.getLeft(), yourWord);
	
		
		
		
	 return  search(root.getRight(), yourWord);
	}


	protected void print(TreeNode temp) {
		
		if (temp.getLeft() != null) print(temp.getLeft());
		
		System.out.print(temp.getWord() + ": " + temp.getDefinition()); // kein \n
		
		if (temp.getRight() != null ) print(temp.getRight());
		
	}


	protected void insert(TreeNode temp, TreeNode node) {
		
		if (node.getWord().compareTo(temp.getWord()) < 0) {
			
			if (temp.getLeft() == null) temp.setLeft(node);
			
			else insert(temp.getLeft(), node);
		
		} else {
		
			if (temp.getRight() == null ) temp.setRight(node);
			
			else insert(temp.getRight(), node);
		}
	}
}
