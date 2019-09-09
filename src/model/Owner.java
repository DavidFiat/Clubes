package model;
import java.util.*;

public class Owner {

	//Attributes
	private String ID;
	private String name;
	private String lastNames;
	private Date birthDay;
	private String petKind;
	
	//Relations
	
	private ArrayList<Pet> pets;
	
	//Methods 

	public Owner(String ID, String name, String lastNames, Date birthDay, String petKind) {
		super();
		this.ID = ID;
		this.name = name;
		this.lastNames = lastNames;
		this.birthDay = birthDay;
		this.petKind = petKind;
		pets = new ArrayList<Pet>();

	}


	public ArrayList<Pet> getPets() {
		return pets;
	}


	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
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


	public String getLastNames() {
		return lastNames;
	}


	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}


	public Date getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


	public String getPetKind() {
		return petKind;
	}


	public void setPetKind(String petKind) {
		this.petKind = petKind;
	}
	
	
	
}
