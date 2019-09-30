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
		List<Object> values = null;

		for (int i = 0; i < table.getTable().length; i++) {
			/*
			 * for (int j = 0; j < table.getTable().length; j++) { for (int b = 0; b <
			 * DataSet.getAtributeList().size(); b++) { if
			 * (table.getTable()[i][j].toString().equals(DataSet.getAtributeList().get(b).
			 * getName())) { for (int a = 0; a < table.getTable().length - 1; a++) {
			 * answer.add(table.getTable()[a +
			 * 1][DataSet.getAtributeList().get(b).getId()]); }
			 * System.out.println(DataSet.getAtributeList().get(b) + "----"
			 * +countAnswerForAtribute(Parser.uniqWord(answer), table)); } } } }
			 */

		}
	}

	/*
	 * сложить все yes no в один лист и отправить в метод counter вызвать метод для
	 * подсчёта энтропии
	 * 
	 * 
	 * 
	 * 
	 */

	private static List<Object> countAnswerForAtribute(Set<Object> list, Table table) {

		List<Object> values = new ArrayList();

		if (!list.isEmpty()) {
			for (Object test : list) {
				String findValue = test.toString();
				for (int i = 0; i < table.getTable().length - 1; i++) {
					if (findValue.equals(table.getTable()[i + 1][1]) && counter(findValue, table, 1) >= values.size()) {
						values.add(table.getTable()[i + 1][5]);
					}
				}

				System.out.println(findValue + "-" + countEntropy(Parser.counter(values)));

				values.clear();
			}
		}
		return null;
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

}
