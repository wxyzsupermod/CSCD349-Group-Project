import java.util.*;

public class Cyclops extends Monster{
	
	public Cyclops(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
			double hit_accuracy, String specialSkillName,int dodge_rate) {
		super("Cyclops ",90,1,25,35,0.8," heals itself ", 25);
	}
	
	@Override
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
	@Override
	public void specialAttack(GameCharacter opponent) {
		if(this.getHealthPoints() < this.getDamageRangeMax()) {
			this.setHealthPoints(this.getHealthPoints() + 3);
			System.out.println("Healed for 3 current health is " + this.getHealthPoints());
		}
		else {
			System.out.println(this.getName() + "'s special skill missed! ");

		}
	}
}