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

		List<Object> answer = new ArrayList();
		List<Object> values = null;

		for (int i = 0; i < table.getTable().length; i++) {
			for (int j = 0; j < table.getTable().length; j++) {
				for (int b = 0; b < DataSet.getAtributeList().size(); b++) {
					if (table.getTable()[i][j].toString().equals(DataSet.getAtributeList().get(b).getName())
							&& DataSet.getAtributeList().get(b).getId() == 1) {
						for (int a = 0; a < table.getTable().length - 1; a++) {
							answer.add(table.getTable()[a + 1][DataSet.getAtributeList().get(b).getId()]);
						}
						System.out.println(countAnswerForAtribute(Parser.uniqWord(answer), table));
						break;
					}
				}
			}
		}

		return (-p / (p + n)) * getLog((p / (p + n)), 2) - (n / (p + n)) * getLog(n / (p + n), 2);

	}

	/*
	 * сложить все yes no в один лист и отправить в метод counter 
	 * вызвать метод для подсчёта энтропии
	 * 
	 * 
	 * 
	 * 
	 */
	
	private static List<Object> countAnswerForAtribute(Set<Object> list, Table table) {
		
		list.clear();
		
		System.out.println(list.isEmpty());
		
		list.add("Sunny");
		
		List<Object> values = new ArrayList();
		int sum = 0;
		for (int i = 0; i < table.getTable().length - 1; i++) {
				if (list.contains(table.getTable()[i + 1][1].toString()) && table.getTable()[i + 1][5].equals("Yes")) {
					values.add(table.getTable()[i + 1][5]);
					sum++;
				}
			sum = 0;
		}

		for (Object a1 : values) {
			System.out.println(a1);
		}
		return null;
	}

}
