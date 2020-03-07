import java.util.Random;

public class Sorcerer extends Hero {
	
	
	public Sorcerer(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
			double hit_accuracy, String specialSkillName,int dodge_rate) {
		super(name,75,5,25,55,0.45," heals himself ", 25);
	}
	@Override
	public void regularAttack(GameCharacter opponent) {
		if(opponent.isAlive()) {
			if(this.canHit() != true) {
				System.out.println(this.getName() + " has missed opponent! ");
				return;
			}
			Random rand = new Random();
			int randDamage = rand.nextInt(this.getDamageRangeMax() - this.getDamageRangeMin());
			opponent.setHealthPoints(opponent.getHealthPoints() - randDamage);
			
		}
	}
	@Override
	public void specialAttack(GameCharacter opponent) {
		if(this.getHealthPoints() < this.getHealthPoints() + 20) {
			this.setHealthPoints(this.getHealthPoints() + 3);
			System.out.println("Healed for 3 current health is " + this.getHealthPoints());
		}
		else {
			System.out.println(this.getName() + "'s special skill missed! ");

		}
	}
}