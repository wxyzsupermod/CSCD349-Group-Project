import java.util.Random;

public class Gandalf extends Hero{
	
	

	public Gandalf(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
			double hit_accuracy, String specialSkillName,int dodge_rate) {
		super(name,100,7,20,55,0.55," Ice Spell ", 65);
	}	
	
	
	public boolean isAlive() {
		return this.getHealthPoints() > 0;
	}
	public void regularAttack(GameCharacter opponent) {
		if(opponent.isAlive()) {
			if(this.canHit() != true) {
				System.out.println(this.getName() + " has missed the opponent! ");
				return;
			}
			Random rand = new Random();
			int randDamage = rand.nextInt(this.getDamageRangeMax() - this.getDamageRangeMin());
			opponent.setHealthPoints(opponent.getHealthPoints() - randDamage);
			
			}
	}
	public void specialAttack(GameCharacter opponent) {
		if(opponent.isAlive()) {
			if(this.canHit() != true) {
				System.out.println(this.getName() + "'s special skill missed ");
				return;
			}
			Random rand = new Random();
			int randDamage = rand.nextInt((this.getDamageRangeMax() - this.getDamageRangeMin())-15);
			opponent.setHealthPoints(opponent.getHealthPoints() - randDamage);
			
		}
	}
	
}