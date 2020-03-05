
import java.util.*;

public class DungeonAdventureDriver {
	public static void main(String[] args) {
		Hero H1 = null;
		int option;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a name for your character:");
		String name = kb.nextLine();
		option = displayMenu(kb);
		Monster M1 = null;
		M1 = chooseMonster();
		
		
		if(option ==1)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createThief(name);
			 System.out.println("Creation of Hero successful : " + name  + " The kind Thief has "+  H1.getHealthPoints() + " in health Points!"  );
		}
		else if(option ==2)
		{
			 //call to the hero Factory
			H1 = HeroFactory.createSorceress(name);
			System.out.println("Creation of Hero successful : " + name  + " The Sorceress has "+  H1.getAttackSpeed() + " in Attack Speed!"  );
		}
		else if(option ==3)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createWarrior(name);
			 System.out.println("Creation of Hero successful : " + name  + " The Warrior has "+  H1.getAttackSpeed() + " in Attack Speed!"  );
		}
		else if(option ==4)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createElfWizard(name);
			 System.out.println("Creation of Hero successful : " + H1.getName()  + " The Elf Wizard has "+  H1.getAttackSpeed() + " in Attack Speed!"  );
		}
		else if(option ==5)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createGandalf(name);
			 System.out.println("Creation of Hero successful : " + name  + " aka Gandalf has "+  H1.getAttackSpeed() + " in Attack speed!"  );
		}else if(option ==6)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createSorcerer(name);
			 System.out.println("Creation of Hero successful : " + name  + " The Sorcerer has "+  H1.getAttackSpeed() + " in Attack Speed!"  );
		}
		
		System.out.println(H1.getName() + " was attacked by " + M1.getName());
		
		while(H1.isAlive() && M1.isAlive()) {
			int choice = chooseAttack(kb);
			if(choice == 1) {
				H1.specialAttack(M1);
			}
			if(choice == 2) {
				H1.regularAttack(M1);
			}
			if(H1.getHealthPoints() <= 0) {
				System.out.println(H1.getName() + " Has been defeated ");
				break;
			}
			if(M1.getHealthPoints() <= 0) {
				System.out.println(H1.getName() + " has been defeated " + M1.getName());
				break;
			}
		}
		/*
		if(attackChoice == 1){
			H1.specialAttack(M1);
		}
		else{
		H1.regularAttack(M1);
		}
		if( M1.isAlive()){
			M1.regularAttack(H1);
		}
		else{
		System.out.println("Your Monster has been killed ");*/
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
			System.out.println("6. Sorcerer ");
			

			choice = kb.nextInt();
			return choice;
		}	
			
		
	private static int chooseAttack(Scanner kb)
	{
	
		System.out.println("Please choose the type of attack:");
		System.out.println("1. Special Attack " );
		System.out.println("2. Regular attack ");
		int choice = kb.nextInt();
		kb.nextLine();
		return choice;
	}

	private static Monster chooseMonster()
	{
		Monster M1 = new Ogre("New guy"); 
		Random temp = new Random();
		int num = temp.nextInt(5);
		
		if(num ==0){
			 M1 = new Ogre("Ogre");
		}
		else if(num == 1){
			M1 = new Ogre("Skeleton");
		}
		else if(num ==2){
			M1 = new Ogre("Gremlin");
		}
		else if(num == 3) {
			M1 = new Ogre("Cyclops");
		}
		else if(num == 4) {
			M1 = new Ogre("Cerberus");
		}
		return M1;
	}

}



