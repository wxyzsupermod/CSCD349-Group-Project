	import java.util.Random;

	public class Cerberus extends Monster{
		
		public Cerberus(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
				double hit_accuracy, String specialSkillName,int dodge_rate) {
			super("Cerberus ",75,2,20,45,0.8," heals itself ", 25);
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
			if(this.getHealthPoints() < this.maxHealth) {
				this.setHealthPoints(this.getHealthPoints() + 3);
				System.out.println("Healed for 3 current health is " + this.getHealthPoints());
			}
			else {
				System.out.println(this.getName() + "'s special skill missed! ");

			}
		}
	}

