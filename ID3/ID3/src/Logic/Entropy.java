package Logic;

import java.util.List;

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
		return Math.log10(x) / Math.log10(o);
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

	public static double EntropyByAtribute(Table table) {

		List<Object> answer = null;
		List<Object> values = null;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (table.getTable()[i][j] == DataSet.getAtributeList().get(i).getName()) {
				System.out.println("ddd");
				}
			}
		}

		return (-p / (p + n)) * getLog((p / (p + n)), 2) - (n / (p + n)) * getLog(n / (p + n), 2);

	}

}
