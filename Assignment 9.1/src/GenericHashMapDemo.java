import java.util.*;					//importing java.util package to use HashMap
	
public class GenericHashMapDemo {	//main class of the program
	
	public static void main(String [] args) {	// Main method of the program
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();		//Creation of HashMap
		
		//put elements to the map
		hm.put(1, "Abhishek");
		hm.put(2, "Belal");
		hm.put(3, "Chetan");
		hm.put(4, "Deepak");
		
		//get a set of the entries
		Set<Map.Entry<Integer, String>> set = hm.entrySet();
		
		//display the elements of set
		for(Map.Entry<Integer, String> me : set) {
			System.out.println(me.getValue());
		}
	}
}
