import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import model.*;

class SoftwareTest {

	private Software software;

	@SuppressWarnings("deprecation")
	@Test

	public void setupClubsStage() {
		software = new Software();

		Club a = new Club("12", "SuperHouse",new Date(112,11,2),"Cat");
		Club b = new Club("23", "Campestre", new Date(113,11,2),"Ornitorrinco");
		Club c = new Club("45", "MegaClub", new Date(114,12,2),"Ant");

		software.getClubs().add(a);
		software.getClubs().add(b);
		software.getClubs().add(c);
	}

	@Test
	public void sortClubByIDTest() {
		setupClubsStage();
		software.sortClubByID();
		for (int i = 0; i < software.getClubs().size() - 1; i++) {
			assertTrue(software.getClubs().get(i).compareTo(software.getClubs().get(i + 1)) < 0);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void sortClubByNameTest() {
		setupClubsStage();
		software.sortClubByName();
		for (int i = 0; i < software.getClubs().size() - 1; i++) {
			assertTrue(software.getClubs().get(i).compare(new Club("12", "SuperHouse",new Date(112,11,2),"Cat"),new Club("45", "MegaClub", new Date(114,12,2),"Ant"))>0);
		}
	}
	@Test
	public void sortClubByCreationDateTest() {
		setupClubsStage();
		software.sortClubByCreationDate();
		for (int i = 0; i < software.getClubs().size() - 1; i++) {
			assertTrue(software.getClubs().get(i).compareByCreationDate(software.getClubs().get(i + 1)) < 0);
		}
	}

	@Test
	public void sortClubByPetKindTest() {
		setupClubsStage();
		software.sortClubByPetKind();
		for (int i = 0; i < software.getClubs().size() - 1; i++) {
			assertTrue(software.getClubs().get(i).compareByPetKind(software.getClubs().get(i + 1)) < 0);
		}

	}
	@Test
	public void testSearchBinaryOwnerrByID() {
		setupClubsStage();
		software.sortClubByID();
		for(int i=0; i<software.getClubs().size();i++) {
		assertTrue(software.searchBinaryClubByID("12") == 0);
		}
	}
	
	@Test
	public void testSearchBinaryByName() {
		setupClubsStage();
		software.sortClubByName();
		for(int i=0; i<software.getClubs().size();i++) {
		assertTrue(software.searchBinaryClubByName("Campestre") == 0);
		}
	}
	
		
	@SuppressWarnings("deprecation")
	@Test
	public void testSearchBinaryByCreationDate() {
		setupClubsStage();
		software.sortClubByCreationDate();
		for(int i=0; i<software.getClubs().size();i++) {
		assertTrue(software.searchBinaryClubByCreationDate(new Date(112,11,2)) == 0);
		}
	}

	@Test
	public void testSearchBinaryByPetKind() {
		setupClubsStage();
		software.sortClubByPetKind();
		for(int i=0; i<software.getClubs().size();i++) {
		assertTrue(software.searchBinaryClubByPetKind("Ant") == 0);
		}
	}
	

	
	}


