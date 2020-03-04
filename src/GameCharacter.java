import java.util.Random;

	public abstract class GameCharacter 
	{
		protected String name;
		protected int healthPoints;//how much damage a character can take before it expires
		protected int attackSpeed;//1 is slowest 10 is fastest
		protected int damageRangeMin;
		protected int damageRangeMax;
		protected double chanceToHit;//chance of hitting opponent when attacking
		
		
		public GameCharacter() 
		{
		
		}

		public GameCharacter(String name, int healthPoints, int attackSpeed, int damageRangeMin, int damageRangeMax,
				double hitChance)
		{
			this.name = name;
			this.healthPoints = healthPoints;
			this.attackSpeed = attackSpeed;
			this.damageRangeMin = damageRangeMin;
			this.damageRangeMax = damageRangeMax;
			this.hitChance = hitChance;
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

		public int getDamageRangeMin() 
		{
			return damageRangeMin;
		}

		public void setDamageRangeMin(int damageRangeMin) 
		{
			this.damageRangeMin = damageRangeMin;
		}

		public int getDamageRangeMax()
		{
			return damageRangeMax;
		}

		public void setDamageRangeMax(int damageRangeMax) 
		{
			this.damageRangeMax = damageRangeMax;
		}

		public double getHitChance() 
		{
			return hitChance;
		}

		public void setHitChance(double hitChance)
		{
			this.hitChance = hitChance;
		}
		public abstract void specialSkill(GameCharacter opponent);
		
		protected boolean canHit()
		{
			Random r = new Random();
			double temp = r.nextDouble();
			
			if (temp < hitChance)
			{
				return true;
			}
			else 
			{
				return false;
			}
		
		}
		protected boolean isAlive(int healthPoints)
		{
			if(healthPoints <= 0)
			{
				return true;
			}
			else 
			{
				return false;
				
			}
		}
		
		public abstract void attackMethod(GameCharacter opponent);
		@Override
		public String toString()
		{
			return "Character is " + this.name + " with health points of " + this.healthPoints;
		}
		
	}



