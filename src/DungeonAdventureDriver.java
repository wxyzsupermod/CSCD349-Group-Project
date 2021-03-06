
import java.util.*;

public class DungeonAdventureDriver {
	public static void main(String[] args) {
		int playAgain = 1;
		do  {
		Hero H1 = null;
		int option;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a name for your character:");
		String name = kb.nextLine();
		option = displayMenu(kb);
		Monster M1 = null;
		
		
		
		if(option ==1)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createThief(name, 0, 0, 0, 0,0, "nothing", 0);
			 System.out.println("Creation of Hero successful : " + name  + " The kind Thief has "+  H1.getHealthPoints() + " in health Points!");
		}
		else if(option ==2)
		{
			 //call to the hero Factory
			H1 = HeroFactory.createSorceress(name, 0, 0, 0, 0,0, "nothing", 0);
			System.out.println("Creation of Hero successful : " + name  + " The Sorceress has "+  H1.getHealthPoints() + " in health Points!");
		}
		else if(option ==3)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createWarrior(name, 0, 0, 0, 0,0, "nothing", 0);
			 System.out.println("Creation of Hero successful : " + name  + " The Warrior has "+  H1.getHealthPoints() + " in health Points!");
		}
		else if(option ==4)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createElfWizard(name, 0, 0, 0, 0,0, "nothing", 0);
			 System.out.println("Creation of Hero successful : " + H1.getName()  + " The Elf Wizard has "+  H1.getHealthPoints() + " in health Points!");
		}
		else if(option ==5)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createGandalf(name, 0, 0, 0, 0,0, "nothing", 0);
			 System.out.println("Creation of Hero successful : " + name  + " aka Gandalf has "+  H1.getHealthPoints() + " in health Points!");
		}else if(option ==6)
		{
			 //call to the hero Factory
			 H1 = HeroFactory.createSorcerer(name, 0, 0, 0, 0,0, "nothing", 0);
			 System.out.println("Creation of Hero successful : " + name  + " The Sorcerer has "+  H1.getHealthPoints() + " in health Points!" );
		}
		M1 = chooseMonster();
		
			while(H1.isAlive() && M1.isAlive()) {
				int choice = chooseAttack(kb);
				if(choice == 1) {
					System.out.println("Details:");
					H1.specialAttack(M1);
					System.out.println("Special skill: " + H1.getName() + " uses" + H1.getSpecialSkill() + "on " + M1.getName() + "and now Monsters health is " + M1.getHealthPoints());
					System.out.println();

				}
				if(choice == 2) {
					System.out.println("Details:");
					H1.regularAttack(M1);
					System.out.println("Regular Attack: " + H1.getName() + " hits " + M1.getName() + "and now Monsters health is " + M1.getHealthPoints());
					System.out.println();

				}
			
				Random monsterChoice = new Random();
				int monsterAttack = monsterChoice.nextInt(1);
				
				if(monsterAttack == 0) {
					System.out.println("Details:");
					M1.regularAttack(H1);
					System.out.println("Regular Attack: " + M1.getName() + "hits " + H1.getName() + " and now hero's health is " + H1.getHealthPoints());
					System.out.println();

				}
				if(monsterAttack == 1) {
					System.out.println("Details:");
					M1.specialAttack(H1);
					System.out.println("Special skill: Monster heals itself and now has " + M1.getHealthPoints()+ " in health points");
					System.out.println();

				}
				if(H1.getHealthPoints() <= 0) {
					System.out.println(H1.getName() + " has been defeated! ");
					System.out.println("The winner is: " + M1.getName());
					System.out.println("Play Again ? (1 yes 0 no)");
					playAgain = kb.nextInt();
			
					break;
				}
				if(M1.getHealthPoints() <= 0) {
					System.out.println(M1.getName() + " has been defeated! ");
					System.out.println("The winner is: " + H1.getName());
					System.out.println("Play Again? (1 yes 0 no)");
					playAgain = kb.nextInt();
					
					break;
				}
			}
			
		}while(playAgain != 0);
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
		MonsterFactory mf = new MonsterFactory();
		Random temp = new Random();
		int num = temp.nextInt(5);
		Monster M1 = null;
		
		if(num ==0){
			  M1 = mf.createOgre("Ogre ", 0, 0, 0, 0,0, "5", 0);
			  System.out.println("Monster is : " + M1.getName() + "and he has " + M1.getHealthPoints() + " in healthPoints");

		}
		else if(num == 1){
			 M1 = mf.createCyclops("Cycolops ", 0, 0, 0, 0,0, "4", 0);
			 System.out.println("Monster is : " + M1.getName() + "and he has " + M1.getHealthPoints() + " in healthPoints");

		}
		else if(num ==2){
			 M1 = mf.createSkeleton("Skeleton ", 0, 0, 0, 0,0, "3", 0);
			 System.out.println("Monster is : " + M1.getName() + "and he has " + M1.getHealthPoints() + " in healthPoints");

		}
		else if(num == 3) {
			 M1 = mf.createCerberus("Cerberus ", 0, 0, 0, 0,0, "2", 0);
			 System.out.println("Monster is : " + M1.getName() + "and he has " + M1.getHealthPoints() + " in healthPoints");

		}
		else if(num == 4) {
			 M1 = mf.createGremlin("Gremlin ", 0, 0, 0, 0,0, " 1 ", 0);
			 System.out.println("Monster is : " + M1.getName() + "and he has " + M1.getHealthPoints() + " in healthPoints");

		}
		return M1;
	}

}



