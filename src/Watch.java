
public class Watch {
	private int rating;
	private Person person;
	private Movie movie;
	
	public Watch (int rating) {
		this.rating = rating;
	}
	public Watch (int rating, Person person, Movie movie) {
		this.rating = rating;
		this.movie = movie;
		this.person = person;
	}

}
