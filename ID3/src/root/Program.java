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
		//System.out.println(Tree.getNodeList().size());
		Entropy.getGain(table);

		// System.out.println(Filtration.getNewTable(table, Filtration.getColumn(table,
		// Filtration.getColumnIndex(table, "Outlook")),
		// Filtration.getColumnIndex(table, "Outlook")));
		List<Object[][]> list;
		//System.out.println(Tree.getNodeList().size());
		for(String aa : Tree.getNodeList()) {
			list = Filtration.getNewTable(table,
					Filtration.getColumn(table, Filtration.getColumnIndex(table, aa)),
					Filtration.getColumnIndex(table, aa));
			for (Object[][] object : list) {
				table.setTable(object);
				Entropy.getGain(table);
			}

		}
		
		for(int i = 0; i < table.getTable().length;i++) {
			for(int j = 0; j < table.getTable()[i].length;j++) {
				//System.out.println(table.getTable()[i][j]);							
			}
		}
		
		for(String aa : Tree.getNodeList()) {
		//	System.out.println(aa);			
		}
		Builder builder = new Builder();
		//builder.build();
	}

}
