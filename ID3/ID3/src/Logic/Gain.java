package Logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import foFun.Filtration;
import root.Table;
import tree.Edge;
import tree.Node;
import tree.Tree;

public class Gain {

	public static void findMax(Map<Object, Double> gain) {

		double max = 0;
		String atribute = "";
		int i = 0;
		
		Map<Object, Double> maxGain = new HashMap();
		
		for (Map.Entry<Object, Double> findMax : gain.entrySet()) {

			if (findMax.getValue() > max) {
				max = findMax.getValue();
				atribute = findMax.getKey().toString();
			}
		}

		maxGain.put(atribute, max);
		createNode(maxGain);

		for (Map.Entry<Object, Double> map : maxGain.entrySet()) {
			Tree.addValueInNodeList(map.getKey().toString());
		}
	}

	private static void createNode(Map<Object, Double> node) {

		List<Node> nodes = new ArrayList();
		for (Map.Entry<Object, Double> map : node.entrySet()) {
			Node newNode = new Node(1, map.getKey().toString(), nodes);

		}
	}

}
