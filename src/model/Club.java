package model;
import java.util.*;

public class Club {

	//Attributes
	
	private String ID;
	private String name;
	private Date creationdate;
	private String petKind;
	
	// Relations
	
	private ArrayList<Owner> owners;


	//Methods
	
	public Club(String ID, String name, Date creationdate, String petKind) {
		
		this.ID = ID;
		this.name = name;
		this.creationdate = creationdate;
		this.petKind = petKind;
		owners = new ArrayList<Owner>();

	}


	public String getID() {
		return ID;
	}


	public void setID(String ID) {
		this.ID = ID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getCreationdate() {
		return creationdate;
	}


	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}


	public String getPetKind() {
		return petKind;
	}


	public void setPetKind(String petKind) {
		this.petKind = petKind;
	}


	public ArrayList<Owner> getOwners() {
		return owners;
	}


	public void setOwners(ArrayList<Owner> owners) {
		this.owners = owners;
	}
	
	
	
	
	
}	