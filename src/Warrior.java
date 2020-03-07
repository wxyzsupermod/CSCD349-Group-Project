
import java.util.Random;

public class Warrior extends Hero {
	

	public Warrior(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
			double hit_accuracy, String specialSkillName,int dodge_rate) {
		super(name,85,5,15,45,0.75,"Mace", 35);
	}
	
	public boolean isAlive() {
		return this.getHealthPoints() > 0;
	}
	@Override
	public void regularAttack(GameCharacter opponent) {
		if(opponent.isAlive()) {
		if(this.canHit() != true) {
			System.out.println(this.getName() + "has missed opponent!");
			return;
		}
		Random rand = new Random();
		int randDamage = rand.nextInt(this.getDamageRangeMax() - this.getDamageRangeMin());
		opponent.setHealthPoints(opponent.getHealthPoints() - randDamage);
	
		}
	}
	@Override
	public void specialAttack(GameCharacter opponent) {
		if(opponent.isAlive()) {
			if(this.canHit() != true) {
				System.out.println(this.getName() + "'s special attack has missed! ");
				return;
			}
			Random rand = new Random();
			int randDamage = rand.nextInt((this.getDamageRangeMax() - this.getDamageRangeMin())-25);
			opponent.setHealthPoints(opponent.getHealthPoints() - randDamage);
			
		}
	}
}
