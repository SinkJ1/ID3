package root;

public class Table {
	
	public void get() {
		System.out.println("aaaaa");
	}
	
	private Object[][] table = new Object[1][7];
	
	public Object[][] getTable() {
		return table;
	}

	public void setTable(Object[][] table) {
		this.table = table;
	}


}
