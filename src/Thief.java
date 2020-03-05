import java.util.Random;

public class Thief implements Hero{
	private String name;
	private int health_points;
	private int attack_speed;
	private int damage_min;
	private int damage_max;
	private double hit_accuracy;
	private AttackBehavior attack;
	private int dodge_rate;
	
	
	
	public Thief(String name) {
		this.name = name;
		this.attack_speed = 9;
		this.damage_max= 65;
		this.damage_min = 10;
		this.health_points = 95;
		this.hit_accuracy = 0.35;
		this.dodge_rate = 44;
  }
	public void attackMethod(AttackBehavior attack) {}
	public void takeDamage() {}
	public void chooseAttack() {}
	public void attack(GameCharacter opponent) {};
	public boolean isAlive() {
		return true;
	}//gets the health points and checks if they are below 0 returns false if < 0 returns true if > 0
	public void regularAttack(GameCharacter opponent) {}
	public void specialAttack(GameCharacter opponent) {}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getHealthPoints() 
	{
		return health_points;
	}

	public void setHealthPoints(int health_points) 
	{
		this.health_points = health_points;
	}

	public int getAttackSpeed()
	{
		return attack_speed;
	}

	public void setAttackSpeed(int attackSpeed) 
	{
		this.attack_speed = attackSpeed;
	}

	public int getDamageRangeMin() 
	{
		return damage_min;
	}

	public void setDamageRangeMin(int damage_min) 
	{
		this.damage_min = damage_min;
	}

	public int getDamageRangeMax()
	{
		return damage_max;
	}

	public void setDamageRangeMax(int damage_max) 
	{
		this.damage_max = damage_max;
	}

	public double getHitChance() 
	{
		return hit_accuracy;
	}

	public void setHitChance(double hit_accuracy)
	{
		this.hit_accuracy = hit_accuracy;
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
		
		if (temp < hit_accuracy)
		{
			return true;
		}
		else 
		{
			return false;
		}
	
	}
	
	public void attackMethod(GameCharacter opponent) {
		
	}
	public void specialSkill(GameCharacter opponent) {
		
	}
	public boolean isAlive( double health_points) {
			if(health_points <= 0)
			{
				return true;
			}
			else 
			{
				return false;
				
			}
		}
	}



