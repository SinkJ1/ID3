package Logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import dataSet.DataSet;
import foFun.Parser;
import root.Table;

public class Entropy {

	private static double n;

	private static double p;

	private static double getLog(double x, double o) {
		if (x > 0) {
			return Math.log10(x) / Math.log10(o);
		} else
			return 0;
	}

	public static double countEntropy(List<Object> elements) {

		String[] value = null;

		for (Object element : elements) {
			String he1 = element.toString();
			value = he1.split("-");
			if (value[0].equalsIgnoreCase("Yes")) {
				p = Double.parseDouble(value[1]);
			} else if (value[0].equalsIgnoreCase("No")) {
				n = Double.parseDouble(value[1]);
			}
		}
		return (-p / (p + n)) * getLog((p / (p + n)), 2) - (n / (p + n)) * getLog(n / (p + n), 2);
	}

	public static void EntropyByAtribute(Table table) {

		List<Object> gain = new ArrayList();
		List<Object> values = new ArrayList();

		int j = 1;

		int i = 1;

		while (i <= 13 && j != 5) {
			values.add(table.getTable()[i][j]);
			i++;
			if (i >= 13) {
				gain.add(table.getTable()[0][j] + "-" + countAnswerForAtribute(Parser.uniqWord(values), table, j));
				i = 1;
				j++;
				values.clear();
			}
		}
		for (Object a : gain) {
			System.out.println(a);
		}
	}

	private static Double countAnswerForAtribute(Set<Object> list, Table table, int id) {

		List<Object> values = new ArrayList();
		List<Double> gain = new ArrayList();
		double perem = 0.0;
		double avg = 0;
		double iterator = 0;

		if (!list.isEmpty()) {
			for (Object test : list) {
				for (int i = 0; i < table.getTable().length - 1; i++) {
					if (test.toString().equals(table.getTable()[i + 1][id])
							&& counterValuesInColumn(test.toString(), table, id) >= values.size()) {
						values.add(table.getTable()[i + 1][5]);
					}
				}

				perem = (values.size() / counterLengthColumn(table, 5)) * countEntropy(Parser.counter(values));
				avg += perem;
				iterator = countEntropy(Parser.counter(returnAnswerColumn(table))) - avg;
				values.clear();
			}
			gain.add(iterator);
		}
		return gain.get(0);
	}

	private static int counterValuesInColumn(String value, Table table, int id) {

		int count = 0;
		for (int i = 0; i < table.getTable().length - 1; i++) {
			if (table.getTable()[i + 1][id].equals(value)) {
				count++;
			}
		}

		return count;
	}

	private static double counterLengthColumn(Table table, int id) {

		int count = 0;
		for (int i = 0; i < table.getTable().length - 1; i++) {
			if (table.getTable()[i + 1][id] != null) {
				count++;
			}
		}

		return count;
	}

	private static List<Object> returnAnswerColumn(Table table) {

		List<Object> list = new ArrayList();
		for (int i = 0; i < table.getTable().length - 1; i++) {
			list.add(table.getTable()[i + 1][5]);
		}

		return list;
	}

}
