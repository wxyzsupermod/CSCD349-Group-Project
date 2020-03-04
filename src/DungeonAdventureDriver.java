
import java.util.*;

public class DungeonAdventureDriver {
	public static void main(String[] args) {
		Hero H1 = null;
		int option;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a name for your character:");
		String name = kb.nextLine();
		option = displayMenu(kb);
		
		
		if(option ==1)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createHero(name, 100, 10, 35, 65,0.8);
			 System.out.println("Creation of Hero successful : " + name  + " The kind Thief has "+  H1.getHealthPoints() + " in health points!"  );
		}
		else if(option ==2)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createHero(name, 100, 10, 35, 65,0.8);
			 System.out.println("Creation of Hero successful : " + name  + " The Sorceress has "+  H1.getHealthPoints() + " in health points!"  );
		}
		else if(option ==3)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createHero(name, 100, 10, 35, 65,0.8);
			 System.out.println("Creation of Hero successful : " + name  + " The Warrior "+  H1.getHealthPoints() + " in health points!"  );
		}
		else if(option ==4)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createHero(name, 100, 10, 35, 65,0.8);
			 System.out.println("Creation of Hero successful : " + name  + " The Elf Wizard has "+  H1.getHealthPoints() + " in health points!"  );
		}
		else if(option ==5)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createHero(name, 100, 10, 35, 65,0.8);
			 System.out.println("Creation of Hero successful : " + name  + " aka Gandalf has "+  H1.getHealthPoints() + " in health points!"  );
		}else if(option ==6)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createHero(name, 100, 10, 35, 65,0.8);
			 System.out.println("Creation of Hero successful : " + name  + " The Sorcerer has "+  H1.getHealthPoints() + " in health points!"  );
		}
	}
	private static int displayMenu(Scanner kb)
		{
			
			int choice;
			System.out.println("Please choose a hero from the following options: ");
			System.out.println("1. Thief ");
			System.out.println("2. Sorceress ");
			System.out.println("3. Warrior ");
			System.out.println("4. Elf Wizard ");
			System.out.println("5. Gandalf  ");
			System.out.println("6. Socerer ");
			

			choice = kb.nextInt();
			return choice;
			
			
		}
}


