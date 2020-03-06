import java.util.*;

public class Gremlin implements Monster{
	private String name;
	private int health_points;
	private int maxHealth = health_points;
	private int attack_speed;
	private int damage_min;
	private int damage_max;
	private double hit_Chance;
	private double chanceToHeal;
	private String SpecialSkillName = "Heal";
	private int dodge_rate;
	
	public Gremlin(String name) {
		this.name = name;
		this.attack_speed = 4;
		this.damage_max= 45;
		this.damage_min = 25;
		this.health_points = 90;
		this.chanceToHeal = 0.8;
		this.dodge_rate = 25;
		this.hit_Chance = 0.5;
	}
	public boolean isAlive() {
		return this.getHealthPoints() > 0;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealthPoints() {
		return this.health_points;
	}
	public void setHealthPoints(int health_points) {
		this.health_points = health_points;
	}
	public int getAttackSpeed(){
		return this.attack_speed;
	}
	public void setAttackSpeed(int attackSpeed) {
		this.attack_speed = attackSpeed;
	}
	public int getDamageRangeMin() {
		return this.damage_min;
	}
	public void setDamageRangeMin(int damage_min) {
		this.damage_min = damage_min;
	}
	public int getDamageRangeMax(){
		return this.damage_max;
	}
	public void setDamageRangeMax(int damage_max){
		this.damage_max = damage_max;
	}
	public double getHealChance() {
		return this.chanceToHeal;
	}
	public void setHealChance(double chanceToHeal) {
		this.chanceToHeal = chanceToHeal;
	}
	public void setHitChance(double hit_Chance){
		this.hit_Chance = hit_Chance;
	}
	public double getHitChance() {
		return this.hit_Chance;
	}
	public boolean canHeal() {
		return Math.random() <= chanceToHeal;
	}
	public boolean canHit()
	{
		Random r = new Random();
		double temp = r.nextDouble();
		
		if (temp < hit_Chance){
			return true;
		}
		else {
			return false;
		}
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
		if(this.getHealthPoints() < this.maxHealth) {
			this.setHealthPoints(this.getHealthPoints() + 3);
			System.out.println("Healed for 3 current health is " + this.getHealthPoints());
		}
		else {
			System.out.println("Monster healed for " + this.getHealthPoints());
		}
	}
	public boolean isAlive( double health_points) {
			if(health_points <= 0){
				return true;
			}
			else {
				return false;
			}
		}
	public String getSpecialSkill() {
		return this.SpecialSkillName;
	}
	}

