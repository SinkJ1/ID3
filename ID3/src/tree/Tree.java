package tree;

import java.util.HashSet;
import java.util.Set;

public class Tree {

	private static Set<String> nodeList = new HashSet();

	private static Set<String> edgeList = new HashSet();

	public static void addValueInNodeList(String value) {
		nodeList.add(value);
	}

	public static Set<String> getNodeList() {
		return nodeList;
	}

	public static void addValueInEdgeList(String value) {
		edgeList.add(value);
	}

	public static Set<String> getEdgeList() {
		return edgeList;
	}

}