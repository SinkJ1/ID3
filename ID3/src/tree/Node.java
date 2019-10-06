package tree;

import java.util.List;

public class Node {

	private int id;

	private String name;

	private List<Node> edge;

	public Node(int id, String name, List<Node> edge) {
		this.id = id;
		this.name = name;
		this.edge = edge;
	}

	public String getName() {
		return name;
	}

	public List<Node> getEdge() {
		return edge;
	}
	
	public int getId() {
		return id;
	}
}
