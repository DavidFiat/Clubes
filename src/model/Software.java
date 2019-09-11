package model;

import java.util.*;

public class Software {

	// Relations

	private ArrayList<Club> clubs;

	// Methods

	public Software() {
		clubs = new ArrayList<Club>();
	}

	public ArrayList<Club> getClubs() {
		return clubs;
	}

	public void setClubs(ArrayList<Club> clubs) {
		this.clubs = clubs;
	}

	// By Selection
	public void sortClubByID() {
		for (int i = 0; i < clubs.size() - 1; i++) {
			Club small = clubs.get(i);
			int i3 = i;
			for (int i2 = i + 1; i2 < clubs.size(); i2++) {
				if (clubs.get(i2).compareTo(small) < 0) {
					i3 = i2;
					small = clubs.get(i2);
				}
			}
			Club temp = clubs.get(i);
			clubs.set(i, small);
			clubs.set(i3, temp);
		}
	}

	// By Selection
	public void sortClubByName() {
		for (int i = 0; i < clubs.size() - 1; i++) {
			Club small = clubs.get(i);
			int i3 = i;
			for (int i2 = i + 1; i2 < clubs.size(); i2++) {
				if (clubs.get(i2).compare(clubs.get(i2), small) < 0) {
					i3 = i2;
					small = clubs.get(i2);
				}
			}
			Club temp = clubs.get(i);
			clubs.set(i, small);
			clubs.set(i3, temp);
		}
	}

	// By Selection
	public void sortClubByCreationDate() {
		for (int i = 0; i < clubs.size() - 1; i++) {
			Club small = clubs.get(i);
			int i3 = i;
			for (int i2 = i + 1; i2 < clubs.size(); i2++) {
				if (clubs.get(i2).compareByCreationDate(small) < 0) {
					i3 = i2;
					small = clubs.get(i2);
				}
			}
			Club temp = clubs.get(i);
			clubs.set(i, small);
			clubs.set(i3, temp);
		}
	}

	// By Selection
	public void sortClubByPetKind() {
		for (int i = 0; i < clubs.size() - 1; i++) {
			Club small = clubs.get(i);
			int i3 = i;
			for (int i2 = i + 1; i2 < clubs.size(); i2++) {
				if (clubs.get(i2).compareByPetKind(small) < 0) {
					i3 = i2;
					small = clubs.get(i2);
				}
			}
			Club temp = clubs.get(i);
			clubs.set(i, small);
			clubs.set(i3, temp);
		}
	}

	public int searchBinaryClubByID(String e) {
		int position = -1;
		int begining = 0;
		int end = clubs.size() - 1;
		boolean find = false;
		double t=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (clubs.get(half).getID().equals(e)) {
				position = half;
				find = true;
			} else if (clubs.get(half).getID().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timeClubID(t2-t);
		return position;
	}

	public double timeClubID(double t) {
		return t;
		}
	
	public int searchBinaryClubByName(String e) {
		int position = -1;
		int begining = 0;
		int end = clubs.size() - 1;
		boolean find = false;
		double t=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (clubs.get(half).getName().equals(e)) {
				position = half;
				find = true;
			} else if (clubs.get(half).getName().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timeClubName(t2-t);
		return position;
	}

	public double timeClubName(double t) {
		return t;
		}
	
	public int searchBinaryClubByCreationDate(Date e) {
		int position = -1;
		int begining = 0;
		int end = clubs.size() - 1;
		boolean find = false;
		double t2=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (clubs.get(half).getCreationDate().equals(e)) {
				position = half;
				find = true;
			} else if (clubs.get(half).getCreationDate().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
	double	t=System.currentTimeMillis();
	timeCreationDateClub(t2-t);
		return position;
	}
	
	
	public double timeCreationDateClub(double t) {
		return t;
		}

	public int searchBinaryClubByPetKind(String e) {
		int position = -1;
		int begining = 0;
		int end = clubs.size() - 1;
		boolean find = false;
		double t=System.currentTimeMillis();
		while (begining <= end && !find) {
			int half = (begining + end) / 2;
			if (clubs.get(half).getPetKind().equals(e)) {
				position = half;
				find = true;
			} else if (clubs.get(half).getPetKind().compareTo(e) > 0) {
				end = half - 1;
			} else {
				begining = half + 1;
			}
		}
		double t2=System.currentTimeMillis();
		timeKindClub(t2-t);
		return position;
	}
	
	
	public double timeKindClub(double t) {
		return t;
		}

	public int searchNormalClubByID(String e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<clubs.size();i++) {
			if(clubs.get(i).getID().equals(e)){
				 position= i;
			}
			
		}		
		double t2=System.currentTimeMillis();
		timeClubIDNormal(t2-t);
			return position;
	}
	
	public double timeClubIDNormal(double t) {
		return t;
		}
	
	
	public int searchNormalClubByName(String e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<clubs.size();i++) {
			if(clubs.get(i).getName().equals(e)){
				 position= i;
			}
			
		}		
		double t2= System.currentTimeMillis();
		timeClubNameNormal(t2-t);
		return position;
	}
	
	public double timeClubNameNormal(double t) {
		return t;
		}
	
	
	public int searchNormalClubByCreationDate(Date e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<clubs.size();i++) {
			if(clubs.get(i).getCreationDate().equals(e)){
				 position= i;
			}
			
		}		
		double t2=System.currentTimeMillis();
		timeClubNormal(t2-t);
		return position;
	}
	
	
	public double timeClubNormal(double t) {
		return t;
		}
	
	
	public int searchNormalClubByPetKind(String e) {
		int position=0;
		double t=System.currentTimeMillis();
		for(int i=0;i<clubs.size();i++) {
			if(clubs.get(i).getPetKind().equals(e)){
				 position= i;
			}
			
		}		
		double t2=System.currentTimeMillis();
	timeNormalClubPetKind(t2-t);
		return position;
	}
	
	public double timeNormalClubPetKind(double t) {
		return t;
		}
	
	@Override
	public String toString() {
		return "Software [clubs=" + clubs + "]";
	}

}
