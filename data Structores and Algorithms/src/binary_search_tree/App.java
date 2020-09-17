package binary_search_tree;

public class App {

	public static void main(String[] args) {
	BST_implementation tree = new BST_implementation();
	
	tree.insert(23,"twenty-tree");
	tree.insert(3,"tree");
	tree.insert(1,"one");
	tree.insert(24,"twenty-four");
	tree.insert(100,"one-undred");
	
	
System.out.println(tree.findmin().key);
System.out.println(tree.findmax().key);

	}
	

}
