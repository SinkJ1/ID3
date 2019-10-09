package root;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import Logic.Entropy;
import dataSet.DataSet;
import dataSet.NewMyDataTable;
import foFun.Filtration;
import foFun.Parser;
import tree.Builder;
import tree.Edge;
import tree.Node;
import tree.Tree;
import tree.Trest;

public class Program {

	public static void main(String... args) {

		List<Object[][]> list = new ArrayList();
		List<Object[][]> list2 = new ArrayList();

		Table table = new Table();

		DataSet data = new DataSet();

		table.setTable(data.getNewTable());

		while (Tree.getNodeList().isEmpty()) {

			Entropy.getGain(table);

			for (String nodeInTree : Tree.getNodeList()) {
				System.out.println(nodeInTree + "<-");
				list = Filtration.getNewTable(table,
						Filtration.getColumn(table, Filtration.getColumnIndex(table, nodeInTree)),
						Filtration.getColumnIndex(table, nodeInTree));
				for (Object[][] edge : list) {
					table.setTable(edge);
					for (Map.Entry<String, String> map : Entropy.getGain(table).entrySet()) {
						if (map.getKey().equals("Answer")) {
							System.out.println(map.getValue());
							break;
						} else
							System.out.println(map.getValue() + "Node--->");
						list2 = Filtration.getNewTable(table,
								Filtration.getColumn(table, Filtration.getColumnIndex(table, map.getValue())),
								Filtration.getColumnIndex(table, map.getValue()));
						for (Object[][] nextEdge : list2) {
							table.setTable(nextEdge);
							for (Map.Entry<String, String> map1 : Entropy.getGain(table).entrySet()) {
								if (map1.getKey().equals("Answer")) {
									System.out.println(map1.getValue());
									break;
								}
							}
						}
					}
				}

			}

		}
	}
}