import java.util.Random;

public class Sorceress extends Hero {
	

	public Sorceress(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
			double hit_accuracy, String specialSkillName,int dodge_rate) {
			super(name,75,4,25,45,0.65,"Fire Spell", 25);
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
		if(opponent.isAlive()) {
			if(this.canHit() != true) {
				System.out.println(this.getName() + "'s special skill missed! ");
				return;
			}
			Random rand = new Random();
			int randDamage = rand.nextInt((this.getDamageRangeMax() - this.getDamageRangeMin())-15);
			opponent.setHealthPoints(opponent.getHealthPoints() - randDamage);
			
		}
	}
}
	
