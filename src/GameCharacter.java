

	public interface GameCharacter extends AttackBehavior
	{
		
		public abstract void regularAttack(GameCharacter opponent);
		public abstract void specialAttack(GameCharacter opponent);
		public boolean isAlive(double healthPoints);
		public int getAttackSpeed();
		public String getName();

	
	}



