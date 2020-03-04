import java.util.Random;

public class Hero extends GameCharacter{
	
	public Hero(String name, int healthPoints, int attackSpeed, int damageRangeMin, int damageRangeMax,
				double hitChance) {
		super("melody", 25, 10, 5,4,2);
		
	}
	
	
	public void takeDamage() {}
	public void chooseAttack() {}
	
	public void attackMethod(GameCharacter opponent) {}
	public void specialSkill(GameCharacter opponent) {}
	
	
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

	