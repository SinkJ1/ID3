package dataSet;

import java.util.ArrayList;
import java.util.List;

import root.Atribute;

public class DataSet {

	private int id = 0;
	
	private final static Atribute outlook = new Atribute(1, "Outlook");

	private final static Atribute temperature = new Atribute(2, "Temperature");
	
	private final static Atribute humidity = new Atribute(3, "Humidity");
	
	private final static Atribute windy = new Atribute(4, "Windy");
	
	private final static Atribute playTennis = new Atribute(5, "PlayTennis");
	
	private static List<Atribute> atributeList = new ArrayList();
	
	static {
		atributeList.add(outlook);
		atributeList.add(temperature);
		atributeList.add(humidity);
		atributeList.add(windy);
		atributeList.add(playTennis);
	}
		
	private Object[][] newTable = new Object[][] {
		{getId() , outlook.getName(), temperature.getName(),humidity.getName(), windy.getName(), playTennis.getName() }, 
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
		return id++;
	}

	public Object[][] getNewTable() {
		return newTable;
	}

	public static List<Atribute> getAtributeList() {
		return atributeList;
	}
}
