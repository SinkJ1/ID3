package root;

public class Table {

	private static Table instance;

	private Object[][] table = new Object[1][7];


	public Object[][] getTable() {
		return table;
	}

	public void setTable(Object[][] table) {
		this.table = table;
	}

	public int getColumnLength() {
		int length = 0;
		for (int i = 0; i < getTable().length; i++) {
			length = getTable()[i].length;
			break;
		}

		return length;
	}

	public static Table getInstance() {
		if (instance == null) {
			instance = new Table();
		}
		return instance;
	}
}
