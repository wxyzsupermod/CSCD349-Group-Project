
import java.util.*;

public class DungeonAdventureDriver {
	public static void main(String[] args) {
		
		Hero H1 = null; 
		Monster M1 = null;
		int option;
		Scanner kb = new Scanner(System.in);
		option = displayMenu(kb);
		if(option ==1)
		{
			//H1 = new Thief();
		}
		else if( option ==2)
		{
			//H1 = new Sorceress();
		}
		else if(option == 3)
		{
			//H1 = new Warrior();
		}
		else if(option ==4)
		{
			//H1 = new ElfWizard();
		}
		M1 = chooseMonster();
		int choice = chooseAttack(kb);
		if(choice == 1)
		{
			//H1.specialSkill(M1);
		}
		else
		{
			//H1.attackMethod(M1);
		}
		if( M1.healthPoints > 0)
		{
			M1.attackMethod(H1);
		}
		else
		{
			System.out.println("Your Monster has been killed ");
		}
	}
	 
	
	protected static int chooseAttack(Scanner kb)
	{
		
		System.out.println("Please choose the type of attack:");
		System.out.println("1. Special Attack " );
		System.out.println("2. Regular attack ");
		int choice = kb.nextInt();
		kb.nextLine();
		return choice;
	}
	
		protected static Monster chooseMonster()
		{
			Monster M1 = null;
			Random temp = new Random();
			int num = temp.nextInt(2);
			
			if(num ==0)
			{
			//	 M1 = new Ogre();
				
			}
			else if(num == 1)
			{
			//	M1 = new Skeleton();
				
			}
			else if(num ==2)
			{
			//	M1 = new Gremlin();
				
			}
			return M1;
		}
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


