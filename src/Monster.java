
		public interface Monster extends GameCharacter
		{
			
		
		
		public void takeDamage() ;
		public AttackBehavior chooseAttack();
		public void regularAttack(GameCharacter opponent);
		public void specialAttack(GameCharacter opponent);
		
		
		public boolean isAlive( double healthPoints) ;
				
		}


