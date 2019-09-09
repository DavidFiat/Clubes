package model;
import java.util.*;

public class Software {

	//Relations
	
	private ArrayList<Club> clubs;
	
	//Methods
	
	public Software() {
		clubs = new ArrayList<Club>();
	}

	public ArrayList<Club> getClubs() {
		return clubs;
	}

	public void setClubs(ArrayList<Club> clubs) {
		this.clubs = clubs;
	}

	
	
}
