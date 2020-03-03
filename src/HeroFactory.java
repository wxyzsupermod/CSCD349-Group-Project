
public class HeroFactory {
	public Hero createSorcerer(String name) {
		return new Sorcerer(name);
	}
	public Hero createWarrior(String name) {
		return new Warrior(name);
	}
	public Hero createSorceress(String name) {
		return new Sorceress(name);
	}
	public Hero createThief(String name) {
		return new Thief(name);
	}
}
