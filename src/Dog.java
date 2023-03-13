import java.util.ArrayList;
public class Dog {
	private String breed;
	private String name;
	private ArrayList<Paw> paws = new ArrayList<Paw>(4); //only fits 4 paws
	public Dog(){	
	}
	
	public Paw addPaw(Paw paw) {
		this.paws.add(paw);
		return paw;
	}
			
}
