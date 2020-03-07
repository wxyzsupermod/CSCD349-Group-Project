
public class HeroFactory{
	public static ElfWizard createElfWizard(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
										double hit_accuracy, String specialSkillName,int dodge_rate){
		return new ElfWizard(name,health_points,attack_speed, damage_min, damage_max, 
									hit_accuracy,specialSkillName,dodge_rate);
	}
	public static Warrior createWarrior(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
								double hit_accuracy, String specialSkillName,int dodge_rate){
		return new Warrior(name,health_points,attack_speed, damage_min, damage_max, 
									hit_accuracy,specialSkillName,dodge_rate);
	}
	public static Sorceress createSorceress(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
								double hit_accuracy, String specialSkillName,int dodge_rate){
		return new Sorceress(name,health_points,attack_speed, damage_min, damage_max, 
									hit_accuracy,specialSkillName,dodge_rate);
	}
	public static Sorcerer createSorcerer(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
								double hit_accuracy, String specialSkillName,int dodge_rate){
		return new Sorcerer(name,health_points,attack_speed, damage_min, damage_max, 
									hit_accuracy,specialSkillName,dodge_rate);
	}	
	public static Gandalf createGandalf(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
							double hit_accuracy, String specialSkillName,int dodge_rate){
		return new Gandalf(name,health_points,attack_speed, damage_min, damage_max, 
						hit_accuracy,specialSkillName,dodge_rate);
	}
	public static Thief createThief(String name,int health_points, int attack_speed, int damage_min, int damage_max, 
						double hit_accuracy, String specialSkillName,int dodge_rate){
		return new Thief(name,health_points,attack_speed, damage_min, damage_max, 
							hit_accuracy,specialSkillName,dodge_rate);
	}
	
	
}

