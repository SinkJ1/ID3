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

		Table table = new Table();

		DataSet data = new DataSet();
		
		Map<String, List<Object[][]>> map = new HashMap();

		table.setTable(data.getNewTable());
		Entropy.getGain(table);

		List<Object[][]> list;
		List<Object[][]> list2 = new ArrayList();
		for (String aa : Tree.getNodeList()) {
			list = Filtration.getNewTable(table, Filtration.getColumn(table, Filtration.getColumnIndex(table, aa)),
					Filtration.getColumnIndex(table, aa));
			map.put(aa,list);
		}

		while (!Tree.getNodeList().isEmpty()) {

			/*
			 *  дерево строится не в глубину, а по строкам теряеется нужная таблица и
		  	 *	операции происходят с другой исправить!!!
			 * */

			for (String aa : Tree.getNodeList()) {
				System.out.println(aa + "-->");
				Tree.getNodeList().remove(aa);
				list = Filtration.getNewTable(table, Filtration.getColumn(table, Filtration.getColumnIndex(table, aa)),
						Filtration.getColumnIndex(table, aa));
				while (!list.isEmpty()) {
					for (Object[][] object : list) {
						table.setTable(object);
						Entropy.getGain(table);
						list.remove(0);
						break;
					}
				}
				
			}
		}

		for (String a : Tree.getNodeList()) {

			System.out.println(a  + "ther node");
		}

	}

}
