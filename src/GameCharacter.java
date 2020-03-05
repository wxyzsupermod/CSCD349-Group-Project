public interface GameCharacter{
	
	public int getHealth();
	public void setHealthPoints(int healthPoints);
	public int getAttackSpeed();
	public void setAttackSpeed(int attackSpeed);
	public int getDamageRangeMin();
	public void setDamageRangeMin(int damageRangeMin);
	public int getDamageRangeMax();
	public void setDamageRangeMax(int damageRangeMax);
	public double getHitChance();
	public void setHitChance(double hitChance);
	public boolean canHit();//generates a random number and checks if the next double is less then than the hit chance if it is returns true if it's not return false
	public boolean isAlive();//gets the health points and checks if they are below 0 returns false if < 0 returns true if > 0
	public void attack(GameCharacter opponent);
	public String getName();
	/*@Override
	public String toString()
	{
		return "Character is " + this.name + " with health points of " + this.healthPoints;
	}*/
}		


