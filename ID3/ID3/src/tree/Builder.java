package tree;

public class Builder {

	public void build() {
		for (String node : Tree.getNodeList()) {
				System.out.println(node + "->");
		}
	}

}
