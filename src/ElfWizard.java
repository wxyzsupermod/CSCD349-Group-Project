import java.util.Random;

public class ElfWizard extends Hero{
	
	
	
	
	public ElfWizard(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
			double hit_accuracy, String specialSkillName,int dodge_rate) {
		super(name,95,6,10,35,0.35," Fire Ball ", 44);
	}
	public void regularAttack(GameCharacter opponent) {
		if(opponent.isAlive()) {
			if(this.canHit() != true) {
				System.out.println(this.getName() + " has missed the opponent!");
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
	