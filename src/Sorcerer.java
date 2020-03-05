import java.util.Random;

public class Sorcerer implements Hero, GameCharacter {
	private int health_points = 50;
	private int maxHealth = health_points;
	private int attack_speed = 3;
	private double hit_accuracy = 3;
	private int damage_min = 2;
	private int damage_max = 20;
	private int dodge_rate = 2;
	private int numTurns;
	private String SpecialSkillName = "heal";
	private String name;
	
	public Sorcerer(String n) {
		this.name = n + " the sorcerer";
	}
	@Override
	public int getHealth() {
		return health_points;
	}
	@Override
	public void setHealthPoints(int healthPoints) {
		this.health_points = healthPoints;
	}
	@Override
	public int getAttackSpeed() {
		return this.attack_speed;
	}
	@Override
	public void setAttackSpeed(int attackSpeed) {
		this.attack_speed = attackSpeed;
		
	}
	@Override
	public int getDamageRangeMin() {
		return this.damage_min;
	}
	@Override
	public void setDamageRangeMin(int damageRangeMin) {
		this.damage_min = damageRangeMin;
		
	}
	@Override
	public int getDamageRangeMax() {
		return this.damage_max;
	}
	@Override
	public void setDamageRangeMax(int damageRangeMax) {
		this.damage_max = damageRangeMax;
		
	}
	@Override
	public double getHitChance() {
		return this.hit_accuracy;
	}
	@Override
	public void setHitChance(double hitChance) {
		this.hit_accuracy = hitChance;
		
	}
	@Override
	public boolean canHit() {
		double rand = Math.random();
		if(rand < this.getHitChance()) {
			return true;
		}
		return false;
	}
	@Override
	public boolean isAlive() {
		return this.health_points > 0;
	}
	@Override
	public void attack(GameCharacter opponent) {
		if(opponent.isAlive()) {
			if(this.canHit() != true) {
				System.out.println(this.getName() + " missed ");
				return;
			}
			Random rand = new Random();
			int randDamage = rand.nextInt(this.getDamageRangeMax() - this.getDamageRangeMin());
			opponent.setHealthPoints(opponent.getHealth() - randDamage);
			System.out.println(opponent.getName() + " took " + randDamage + " Damage");
		}
	}
	@Override
	public void specialSkill(GameCharacter opponent) {
		if(this.getHealth() < this.maxHealth + 20) {
			this.setHealthPoints(this.getHealth() + 3);
			System.out.println("Healed for 3 current health is " + this.getHealth());
		}
		else {
			System.out.println("Cannot Heal more than 20 over max health current health is " + this.getHealth());
		}
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "Character is " + this.getName() + " with health points of " + this.getHealth();
	}
	@Override
	public String getSpecialSkill() {
		return this.SpecialSkillName;
	}
	
	

}
