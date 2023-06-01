package shelf;

import java.util.ArrayList;

public class Shelf {
	//자료구조(물리적)- ArrayList
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
}
