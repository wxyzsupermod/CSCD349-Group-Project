import java.util.Scanner;

public class testMain {
	public static void main(String args[]) {
		HeroFactory heroCreator = new HeroFactory();
		GameCharacter h1 = (GameCharacter)heroCreator.createSorcerer("jimbo");
		GameCharacter h2 = (GameCharacter) heroCreator.createSorcerer("evil Jimbo");
		h1.attack(h2);
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		((Hero) h2).specialSkill(h1);
	}	
}
