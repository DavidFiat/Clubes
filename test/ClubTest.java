import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;
import model.*;

class ClubTest {

	private Club club;

	@SuppressWarnings("deprecation")
	@Test

	public void setupOwnersStage() {
		club = new Club(null, null, null, null);

		Owner a = new Owner("1", "David", "Fiat", new Date(116, 12, 11), "Gatos");
		Owner b = new Owner("2","Victor", "Vargas", new Date(116, 12, 3), "Perros");
		Owner c = new Owner("3", "Manuel", "Castaño", new Date(116, 12, 1), "Conejos");

		club.getOwners().add(a);
		club.getOwners().add(b);
		club.getOwners().add(c);
	}

	@Test
	public void sortOwnerByIDTest() {
		setupOwnersStage();
		club.sortOwnerByID();
		for (int i = 0; i < club.getOwners().size() - 1; i++) {
			assertTrue(club.getOwners().get(i).compareByID(club.getOwners().get(i + 1)) < 0);
		}
	}

	@Test
	public void sortOwnerByNameTest() {
		setupOwnersStage();
		club.sortOwnerByName();
		for (int i = 0; i < club.getOwners().size() - 1; i++) {
			assertTrue(club.getOwners().get(i).compareByName(club.getOwners().get(i + 1)) < 0);
		}
	}

	@Test
	public void sortOwnerByLastNamesTest() {
		setupOwnersStage();
		club.sortOwnerByLastNames();
		for (int i = 0; i < club.getOwners().size() - 1; i++) {
			assertTrue(club.getOwners().get(i).compareByLastNames(club.getOwners().get(i + 1)) < 0);
		}
	}

	@Test
	public void sortOwnerByBirthDayTest() {
		setupOwnersStage();
		club.sortOwnerByBirthDay();
		for (int i = 0; i < club.getOwners().size() - 1; i++) {
			assertTrue(club.getOwners().get(i).compareByBirthDay(club.getOwners().get(i + 1)) < 0);
		}
	}

	@Test
	public void sortOwnerByPetKindTest() {
		setupOwnersStage();
		club.sortOwnerByPetKind();
		for (int i = 0; i < club.getOwners().size() - 1; i++) {
			assertTrue(club.getOwners().get(i).compareByPetKind(club.getOwners().get(i + 1)) < 0);
		}

	}
	@Test
	public void testSearchBinaryByID() {
		setupOwnersStage();
		club.sortOwnerByID();
		for(int i=0; i<club.getOwners().size();i++) {
		assertTrue(club.searchBinaryOwnerByID("1") == 0);
		}
	}
	
	@Test
	public void testSearchBinaryByName() {
		setupOwnersStage();
		club.sortOwnerByName();
		for(int i=0; i<club.getOwners().size();i++) {
		assertTrue(club.searchBinaryOwnerByName("David") == 0);
		}
	}
	
	@Test
	public void testSearchBinaryByLastNames() {
		setupOwnersStage();
		club.sortOwnerByLastNames();
		for(int i=0; i<club.getOwners().size();i++) {
		assertTrue(club.searchBinaryOwnerByLastNames("Castaño") == 0);
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSearchBinaryByBirthDay() {
		setupOwnersStage();
		club.sortOwnerByBirthDay();
		for(int i=0; i<club.getOwners().size();i++) {
		assertTrue(club.searchBinaryOwnerByBirthDay(new Date(116,12,1)) == 0);
		}
	}

	@Test
	public void testSearchBinaryByPetKind() {
		setupOwnersStage();
		club.sortOwnerByPetKind();
		for(int i=0; i<club.getOwners().size();i++) {
		assertTrue(club.searchBinaryOwnerByPetKind("Conejos") == 0);
		}
	}
	

}
