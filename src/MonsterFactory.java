
public class MonsterFactory{
	
	public Ogre createOgre(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
							double hit_accuracy, String specialSkillName,int dodge_rate){
		return new Ogre(name,health_points,attack_speed, damage_min, damage_max, 
						hit_accuracy,specialSkillName,dodge_rate);
	}
	public Cyclops createCyclops(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
								double hit_accuracy, String specialSkillName,int dodge_rate){
		return new Cyclops(name,health_points,attack_speed, damage_min, damage_max, 
							hit_accuracy,specialSkillName,dodge_rate);
	}
	public Skeleton createSkeleton(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
								double hit_accuracy, String specialSkillName,int dodge_rate){
		return new Skeleton(name,health_points,attack_speed, damage_min, damage_max, 
							hit_accuracy,specialSkillName,dodge_rate);
	}
	public Cerberus createCerberus(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
								double hit_accuracy, String specialSkillName,int dodge_rate){
		return new Cerberus(name,health_points,attack_speed, damage_min, damage_max, 
							hit_accuracy,specialSkillName,dodge_rate);
	}
	public Gremlin createGremlin(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
								double hit_accuracy, String specialSkillName,int dodge_rate){
		return new Gremlin(name,health_points,attack_speed, damage_min, damage_max, 
							hit_accuracy,specialSkillName,dodge_rate);
	}
}

