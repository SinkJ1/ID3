package foFun;

import java.util.ArrayList;
import java.util.List;

public class Parser {

	public static List<Object> parse(List<Object> str) {
		List<Object> a1 = new ArrayList();
		for (Object a : str) {
			if (a != a1) {
				a1.add(a);
			}
		}
		return a1;
	}

	public static void counter(List<Object> words, List<Object> column) {
		List<Object> a1 = new ArrayList();
		int counter = 0;
		for (Object word : words) {
			for (Object findWord : column) {
				if (word.equals(findWord)) {
					counter++;
					a1.add(word + " count - " + counter);
				}
				System.out.println(column.size() + " " + words.size());
				break;
			}
			counter = 0;
		}

		for (Object a : a1) {
			System.out.println(a);
		}

	}

}
