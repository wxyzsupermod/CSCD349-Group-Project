import java.util.*;

public class ElfWizard extends GameCharacter{
	private double hitPoints;
	private double attackSpeed;
	private double chanceToHit;
	private double damageMin;
	private double damageMax;
	
	
	public String name() {
		System.out.println("Please enter a name for your ElfWizard");
		Scanner kb = new Scanner(System.in);
		String name = kb.nextLine();
		return name;
			
	}
	public ElfWizard(String name, int healthPoints, int attackSpeed, int damageMin, int damageMax,
			double chanceToHit) {
		this.name = name();
		this.healthPoints = healthPoints;
		this.attackSpeed = attackSpeed;
		this.chanceToHit = chanceToHit;
		this.damageMin = damageMin;
		this.damageMax = damageMax;
	}
	
	
	protected String getName()
	{
		return name;
	}

	protected void setName(String name) 
	{
		this.name = name;
	}

	protected  int getHealthPoints() 
	{
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) 
	{
		this.healthPoints = healthPoints;
	}

	public int getAttackSpeed()
	{
		return attackSpeed;
	}

	public void setAttackSpeed(int attackSpeed) 
	{
		this.attackSpeed = attackSpeed;
	}

	public int getDamageMin() 
	{
		return damageMin;
	}

	public void setDamageMin(int damageMin) 
	{
		this.damageMin = damageMin;
	}

	public int getDamageMax()
	{
		return damageMax;
	}

	public void setDamageMax(int damageMax) 
	{
		this.damageMax = damageMax;
	}

	public double getHitChance() 
	{
		return chanceToHit;
	}

	public void setHitChance(double hitChance)
	{
		this.chanceToHit = hitChance;
	}
	
	public boolean canHit()
	{
		Random r = new Random();
		double temp = r.nextDouble();
		
		if (temp < chanceToHit)
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
	public boolean isAlive( double healthPoints) {
			if(healthPoints <= 0)
			{
				return true;
			}
			else 
			{
				return false;
				
			}
		}
	}

}
