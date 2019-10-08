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
import tree.Trest;

public class Gain {

	public static String findMax(Map<Object, Double> gain) {

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
		

		for (Map.Entry<Object, Double> map : maxGain.entrySet()) {
		//	System.out.println(map.getKey() + "------------> Node");
			Tree.addValueInNodeList(map.getKey().toString());
		}
		return atribute;
	}

}
