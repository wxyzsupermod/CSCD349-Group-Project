
public class Sorcerer implements Hero {
	private int health_points;
	private int attack_speed;
	private int hit_accuracy;
	private int damage_min;
	private int damage_max;
	private int dodge_rate;
	private String name;
	public Sorcerer(String n) {
		name = n + " the sorcerer";
	}
	@Override
	public boolean calculateIfHit() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void takeDamage() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void chooseAttack() {
		// TODO Auto-generated method stub
		
	}

}
