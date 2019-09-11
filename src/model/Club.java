package model;

import java.util.*;

public class Club implements Comparable<Club>, Comparator<Club> {

	// Attributes

	private String ID;
	private String name;
	private Date creationDate;
	private String petKind;

	// Relations

	private ArrayList<Owner> owners;

	// Methods

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

	public int compareByCreationDate(Club p) {
		return creationDate.compareTo(p.getCreationDate());
	}

	public int compareByPetKind(Club p) {
		return petKind.compareTo(p.getPetKind());
	}

	// By Insertion
	public void sortOwnerByID() {
		for (int i = 1; i < owners.size(); i++) {
			for (int i2 = i; i2 > 0 && owners.get(i2 - 1).compareByID(owners.get(i2)) > 0; i2--) {
				Owner temp = owners.get(i2);
				owners.set(i2, owners.get(i2 - 1));
				owners.set(i2 - 1, temp);
			}
		}

	}

	// By Insertion
	public void sortOwnerByName() {
		for (int i = 1; i < owners.size(); i++) {
			for (int i2 = i; i2 > 0 && owners.get(i2 - 1).compareByName(owners.get(i2)) > 0; i2--) {
				Owner temp = owners.get(i2);
				owners.set(i2, owners.get(i2 - 1));
				owners.set(i2 - 1, temp);
			}
		}

	}

	// By Insertion
	public void sortOwnerByLastNames() {
		for (int i = 1; i < owners.size(); i++) {
			for (int i2 = i; i2 > 0 && owners.get(i2 - 1).compareByLastNames(owners.get(i2)) > 0; i2--) {
				Owner temp = owners.get(i2);
				owners.set(i2, owners.get(i2 - 1));
				owners.set(i2 - 1, temp);
			}
		}

	}

	// By Insertion
	public void sortOwnerByBirthDay() {
		for (int i = 1; i < owners.size(); i++) {
			for (int i2 = i; i2 > 0 && owners.get(i2 - 1).compareByBirthDay(owners.get(i2)) > 0; i2--) {
				Owner temp = owners.get(i2);
				owners.set(i2, owners.get(i2 - 1));
				owners.set(i2 - 1, temp);
			}
		}

	}

	// By Insertion
	public void sortOwnerByPetKind() {
		for (int i = 1; i < owners.size(); i++) {
			for (int i2 = i; i2 > 0 && owners.get(i2 - 1).compareByPetKind(owners.get(i2)) > 0; i2--) {
				Owner temp = owners.get(i2);
				owners.set(i2, owners.get(i2 - 1));
				owners.set(i2 - 1, temp);
			}
		}

	}

	public int searchBinaryOwnerByID(String e) {
		int position = -1;
		int begining = 0;
		int end = owners.size() - 1;
		boolean find = false;
		double t= System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (owners.get(half).getID().equals(e)) {
				position = half;
				find = true;
			} else if (owners.get(half).getID().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timeOwnerID(t2-t);
		return position;
	}

	public double timeOwnerID(double t) {
		return t;
		}
	
	public int searchBinaryOwnerByName(String e) {
		int position = -1;
		int begining = 0;
		int end = owners.size() - 1;
		boolean find = false;
		double t= System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (owners.get(half).getName().equals(e)) {
				position = half;
				find = true;
			} else if (owners.get(half).getName().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timeOwnerName(t2-t);
		return position;
	}
	
	public double timeOwnerName(double t) {
		return t;
		}
	
	public int searchBinaryOwnerByLastNames(String e) {
		int position = -1;
		int begining = 0;
		int end = owners.size() - 1;
		boolean find = false;
		double t=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (owners.get(half).getLastNames().equals(e)) {
				position = half;
				find = true;
			} else if (owners.get(half).getLastNames().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timeOwnerLastNames(t2-t);
		return position;
	}

	public double timeOwnerLastNames(double t) {
		return t;
		}
	
	public int searchBinaryOwnerByBirthDay(Date e) {
		int position = -1;
		int begining = 0;
		int end = owners.size() - 1;
		boolean find = false;
		double t=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (owners.get(half).getBirthDay().equals(e)) {
				position = half;
				find = true;
			} else if (owners.get(half).getBirthDay().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timeOwnerBirthDay(t2-t);
		return position;
	}
	
	public double timeOwnerBirthDay(double t) {
		return t;
		}
	
	public int searchBinaryOwnerByPetKind(String e) {
		int position = -1;
		int begining = 0;
		int end = owners.size() - 1;
		boolean find = false;
		double t=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (owners.get(half).getPetKind().equals(e)) {
				position = half;
				find = true;
			} else if (owners.get(half).getPetKind().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timeOwnerPetKind(t2-t);
		return position;
	}
	
	public double timeOwnerPetKind(double t) {
		return t;
		}
	
	public int searchNormalOwnerByID(String e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<owners.size();i++) {
			if(owners.get(i).getID().equals(e)){
				 position= i;
			}
			
		}	
		double t2=System.currentTimeMillis();
		timeOwnerIDNormal(t2-t);
		return position;
	}
	
	public double timeOwnerIDNormal(double t) {
		return t;
		}
	
	public int searchNormalOwnerByName(String e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<owners.size();i++) {
			if(owners.get(i).getName().equals(e)){
				 position= i;
			}
			
		}	
		double t2=System.currentTimeMillis();
		timeOwnerNameNormal(t2-t);
		return position;
	}

	public double timeOwnerNameNormal(double t) {
		return t;
		}
	
	public int searchNormalOwnerByLastNames(String e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<owners.size();i++) {
			if(owners.get(i).getLastNames().equals(e)){
				 position= i;
			}
			
		}		
		double t2=System.currentTimeMillis();
		timeOwnerLastNamesNormal(t2-t);
		return position;
	}
	
	public double timeOwnerLastNamesNormal(double t) {
		return t;
		}
	
	public int searchNormalOwnerByBirthDay(Date e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<owners.size();i++) {
			if(owners.get(i).getBirthDay().equals(e)){
				 position= i;
			}
			
		}		
		double t2=System.currentTimeMillis();
		timeOwnerBirthDayNormal(t2-t);
		return position;
	}
	
	public double timeOwnerBirthDayNormal(double t) {
		return t;
		}
	
	public int searchNormalOwnerByPetKind(String e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<owners.size();i++) {
			if(owners.get(i).getPetKind().equals(e)){
				 position= i;
			}
			
		}		
		double t2=System.currentTimeMillis();
		timeOwnerKindNormal(t2-t);
		return position;
	}
	
	public double timeOwnerKindNormal(double t) {
		return t;
		}
	
	@Override
	public String toString() {
		return "Club [ID=" + ID + ", name=" + name + ", creationdate=" + creationDate + ", petKind=" + petKind
				+ ", owners=" + owners + "]";
	}

//Using Interface Comparable
	@Override
	public int compareTo(Club p) {
		return ID.compareTo(p.getID());
	}

//Using Interface Comparator
	@Override
	public int compare(Club a, Club b) {
		return a.getName().compareTo(b.getName());
	}
}
