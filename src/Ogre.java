import java.util.*;

public class Ogre implements Monster{
	private String name;
	private int health_points;
	private int attack_speed;
	private int damage_min;
	private int damage_max;
	private double hit_Chance;
	private double chanceToHeal;
	private AttackBehavior attack;
	private int dodge_rate;

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
	public Ogre(String name) {
		this.name = name;
		this.attack_speed = 4;
		this.damage_max= 45;
		this.damage_min = 25;
		this.health_points = 90;
		this.chanceToHeal = 0.8;
		this.dodge_rate = 25;
		this.hit_Chance = 0.5;
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
	public int getDamageMin() {
		return damage_min;
	}
	public void setDamageMin(int damage_min) {
		this.damage_min = damage_min;
	}
	public int getDamageMax(){
		return damage_max;
	}
	public void setDamageMax(int damage_max){
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
