
import java.util.*;

public class DungeonAdventureDriver {
	public static void main(String[] args) {
		
		int option;
		Scanner kb = new Scanner(System.in);
		option = displayMenu(kb);
		if(option ==1)
		{
			//call to the hero factory
			//HeroFactory.createHero(Thief.name(),Thief.stats());
		
		}
		else if( option ==2)
		{
			//call to the hero factory
			//HeroFactory.createHero(Sorceress.name(), Sorceress.stats());

		}
		else if(option == 3)
		{
			//call to the HeroFactory
			//HeroFactory.createHero(Sorceress.name(), Sorceress.stats());
		}
		else if(option ==4)
		{
			 //call to the hero Factory
			 HeroFactory.createHero("melody", 100, 10, 35, 65,0.8);
			
		}
	}
	
	
	/*protected static int chooseAttack(Scanner kb)
	{
		
		System.out.println("Please choose the type of attack:");
		System.out.println("1. Special Attack " );
		System.out.println("2. Regular attack ");
		int choice = kb.nextInt();
		kb.nextLine();
		return choice;
	}*/
	
	
		private static int displayMenu(Scanner kb)
		{
			
			int choice;
			System.out.println("Please choose a hero from the following options: ");
			System.out.println("1. Thief ");
			System.out.println("2. Sorceress ");
			System.out.println("3. Warrior ");
			System.out.println("4. Elf Wizard ");

			choice = kb.nextInt();
			return choice;
			
			
		}
}


