
public class Queue {
	public Node first;
	public Node last;
	
	public Queue() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void enqueue(Customer cargo) {
		Node node = new Node (cargo, null);
		if (last != null) {
		last.next = node;
		}
		last = node;
		if (first == null) {
		first = last;
		}
	}
	
	public void dequeue() {
		if (first != null) {
		first = first.next;
		}
		if (first == null) {
		last = null;
		}
	}
	
	public static void printList(Node node){
	    
		while(node != null){
	    		System.out.print(node);
	    		node = node.next;
		}
	    System.out.println();
	    
	}
	
}
