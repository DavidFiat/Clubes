package ui;
import model.*;
import java.util.*;

public class Main {

	private Software software;
	private Scanner reader;
	
	
	
//	@SuppressWarnings("deprecation")
	public Main(){
				reader = new Scanner (System.in);
			//	software = new Software(clubs.add(new Club("S","S",new Date(12,12,12),"String"));

 	}
		
	
	public static void main(String[] args) {
		Main m = new Main();
		m.showMenu();
	}
		
public void showMenu(){
		
		int option = 0;
		while (option != 9){
			
			
		System.out.println(" WELCOME TO THE CLUBS MANAGEMENT SOFTWARE.");	
		System.out.println(" 1.To register a new owner.");	
		System.out.println(" 2.To register a new pet.");	
		System.out.println(" 3.To register a new club.");	
		System.out.println(" 4.To show the clubs, or the owners or the pets ordered by a certain criterion.");	
		System.out.println(" 5.To show the owners ordered by their number of pets.");	
		System.out.println(" 6.To show the clubs ordered by their number of owners.");	
		System.out.println(" 7.To search for a club, an owner or a pet by ID or by name.");	
		System.out.println(" 8.To delete a club, an owner or a pet.");	
		System.out.println(" 9 To exit.");
			
			
		option = reader.nextInt();	
			
			
		  switch (option){
              
               case (1):
			   System.out.println(software.getClubs());
			 
				
				
				break;
				
			
			   case (2):
			   

			   


				
				case (3):
				
			 
				  
				case (4):
				
		
			  
			   case (5):
			   
			  

				
				case(6):
				
			
				case (7):
				
				
				case (8):
				
			
				case (9):
				
			
				
				case (10):
	
}
}
}
}

