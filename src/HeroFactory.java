
public class HeroFactory{
	

	public static Hero createElfWizard(String name){
		return new ElfWizard(name);
	}
	public static Hero createWarrior(String name){
		return new Warrior(name);
	}
	public static Hero createGandalf(String name){
		return new Gandalf(name);
	}
	public static Hero createSorcerer(String name){
		return new Sorcerer(name);
	}
	public static Hero createSorceress(String name){
		return new Sorceress(name);
	}
	public static Hero createThief(String name){
		return new Thief(name);
	}
	
}