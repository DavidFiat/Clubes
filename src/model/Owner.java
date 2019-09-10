package model;

import java.util.*;

public class Owner {

	// Attributes
	private String ID;
	private String name;
	private String lastNames;
	private Date birthDay;
	private String petKind;

	// Relations

	private ArrayList<Pet> pets;

	// Methods

	public Owner(String ID, String name, String lastNames, Date birthDay, String petKind) {
		super();
		this.ID = ID;
		this.name = name;
		this.lastNames = lastNames;
		this.birthDay = birthDay;
		this.petKind = petKind;
		pets = new ArrayList<Pet>();

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

	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}

	public int compareByID(Owner p) {
		return ID.compareTo(p.getID());
	}

	public int compareByName(Owner p) {
		return name.compareTo(p.getName());
	}

	public int compareByLastNames(Owner p) {
		return lastNames.compareTo(p.getLastNames());
	}

	public int compareByBirthDay(Owner p) {
		return birthDay.compareTo(p.getBirthDay());
	}

	public int compareByPetKind(Owner p) {
		return petKind.compareTo(p.getPetKind());
	}

	public void sortPetByID(Pet e) {
		for (int i = 0; i < pets.size(); i++) {
			for (int i2 = 0; i2 < pets.size() - 1 - i; i2++) {
				if (pets.get(i2).compareByID(pets.get(i2 + 1)) > 0) {
					Pet temp = pets.get(i2);
					pets.set(i2, pets.get(i2 + 1));
					pets.set(i2 + 1, temp);
				}
			}
		}
	}
	
	public void sortPetByName(Pet e) {

		for (int i = 0; i < pets.size(); i++) {
			for (int i2 = 0; i2 < pets.size() - 1 - i; i2++) {
				if (pets.get(i2).compareByName(pets.get(i2 + 1)) > 0) {

					Pet temp = pets.get(i2);
					pets.set(i2, pets.get(i2 + 1));
					pets.set(i2 + 1, temp);

				}
			}
		}

	}
	public void sortPetByBirthDay(Pet e) {

		for (int i = 0; i < pets.size(); i++) {
			for (int i2 = 0; i2 < pets.size() - 1 - i; i2++) {
				if (pets.get(i2).compareByBirthDay(pets.get(i2 + 1)) > 0) {

					Pet temp = pets.get(i2);
					pets.set(i2, pets.get(i2 + 1));
					pets.set(i2 + 1, temp);

				}
			}
		}

	}
	public void sortPetByGender(Pet e) {

		for (int i = 0; i < pets.size(); i++) {
			for (int i2 = 0; i2 < pets.size() - 1 - i; i2++) {
				if (pets.get(i2).compareByGender(pets.get(i2 + 1)) > 0) {

					Pet temp = pets.get(i2);
					pets.set(i2, pets.get(i2 + 1));
					pets.set(i2 + 1, temp);

				}
			}
		}

	}
	public void sortPetByPetKind(Pet e) {

		for (int i = 0; i < pets.size(); i++) {
			for (int i2 = 0; i2 < pets.size() - 1 - i; i2++) {
				if (pets.get(i2).compareByPetKind(pets.get(i2 + 1)) > 0) {

					Pet temp = pets.get(i2);
					pets.set(i2, pets.get(i2 + 1));
					pets.set(i2 + 1, temp);

				}
			}
		}

	}

	
	@Override
	public String toString() {
		return "Owner [ID=" + ID + ", name=" + name + ", lastNames=" + lastNames + ", birthDay=" + birthDay
				+ ", petKind=" + petKind + ", pets=" + pets + "]";
	}

}
