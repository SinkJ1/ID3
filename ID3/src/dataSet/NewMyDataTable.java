package dataSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import root.Table;

public class NewMyDataTable {

	public static List<String> just(Table table, Set<String> column, int id) {

		List<String> newTable = new ArrayList();

		var matrix = table.getTable();

		for (String value : column) {
			for (int i = 1; i < matrix.length; i++) {
				if (value.equals(matrix[i][id])) {
					newTable.add(matrix[i].toString());
				}
			}

		}
		
		for(String abc: newTable) {
			System.out.println(abc);
		}
		return newTable;
	}

}
