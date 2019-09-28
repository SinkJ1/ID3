package dataSet;

import root.Atribute;

public class DataSet {

	int id = 0;

	private Object[][] newTable = new Object[][] {
		{getId() , new Atribute(1, "Outlook"), new Atribute(2, "Temperature"),new Atribute(3, "Humidity"), new Atribute(4, "Windy"), new Atribute(5, "PlayTennis") }, 
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
		{getId() , "Overcast","Hot","Normal","Weak","Yes"},
		{getId() , "Rainy","Mild","High","Strong","No"}
	};
	
	private int getId() {
		id++;
		return id;
	}

	public Object[][] getNewTable() {
		return newTable;
	}
	
}
