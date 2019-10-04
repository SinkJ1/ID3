package tree;

import java.util.ArrayList;
import java.util.List;

public class Builder {

	private List<Object> treeSet = new ArrayList();

	public static void build(Node node) {

		if (node.getPrevious().equals(0)) {
			root();
		}
		justNode();

	}

	private static void root() {

	}

	private static void justNode() {

	}

}
