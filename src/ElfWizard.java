import java.util.*;

public class ElfWizard extends GameCharacter{
	private int health_points = 100;
	private int attack_speed = 4;
	private int hit_accuracy = 6;
	private int damage_min = 25;
	private int damage_max = 45;
	private int dodge_rate = 7;
	private int numTurns;
	private String name;


	
	
	
	public ElfWizard(String name) {
		this.name = name + "The Great!";
  }
	public ElfWizard(String name, int health_points, int attack_speed, int damage_min, int damage_max,
			int hit_accuracy) {
		this.name = name;
		this.health_points = health_points;
		this.attack_speed = attack_speed;
		this.hit_accuracy = hit_accuracy;
		this.damage_min = damage_min;
		this.damage_max = damage_max;
	}
	
	//@Override


	public boolean canDefend() {


		 return Math.random() <= dodge_rate;


	}


	//@Override


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


