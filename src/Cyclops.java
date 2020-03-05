import java.util.Random;

public class Cyclops implements Monster {
	private String name;
	private int health_points;
	private int attack_speed;
	private int damage_min;
	private int damage_max;
	private double hit_Chance;
	private double chanceToHeal;
	private AttackBehavior attack;
	private int dodge_rate;
	public boolean isAlive() {
		return true;
		//gets the health points and checks if they are below 0 returns false if < 0 returns true if > 0
	}
	public void attack(GameCharacter opponent) {}
	public void takeDamage() {}
	public void attackMethod(AttackBehavior attack) {
		//based on what happens in the attack chosen
		//regular attack will use the given values for 
		//the damage max, min and the hit_chance
		//specialattack will allow the monster to heal itself
		//based on the randomly generated chance and it will increase
		//the values for the damage max, min and hit_chance values in the fight
		
	} 
	public AttackBehavior chooseAttack() {
	
	AttackBehavior specialAttack= null;
	return specialAttack;
	//special skill is that it can heal itself
	//otherwise regular attack
	//randomly assigned
	
}
	public Cyclops(String name) {
		this.name = name;
		this.attack_speed = 5;
		this.damage_max= 35;
		this.damage_min = 15;
		this.health_points = 70;
		this.chanceToHeal = 0.5;
		this.dodge_rate = 15;
		this.hit_Chance = 0.2;
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
	public void setDamageRangeMax(int damage_max){
		this.damage_max = damage_max;
	}
	public double getHealChance() {
		return chanceToHeal;
	}
	public void setHealChance(double chanceToHeal) {
		this.chanceToHeal = chanceToHeal;
	}
	public void setHitChance(double hit_Chance){
		this.hit_Chance = hit_Chance;
	}
	public double getHitChance() {
		return hit_Chance;
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
		
	}
	public void specialAttack(GameCharacter opponent) {
		
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

