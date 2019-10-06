package dataSet;

public class DataSet {

	private int id = 0;
		
	private Object[][] newTable = new Object[][] {
		{getId() , "Outlook", "Temperature","Humidity", "Windy", "PlayTannys" }, 
		{getId() , "Sunny","hot","High","Weak","No"},
		{getId() , "Sunny","hot","High","Strong","No"},
		{getId() , "Overcast","hot","High","Weak","Yes"},
		{getId() , "Rainy","Mild","High","Weak","Yes"},
		{getId() , "Rainy","Cool","Normal","Weak","Yes"},
		{getId() , "Rainy","Cool","Normal","Strong","No"},
		{getId() , "Overcast","Cool","Normal","Strong","Yes"},
		{getId() , "Sunny","Mild","High","Weak","No"},
		{getId() , "Sunny","Cool","Normal","Weak","Yes"},
		{getId() , "Rainy","Mild","Normal","Weak","Yes"},
		{getId() , "Sunny","Mild","Normal","Strong","Yes"},
		{getId() , "Overcast","Mild","High","Strong","Yes"},
		{getId() , "Overcast","hot","Normal","Weak","Yes"},
		{getId() , "Rainy","Mild","High","Strong","No"}
	};
	
	private int getId() {
		return id++;
	}

	public Object[][] getNewTable() {
		return newTable;
	}

}
