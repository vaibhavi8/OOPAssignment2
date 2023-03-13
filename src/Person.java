import java.util.ArrayList;

public class Person {
	private String name;
	private ArrayList<Watch> watched;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void addWatched(Watch watch) {
		watched.add(watch);
	}

}
