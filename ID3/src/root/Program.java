package root;

import java.util.ArrayList;
import java.util.List;

import Logic.Entropy;
import dataSet.DataSet;
import dataSet.NewMyDataTable;
import foFun.Filtration;
import foFun.Parser;
import tree.Builder;
import tree.Tree;

public class Program {

	public static void main(String... args) {

		Table table = new Table();

		DataSet data = new DataSet();

		table.setTable(data.getNewTable());
		Entropy.getGain(table);

		List<Object[][]> list;
		while (!Tree.getNodeList().isEmpty()) {
			
		/*
		*
		*дерево строится не в глубину, а по строкам
		*теряеется нужная таблица и операции происходят с другой
		*исправить!!!
		*
		*
		*
		*/
			
			for (String aa : Tree.getNodeList()) {
				System.out.println(aa + "-->");
				Tree.getNodeList().clear();
				list = Filtration.getNewTable(table, Filtration.getColumn(table, Filtration.getColumnIndex(table, aa)),
						Filtration.getColumnIndex(table, aa));
				for (Object[][] object : list) {
					table.setTable(object);
					Entropy.getGain(table);
				}
			}
		}
	}

}
