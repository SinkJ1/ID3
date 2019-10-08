package tree;

import java.util.List;

public class Node {

	private String name;

	private List<Edge> edge;

	public Node(String name) {
		this.name = name;
	}

	public Node(String name, List<Edge> edge) {
		this.name = name;
		this.edge = edge;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<Edge> getEdge() {
		return edge;
	}

	public void setEdge(List<Edge> edge) {
		this.edge = edge;
	}

	
	
}
