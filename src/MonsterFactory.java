
public class MonsterFactory{
	
	public static Monster createMonster(String name, int health_points, int attack_speed, int damage_min, int damage_max,
			double hit_accuracy, double chanceToHeal, int minHeal, int maxHeal) {
		return new Monster(name, health_points,attack_speed,damage_min, damage_max,hit_accuracy);
	}
}

