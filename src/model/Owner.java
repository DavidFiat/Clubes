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
	//By bubble
	public void sortPetByID() {
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
	//By bubble
	public void sortPetByName() {

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
	//By bubble
	public void sortPetByBirthDay() {

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
	//By bubble
	public void sortPetByGender() {

		for (int i = 0; i < pets.size(); i++) {
			for (int i2 = 0; i2 < pets.size() - 1 - i; i2++) {
				if (getPets().get(i2).compare(pets.get(i2),pets.get(i2 + 1)) > 0) {

					Pet temp = pets.get(i2);
					pets.set(i2, pets.get(i2 + 1));
					pets.set(i2 + 1, temp);

				}
			}
		}

	}


	//By bubble
	public void sortPetByPetKind() {

		for (int i = 0; i < pets.size(); i++) {
			for (int i2 = 0; i2 < pets.size() - 1 - i; i2++) {
				if (pets.get(i2).compareTo(pets.get(i2 + 1)) > 0) {

					Pet temp = pets.get(i2);
					pets.set(i2, pets.get(i2 + 1));
					pets.set(i2 + 1, temp);

				}
			}
		}

	}

	public int searchBinaryPetByID(String e) {
		int position = -1;
		int begining = 0;
		int end = pets.size() - 1;
		boolean find = false;
		double t = System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (pets.get(half).getID().equals(e)) {
				position = half;
				find = true;
			} else if (pets.get(half).getID().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2= System.currentTimeMillis();
		timePetID(t2-t);
		return position;
	}
	
	public double timePetID(double t) {
		return t;
		}
	
	public int searchBinaryPetByName(String e) {
		int position = -1;
		int begining = 0;
		int end = pets.size() - 1;
		boolean find = false;
		double t=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (pets.get(half).getName().equals(e)) {
				position = half;
				find = true;
			} else if (pets.get(half).getName().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timePetName(t2-t);
		return position;
	}
	
	public double timePetName(double t) {
		return t;
		}

	
	public int searchBinaryPetByBirthDay(Date e) {
		int position = -1;
		int begining = 0;
		int end = pets.size() - 1;
		boolean find = false;
		double t=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (pets.get(half).getBirthDay().equals(e)) {
				position = half;
				find = true;
			} else if (pets.get(half).getBirthDay().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timePetBirthDay(t2-t);
		return position;
	}

	public double timePetBirthDay(double t) {
		return t;
		}
	
	public int searchBinaryPetByGender(int e) {
		int position = -1;
		int begining = 0;
		int end = pets.size() - 1;
		boolean find = false;
		double t=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (pets.get(half).getGender()==(e)) {
				position = half;
				find = true;
			} else if (pets.get(half).getGender()-(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timePetGender(t2-t);
		return position;
	}
	
	public double timePetGender(double t) {
		return t;
		}
	
	public int searchBinaryPetByPetKind(String e) {
		int position = -1;
		int begining = 0;
		int end = pets.size() - 1;
		boolean find = false;
		double t=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (pets.get(half).getPetKind().equals(e)) {
				position = half;
				find = true;
			} else if (pets.get(half).getPetKind().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timePetKind(t2-t);
		return position;
	}
	
	public double timePetKind(double t) {
		return t;
		}
	
	public int searchNormalPetByID(String e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<pets.size();i++) {
			if(pets.get(i).getID().equals(e)){
				 position= i;
			}
			
		}
		double t2=System.currentTimeMillis();
		timePetIDNormal(t2-t);
		return position;
	}
	
	
	public double timePetIDNormal(double t) {
		return t;
		}
	
	public int searchNormalPetByName(String e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<pets.size();i++) {
			if(pets.get(i).getName().equals(e)){
				 position= i;
			}
			
		}
		double t2=System.currentTimeMillis();
		timePetNameNormal(t2-t);
		return position;
	}
	
	public double timePetNameNormal(double t) {
		return t;
		}
	
	public int searchNormalPetByBirthDay(Date e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<pets.size();i++) {
			if(pets.get(i).getBirthDay().equals(e)){
				 position= i;
			}
			
		}
		double t2=System.currentTimeMillis();
		timePetBirthDayNormal(t2-t);
		return position;
	}
	
	
	public double timePetBirthDayNormal(double t) {
		return t;
		}
	
	public int searchNormalPetByGender(int e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<pets.size();i++) {
			if(pets.get(i).getGender()==(e)){
				 position= i;
			}
			
		}		
		double t2=System.currentTimeMillis();
		timePetGenderNormal(t2-t);
		return position;
	}
	
	public double timePetGenderNormal(double t) {
		return t;
		}
	
	public int searchNormalPetByPetKind(String e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<pets.size();i++) {
			if(pets.get(i).getPetKind().equals(e)){
				 position= i;
			}
			
		}
		double t2=System.currentTimeMillis();
		timePetKindNormal(t2-t);
		return position;
	}
	
	
	public double timePetKindNormal(double t) {
		return t;
		}
	
	@Override
	public String toString() {
		return "Owner [ID=" + ID + ", name=" + name + ", lastNames=" + lastNames + ", birthDay=" + birthDay
				+ ", petKind=" + petKind + ", pets=" + pets + "]";
	}

}
