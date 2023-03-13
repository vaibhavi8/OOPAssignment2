import java.util.ArrayList;

public class Movie {
	private String name;
	private String genre;
	private ArrayList<Watch> watched;
	
	public Movie(String name, String genre) {
		this.name = name;
		this.genre = genre;
	}
	public void addWatched(Watch watch) {
		watched.add(watch);
	}

}
