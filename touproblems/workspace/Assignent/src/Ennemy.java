
public class Ennemy {
		int hitpoint,lives;

		 Ennemy(int points,int life){

			this.hitpoint=points;
			this.lives=life;

		}

		public int TakeDamage(int damage)
	{
			int remainHits;
			remainHits= hitpoint-damage;
	        hitpoint=remainHits;


			return hitpoint;


	}







}
