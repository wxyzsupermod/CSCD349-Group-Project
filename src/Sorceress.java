import java.util.Random;

public class Sorceress implements Hero {
	private String name;
	private int health_points;
	private int attack_speed;
	private int damage_min;
	private int damage_max;
	private double hit_accuracy;
	private int dodge_rate;
	private String SpecialSkillName = "Fire Spell";

	
	
	
	public Sorceress(String name) {
		this.name = name;
		this.attack_speed = 6;
		this.damage_max= 45;
		this.damage_min = 25;
		this.health_points = 75;
		this.hit_accuracy = 0.65;
		this.dodge_rate = 25;
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
		if(opponent.isAlive()) {
			if(this.canHit() != true) {
				System.out.println(this.getName() + " missed ");
				return;
			}
			
			int specialDamage = 50;
			opponent.setHealthPoints(opponent.getHealthPoints() - specialDamage);
			System.out.println(opponent.getName() + " took " + specialDamage + " Damage");
		}
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealthPoints() {
		return health_points;
	}

	public void setHealthPoints(int health_points) {
		this.health_points = health_points;
	}

	public int getAttackSpeed(){
		return attack_speed;
	}

	public void setAttackSpeed(int attackSpeed) {
		this.attack_speed = attackSpeed;
	}

	public int getDamageRangeMin() {
		return damage_min;
	}

	public void setDamageRangeMin(int damage_min) {
		this.damage_min = damage_min;
	}

	public int getDamageRangeMax(){
		return damage_max;
	}

	public void setDamageRangeMax(int damage_max) {
		this.damage_max = damage_max;
	}

	public double getHitChance() {
		return hit_accuracy;
	}

	public void setHitChance(double hit_accuracy){
		this.hit_accuracy = hit_accuracy;
	}
	public String getSpecialSkill() {
		return this.SpecialSkillName;
	}

	public boolean canDefend() {
		return Math.random() <= dodge_rate;
	}
	public void printNumTurns(GameCharacter Opponent) {

		int numTurns = attack_speed/Opponent.getAttackSpeed();
		System.out.println("The number of turns is" + numTurns);
	}
	
	public boolean canHit()
	{
		Random r = new Random();
		double temp = r.nextDouble();
		
		if (temp < hit_accuracy){
			return true;
		}
		else {
			return false;
		}
	
	}
	
	public boolean isAlive() {
		return this.health_points > 0;
	}
	public boolean isAlive( double health_points) {
			if(health_points <= 0){
				return true;
			}
			else {
				return false;
			}
		}

	}
