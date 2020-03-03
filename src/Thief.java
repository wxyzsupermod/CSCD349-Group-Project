
public class Thief implements Hero {
	private int health_points = 50;
	private int attack_speed = 3;
	private int hit_accuracy = 3;
	private int damage_min = 2;
	private int damage_max = 4;
	private int dodge_rate = 2;
	private int numTurns;
	private String name;
	public Thief(String n) {
		this.name = n + " the sorcerer";
	}
	@Override
	public boolean canDefend() {
		 return Math.random() <= dodge_rate;
	}
	@Override
	public void printNumTurns(GameCharacter Opponent) {
		numTurns = attack_speed/opponent.getAttackSpeed();
		System.out.println("The number of turns is" + numTurns);
	}
	

}
