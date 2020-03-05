import java.util.Random;

public interface Hero extends GameCharacter{
	
	
	
	public void takeDamage();
	public void chooseAttack();
	
	public void regularAttack(GameCharacter opponent);
	public void specialAttack(GameCharacter opponent);
	
	
	public boolean isAlive( double healthPoints);
	}

	