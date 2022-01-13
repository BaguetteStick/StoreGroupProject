
public class Node {
	Customer cargo;
	Node next;
	
	public Node(){
		cargo = null;
		next = null;
	}

	public Node(Customer cargo, Node next){
		this.cargo = cargo;
		this.next = next;
	}
	
	public static void printList(Node list){
	    Node node = list;
	    
		while(node != null){
	    		System.out.print(node);
	    		node = node.next;
		}
	    System.out.println();
	    
	}
	
	public String toString() {
		return cargo + "";
	}
	
}
