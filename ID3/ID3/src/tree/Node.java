package tree;

public class Node {

	private Integer id;

	private String name;

	private double value;

	private Integer next;

	private Integer previous;

	public Node(String name, double value, Integer next, Integer previous) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.next = next;
		this.previous = previous;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Integer getNext() {
		return next;
	}

	public void setNext(Integer next) {
		this.next = next;
	}

	public Integer getPrevious() {
		return previous;
	}

	public void setPrevious(Integer previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", name=" + name + ", value=" + value + ", next=" + next + ", previous=" + previous
				+ "]";
	}

}
