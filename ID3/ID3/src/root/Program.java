package root;

import java.util.ArrayList;
import java.util.List;

import Logic.Entropy;
import dataSet.DataSet;
import foFun.Parser;

public class Program {

	public static void main(String... args) {

		Table table = new Table();

		DataSet data = new DataSet();

		table.setTable(data.getNewTable());

		List<Object> transfer = new ArrayList();

		List<Object> transfer1 = new ArrayList();
		
		for (int i = 0; i < table.getTable().length - 1; i++) {
		
			
		}
		
		Entropy.EntropyByAtribute(table);

		// System.out.println(Entropy.countEntropy(Parser.counter(transfer)));
		
		
	}
}
