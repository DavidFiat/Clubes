import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import model.*;

class OwnerTest {
	private Owner owner;

	@SuppressWarnings("deprecation")
	@Test

	public void setupPetsStage() {
		owner = new Owner(null, null, null, null, null);

		Pet a = new Pet("3", "Bolt", new Date(117, 11, 2), 2, "Perro");
		Pet b = new Pet("4", "Botas", new Date(118, 11, 2), 2, "Gato");
		Pet c = new Pet("1", "Gru", new Date(115, 11, 2), 1, "Pajaro");

		owner.getPets().add(a);
		owner.getPets().add(b);
		owner.getPets().add(c);
	}

	@Test
	public void sortPetByIDTest() {
		setupPetsStage();
		owner.sortPetByID();
		for (int i = 0; i < owner.getPets().size() - 1; i++) {
			assertTrue(owner.getPets().get(i).compareByID(owner.getPets().get(i + 1)) < 0);
		}
	}

	@Test
	public void sortPetByNameTest() {
		setupPetsStage();
		owner.sortPetByName();
		for (int i = 0; i < owner.getPets().size() - 1; i++) {
			assertTrue(owner.getPets().get(i).compareByName(owner.getPets().get(i + 1)) < 0);
		}
	}

	@Test
	public void sortPetByBirthDayTest() {
		setupPetsStage();
		owner.sortPetByBirthDay();
		for (int i = 0; i < owner.getPets().size() - 1; i++) {
			assertTrue(owner.getPets().get(i).compareByBirthDay(owner.getPets().get(i + 1)) < 0);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void sortPetByGenderTest() {
		setupPetsStage();
		owner.sortPetByGender();
		for (int i = 0; i < owner.getPets().size() - 1; i++) {
			assertTrue(owner.getPets().get(i).compare(new Pet("3", "Bolt", new Date(117, 11, 2), 2, "Perro"),new Pet("1", "Gru", new Date(115, 11, 2), 1, "Pajaro"))> 0);
		}
	}

	@Test
	public void sortPetByPetKindTest() {
		setupPetsStage();
		owner.sortPetByPetKind();
		for (int i = 0; i < owner.getPets().size() - 1; i++) {
			assertTrue(owner.getPets().get(i).compareTo(owner.getPets().get(i + 1)) < 0);
		}
	}

	@Test
	public void testSearchBinaryByID() {
		setupPetsStage();
		owner.sortPetByID();
		for (int i = 0; i < owner.getPets().size(); i++) {
			assertTrue(owner.searchBinaryPetByID("1") == 0);
		}
	}

	@Test
	public void testSearchBinaryByName() {
		setupPetsStage();
		owner.sortPetByName();
		for (int i = 0; i < owner.getPets().size(); i++) {
			assertTrue(owner.searchBinaryPetByName("Gru") == 2);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSearchBinaryByBirthDay() {
		setupPetsStage();
		owner.sortPetByBirthDay();
		for(int i=0; i<owner.getPets().size();i++) {
		assertTrue(owner.searchBinaryPetByBirthDay(new Date(118,11,2)) == 2);
		}
	}


	@Test
	public void testSearchBinaryByGender() {
		setupPetsStage();
		owner.sortPetByGender();
		for (int i = 0; i < owner.getPets().size(); i++) {
			assertTrue(owner.searchBinaryPetByGender(1) == 0);
		}
	}

	@Test
	public void testSearchBinaryByPetKind() {
		setupPetsStage();
		owner.sortPetByPetKind();
		for (int i = 0; i < owner.getPets().size(); i++) {
			assertTrue(owner.searchBinaryPetByPetKind("Pajaro") == 1);

		}
	}
}