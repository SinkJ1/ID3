package dataSet;

import root.Table;

public class DataTable {
	
	private String[] titles;
	private String[][] rows;
	
	public DataTable(String[] titles, String[][] rows) {
		this.titles = titles;
		this.rows = rows;
	}
	
	public DataTable filter(String ignoringTitle, String filterValue) {
		
		return null;		
	}	
	
	private void Test() {
		String[] colOutlook = new String[] { "sunny", "sunny", "overcast", "rainy", "rainy"    };
		String[] colTemp = new String[] {    "hot",   "hot",   "hot",      "mild",  "mild"     };
		String[] colResult = new String[] {  "no",    "no",    "yes",      "yes",   "no"       };
		
		var matrix = new String[][] {
			colOutlook, // 0
			colTemp,    // 1
			colResult   // 2
		};
		/*
		 * outlook
		 * 		sunny
		 * 			no
		 * 		overcast
		 * 			yes
		 * 		rainy
		 *	
		 * */
		
		/*(temp)
		 * 		hot
		 * 			outlook
		 * 				sunny
		 * 					no
		 * 				overcast
		 * 					yes
		 * 		mild
		 * 			outlook
		 * 				rainy
		 * 					yes
		 * 					no
		 * */

		var outlookRes = new String[] { "sunny", "sunny", "overcast" };
		var res = new String[] 		  { "no",    "no",    "yes"      };		
	}
}