package foFun;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Parser {

	public static Set<Object> uniqWord(List<Object> str) {
		return new TreeSet<Object>(str);
	}

	public static List<Object> counter(List<Object> column) {
		List<Object> countWordInColumn = new ArrayList();
		Set<Object> words = uniqWord(column);
		int counter = 0;
		for (Object word : words) {
			for (Object findWord : column) {
				if (word.equals(findWord)) {
					counter++;
				}
			}
			countWordInColumn.add(word + "-" + counter);
			counter = 0;
		}

		if (countWordInColumn.size() == 1) {
			countWordInColumn.add("No" + "-" + 0);
		}

		return countWordInColumn;
	}

}
