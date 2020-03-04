import java.util.*;

	public abstract class GameCharacter implements AttackBehavior
	{
		protected String name;
		protected int health_points;
		protected int attack_speed;
		protected int damage_min;
		protected int damage_max;
		protected double hit_accuracy;
		AttackBehavior attack;
		
		public GameCharacter() 
		{
		
		}

		public GameCharacter(String name, int health_points, int attack_speed, int damage_min, int damage_max,
				double hit_accuracy)
		{
			this.name = name;
			this.health_points = health_points;
			this.attack_speed = attack_speed;
			this.damage_min = damage_min;
			this.damage_max = damage_max;
			this.hit_accuracy = hit_accuracy;
		}
		public abstract void attackMethod(GameCharacter opponent);
		public abstract void specialSkill(GameCharacter opponent);
		public abstract boolean isAlive(double healthPoints);
		
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

		public int getDamageMin() 
		{
			return damage_min;
		}

		public void setDamageMin(int damage_min) 
		{
			this.damage_min = damage_min;
		}

		public int getDamageMax()
		{
			return damage_max;
		}

		public void setDamageMax(int damage_max) 
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
		
		@Override
		public String toString()
		{
			return "Character is " + this.name + " with health points of " + this.health_points;
		}
		
	}



