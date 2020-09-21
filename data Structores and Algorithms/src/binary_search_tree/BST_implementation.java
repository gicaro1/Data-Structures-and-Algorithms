package binary_search_tree;

public class BST_implementation {
	
	/************ INSERT BINARY **************/
	private Node root;

	public void insert(int key, String value) {
		
		Node newNode = new Node(key,value);
		
		if (root==null) {
			root = newNode;
			
			
			
		}else {
			Node current = root; // first loop value is 23
			Node parent;
			
			while (true) {
				parent = current; // current is equal to root 23
								  // parent = root  23 
				if (key < current.key) { // 3 is less than 23  true **** --> asking to the root 
					// always start asking from the root towards down
					
					// here change the value of current  for the next left node 
					current = current.leftChild;// move the node to next left DOWN LEVEL Node
					if (current == null) {// its  current doesn't have any children parent is assign to the newNODE
						parent.leftChild = newNode;
						return;
						
					}
					
				}else {
					
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
						
					}
				}
				
			}
		}
	
		
	}
	// FIND MIN
	public Node findmin() {
		Node current = root;
		Node last = null;
		
		
		while (current != null) {
			last = current;
			current = current.leftChild;
			
		}
		return last;
		
		
	}
	
	// FIND MAX
	public Node findmax() {
		Node current = root;
		Node last = null;
		
		
		while (current != null) {
			last = current;
			current = current.rightChild;
			
		}
		return last;
		
		
	}

}



















