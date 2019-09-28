package root;

import java.util.ArrayList;
import java.util.List;

import Logic.Entropy;
import dataSet.DataSet;
import foFun.Parser;

public class Program {

	public static void main(String... args) {

		Object[][] newTable = new Object[][] { { 0, 1 }, { "no", "yes" }, { "yes", "no" }, { "no", "yes" },
				{ "no", "yes" }, { "yes", "no" }, { "yes", "no" } };
		List<Object> transfer = new ArrayList();

		for (int i = 0; i < newTable.length - 1; i++) {
			transfer.add(newTable[i + 1][1]);
		}

		//Parser.counter(Parser.parse(transfer), transfer);
		System.out.println(Parser.parse(transfer).toString());
	}
}
