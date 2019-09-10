package model;
import java.util.*;

public class Club {

	//Attributes
	
	private String ID;
	private String name;
	private Date creationDate;
	private String petKind;
	
	// Relations
	
	private ArrayList<Owner> owners;


	//Methods
	
	public Club(String ID, String name, Date creationDate, String petKind) {
		
		this.ID = ID;
		this.name = name;
		this.creationDate = creationDate;
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


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationdate(Date creationDate) {
		this.creationDate = creationDate;
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

	public int compareByID(Club p) {
		return ID.compareTo(p.getID());
	}
	
	public int compareByName(Club p) {
		return name.compareTo(p.getName());
	}
	
	
	public int compareByCreationDate(Club p) {
		return creationDate.compareTo(p.getCreationDate());
	}
	
	public int compareByPetKind(Owner p) {
		return petKind.compareTo(p.getPetKind());
	}
	
	@Override
	public String toString() {
		return "Club [ID=" + ID + ", name=" + name + ", creationdate=" + creationDate + ", petKind=" + petKind
				+ ", owners=" + owners + "]";
	}
	
	
	
	
	
}	