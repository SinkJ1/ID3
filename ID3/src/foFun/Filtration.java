package foFun;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import Logic.Entropy;
import root.Table;
import tree.Edge;
import tree.Node;
import tree.Tree;
import tree.Trest;

public class Filtration {

	public static int getColumnIndex(Table table, Object value) {

		var matrix = table.getTable();

		int index = 0;

		for (int i = 0; i < table.getColumnLength() - 1; i++) {
			if (matrix[0][i].equals(value)) {
				index = i;
			}
		}
		return index;
	}

	public static List<Object> getColumn(Table table, int id) {

		var matrix = table.getTable();

		List<Object> values = new ArrayList();

		for (int i = 0; i < matrix.length - 1; i++) {
			values.add(matrix[i + 1][id]);
		}
		return values;
	}

	public static List<Object[][]> getNewTable(Table table, List<Object> column, int id) {

		var matrix = table.getTable();

		int a = 1;
		int b = 0;

		List<Object[][]> arrayList = new ArrayList();
		Set<Object> uniqWord = Parser.uniqWord(column);
		Object[][] newTable = new Object[0][1];

		List<Edge> edgeList = new ArrayList();
		
		for (Object set : uniqWord) {
			newTable = new Object[Entropy.counterValueInColumn(set.toString(), table, id) + 1][table.getColumnLength()
					- 1];
			deleteValueFromLine(newTable, matrix[0][id].toString(), table);
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][id].equals(set.toString())) {
					for (int j = 0; j < newTable[a].length + 1; j++) {
						if (j != id) {
							newTable[a][b] = matrix[i][j];
							b++;
						}
					}
					b = 0;
					a++;
				}
			}
			a = 1;
			b = 0;
			arrayList.add(newTable);
			
			edgeList.add(new Edge(new Node(" "),set.toString()));
			
			System.out.println(set + "----------------------------------------> Edge");
			Tree.addValueInEdgeList(set.toString());
		}
		
		for(Node node:Trest.getNodeList()) {
				node.setEdge(edgeList);				
		}
		return arrayList;
	}

	private static void deleteValueFromLine(Object[][] array, String value, Table table) {
		var matrix = table.getTable();
		int j = 0;
		for (int i = 0; i < table.getColumnLength(); i++) {
			if (!matrix[0][i].equals(value)) {
				array[0][j] = matrix[0][i];
				j++;
			}
		}
	}
}
