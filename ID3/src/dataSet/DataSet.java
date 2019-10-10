package dataSet;

public class DataSet {

	private int id = 0;
		
	private Object[][] newTable = new Object[][] {
		{getId() , "Outlook", "Temperature","Humidity", "Windy", "PlayTannys" },//0 
		{getId() , "Sunny","hot","High","Weak","No"},							//1
		{getId() , "Sunny","hot","High","Strong","No"},							//2
		{getId() , "Overcast","hot","High","Weak","Yes"},						//3
		{getId() , "Rainy","Mild","High","Weak","Yes"},							//4
		{getId() , "Rainy","Cool","Normal","Weak","Yes"},						//5
		{getId() , "Rainy","Cool","Normal","Strong","No"},						//6
		{getId() , "Overcast","Cool","Normal","Strong","Yes"},					//7
		{getId() , "Sunny","Mild","High","Weak","No"},							//8
		{getId() , "Sunny","Cool","Normal","Weak","Yes"},						//9	
		{getId() , "Rainy","Mild","Normal","Weak","Yes"},						//10	
		{getId() , "Sunny","Mild","Normal","Strong","Yes"},						//11
		{getId() , "Overcast","Mild","High","Strong","Yes"},					//12	
		{getId() , "Overcast","hot","Normal","Weak","Yes"},						//13
		{getId() , "Rainy","Mild","High","Strong","No"}							//14
	};
	private int getId() {
		return id++;
	}

	public Object[][] getNewTable() {
		return newTable;
	}

}
