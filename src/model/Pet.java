package model;
import java.util.*;


public class Pet {

	//Attributes
	public static final int MALE=1;
	public static final int FEMALE=2;
	private String ID;
	private String name;
	private Date birthDay;
	private int gender;
	private String petKind;
	
	//Methods
	public Pet(String ID, String name, Date birthDay, int gender, String petKind) {
		super();
		
		this.ID = ID;
		this.name = name;
		this.birthDay = birthDay;
		this.gender = gender;
		this.petKind = petKind;
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

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getPetKind() {
		return petKind;
	}

	public void setPetKind(String petKind) {
		this.petKind = petKind;
	}
	
	
	
	
	
	
	
}
