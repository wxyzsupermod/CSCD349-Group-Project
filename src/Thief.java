import java.util.Random;

public class Thief extends Hero{
	
	

	public Thief(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
			double hit_accuracy, String specialSkillName,int dodge_rate) {
		super(name,95,6,10,45,0.35," Bow ", 44);
	}
	
	@Override
	public void regularAttack(GameCharacter opponent) {
		if(opponent.isAlive()) {
			if(this.canHit() != true) {
				System.out.println(this.getName() + " has missed the opponent ");
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
				System.out.println(this.getName() + "'s special skill missed ");
				return;
			}
			
			int specialDamage = 45;
			opponent.setHealthPoints(opponent.getHealthPoints() - specialDamage);
			
		}
	}
}
	



