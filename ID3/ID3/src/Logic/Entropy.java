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

	private static double total;

	public static double getN() {
		return n;
	}

	public static double getP() {
		return p;
	}

	public static double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

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

	public static double averageEntropy() {

		return 0.0;
	}

	public static void EntropyByAtribute(Table table) {

		List<Object> answer = new ArrayList();
		List<Object> values = new ArrayList();

		int j = 1;

		int i = 1;
		
		while(i <= 13 && j !=5) {
			values.add(table.getTable()[i][j]);
			i++;
			if(i >= 13) {
				System.out.println("-----------" + "\n");
				countAnswerForAtribute(Parser.uniqWord(values),table,j);
				i = 0;
				j++;
				values.clear();
			}
		}
				

	}

	private static void countAnswerForAtribute(Set<Object> list, Table table, int id) {

		List<Object> values = new ArrayList();

		if (!list.isEmpty()) {
			for (Object test : list) {
				for (int i = 0; i < table.getTable().length - 1; i++) {
					if (test.toString().equals(table.getTable()[i + 1][id])
							&& counter(test.toString(), table, id) >= values.size()) {
						values.add(table.getTable()[i + 1][5]);
					}
				}
				System.out.println(test.toString() + "-" + countEntropy(Parser.counter(values)));
				values.clear();
			}
		}
	}

	private static int counter(String value, Table table, int id) {

		int count = 0;
		for (int i = 0; i < table.getTable().length - 1; i++) {
			if (table.getTable()[i + 1][id].equals(value)) {
				count++;
			}
		}

		return count;
	}

	private static int counterLengthColumn(Table table, int id) {

		int count = 0;
		for (int i = 0; i < table.getTable().length - 1; i++) {
			if (table.getTable()[i + 1][id] != null) {
				count++;
			}
		}

		return count;
	}

}
/*
 * for (int i = 0; i < table.getTable().length; i++) { for (int j = 0; j <
 * table.getTable().length; j++) { for (int b = 0; b <
 * DataSet.getAtributeList().size(); b++) { if
 * (table.getTable()[i][j].toString().equals(DataSet.getAtributeList().get(b).
 * getName()) && DataSet.getAtributeList().get(b).getId() == 1) { for (int a =
 * 0; a < table.getTable().length - 1; a++) { answer.add(table.getTable()[a +
 * 1][DataSet.getAtributeList().get(b).getId()]); }
 * System.out.println(countAnswerForAtribute(Parser.uniqWord(answer), table));
 * break; } } } }
 */