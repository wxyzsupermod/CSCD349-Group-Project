import java.util.Random;

public class Sorcerer implements Hero {
	private int health_points = 50;
	private int attack_speed = 3;
	private double hit_accuracy = 3;
	private int damage_min = 2;
	private int damage_max = 20;
	private int dodge_rate = 2;
	private int numTurns;
	private String SpecialSkillName = " Heal ";
	private String name;
	
	public Sorcerer(String n) {
		this.name = n;
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
	public void regularAttack(GameCharacter opponent) {
		if(opponent.isAlive()) {
			if(this.canHit() != true) {
				System.out.println(this.getName() + " missed ");
				return;
			}
			Random rand = new Random();
			int randDamage = rand.nextInt(this.getDamageRangeMax() - this.getDamageRangeMin());
			opponent.setHealthPoints(opponent.getHealthPoints() - randDamage);
			System.out.println(opponent.getName() + " took " + randDamage + " Damage");
		}
	}
	@Override
	public void specialAttack(GameCharacter opponent) {
		if(this.getHealthPoints() < this.getHealthPoints() + 20) {
			this.setHealthPoints(this.getHealthPoints() + 3);
			System.out.println("Healed for 3 current health is " + this.getHealthPoints());
		}
		else {
			System.out.println("Cannot Heal more than 20 over max health current health is " + this.getHealthPoints());
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
		return "Character is " + this.getName() + " with health points of " + this.getHealthPoints();
	}
	public String getSpecialSkill() {
		return this.SpecialSkillName;
	}
	@Override
	public int getHealthPoints() {
		return health_points;
	}
	public boolean canDefend() {
		return Math.random() <= dodge_rate;
	}
	public void printNumTurns(GameCharacter Opponent) {
		numTurns = attack_speed/Opponent.getAttackSpeed();
		System.out.println("The number of turns is" + this.numTurns);
	}
	
	
	

}
