

public abstract class Hero extends GameCharacter implements Attack{
		
		public Hero(String n,int health_points, int attack_speed, int damage_min, int damage_max, 
						double hit_accuracy, String specialSkillName,int dodge_rate) {
			super(n, health_points, attack_speed, damage_min, damage_max, hit_accuracy, specialSkillName, dodge_rate);
		}
		
		
		
	}

	