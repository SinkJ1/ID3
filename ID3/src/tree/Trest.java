package tree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Trest {

	private static Set<Node> nodeList = Collections.newSetFromMap(new ConcurrentHashMap<>());

	private static Set<Edge> edgeList = new HashSet();

	public static void addValueInNodeList(Node value) {
		nodeList.add(value);
	}

	public static Set<Node> getNodeList() {
		return nodeList;
	}

	public static void addValueInEdgeList(Edge value) {
		edgeList.add(value);
	}

	public static Set<Edge> getEdgeList() {
		return edgeList;
	}

}
