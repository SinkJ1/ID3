package Logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tree.Node;

public class Gain {

	public static void findMax(Map<Object, Double> gain) {

		double max = 0;
		String atribute = "";

		Map<Object, Double> maxGain = new HashMap();

		for (Map.Entry<Object, Double> findMax : gain.entrySet()) {

			if (findMax.getValue() > max) {
				max = findMax.getValue();
				atribute = findMax.getKey().toString();
			}
		}

		maxGain.put(atribute, max);
		createNode(maxGain);
	}

	private static void createNode(Map<Object, Double> node) {

		List<Node> nodes = new ArrayList();

		for (Map.Entry<Object, Double> addNode : node.entrySet()) {
			if (nodes.isEmpty()) {
				nodes.add(new Node(addNode.getKey().toString(), addNode.getValue(), 0, 0));
			}
		}
	}

}
