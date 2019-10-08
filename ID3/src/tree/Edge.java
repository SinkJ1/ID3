package tree;




public class Edge {

	private Node next;

	private String value;

	public Edge(String value) {
		this.value = value;
	}
	
	

	public Edge(Node next, String value) {
		this.next = next;
		this.value = value;
	}



	public void setNext(Node next) {
		this.next = next;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public String getValue() {
		return value;
	}
}
