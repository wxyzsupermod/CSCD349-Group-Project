import java.util.Random;

public abstract class GameCharacter
	{
	private String name;
	private int health_points;
	private int attack_speed;
	private int damage_min;
	private int damage_max;
	private double hit_accuracy;
	private String specialSkillName;
	private int dodge_rate;
	private int numTurns;
	public GameCharacter(String n,int health_points, int attack_speed, int damage_min, int damage_max, 
						double hit_accuracy, String specialSkillName,int dodge_rate) {
		this.name = n;
		this.attack_speed = attack_speed;
		this.damage_max= damage_max;
		this.damage_min = damage_min;
		this.health_points = health_points;
		this.hit_accuracy = hit_accuracy;
		this.dodge_rate = dodge_rate;
		this.specialSkillName = specialSkillName;
	}
	public void setHealthPoints(int healthPoints) {
		this.health_points = healthPoints;
	}
	public int getAttackSpeed() {
		return this.attack_speed;
	}
	public void setAttackSpeed(int attackSpeed) {
		this.attack_speed = attackSpeed;
		
	}
	public int getDamageRangeMin() {
		return this.damage_min;
	}
	public void setDamageRangeMin(int damageRangeMin) {
		this.damage_min = damageRangeMin;
		
	}
	public int getDamageRangeMax() {
		return this.damage_max;
	}
	public void setDamageRangeMax(int damageRangeMax) {
		this.damage_max = damageRangeMax;
		
	}
	public double getHitChance() {
		return this.hit_accuracy;
	}
	public void setHitChance(double hitChance) {
		this.hit_accuracy = hitChance;
		
	}
	public boolean canHit() {
		double rand = Math.random();
		if(rand < this.getHitChance()) {
			return true;
		}
		return false;
	}
	public boolean isAlive() {
		return this.health_points > 0;
	}
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

	public void specialAttack(GameCharacter opponent) {
		if(this.getHealthPoints() < this.getHealthPoints() + 20) {
			this.setHealthPoints(this.getHealthPoints() + 3);
			System.out.println("Healed for 3 current health is " + this.getHealthPoints());
		}
		else {
			System.out.println("Cannot Heal more than 20 over max health current health is " + this.getHealthPoints());
		}
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "Character is " + this.getName() + " with health points of " + this.getHealthPoints();
	}
	public String getSpecialSkill() {
		return this.specialSkillName;
	}
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
	
	



