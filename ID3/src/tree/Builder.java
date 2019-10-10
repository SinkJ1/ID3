package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Logic.Entropy;
import dataSet.DataSet;
import foFun.Filtration;
import root.Table;

public class Builder {

	public static void inizialize() {

		Table table = new Table();
		DataSet data = new DataSet();
		table.setTable(data.getNewTable());
		while(Tree.getNodeList().isEmpty()) {
			Entropy.getGain(table);
		}
		
		build(table);
	}

	private static void build(Table table) {
		List<Object[][]> list = new ArrayList();
				
		while(!Tree.getNodeList().isEmpty()) {
			for(String nodeInTree : Tree.getNodeList()) {
				System.out.println(nodeInTree + "->");
				list = Filtration.getNewTable(table,
						Filtration.getColumn(table, Filtration.getColumnIndex(table, nodeInTree)),
						Filtration.getColumnIndex(table, nodeInTree));
				Tree.getNodeList().remove(nodeInTree);
				for(Object [][] listValue : list) {
					table.setTable(listValue);
					for(Map.Entry<String,String> map: Entropy.getGain(table).entrySet()) {
						if(map.getKey().equals("Answer")) {
							System.out.println(map.getValue());
							break;
						}else {
							Entropy.getGain(table);
							build(table);
						}
					}
				}
			}
			break;
		}		
	}

}
