
public class player {
	private String handlename;
	private int lives,score,level;
	public player(String handlename){
		sethandlename(handlename);
		this.handlename=handlename;
		this.lives=3;
		this.score=0;
		this.level=1;

	}
	public int getLives(){
		return lives;
	}

		public int getScore()
		{

			return score;
		}
		public int getLevel(){

			return level;
		}
		public String getHandlename(){

			return handlename;
		}

		public int setLives(int lives)
		{
			this.lives=lives;

		}
		public int setScore(int score){

			this.score=score;
		}
		public String setHandlename(String handlename){

			this.handlename=handlename;

		}
		public void setLeve(int level){
			this.level=lives;


}


	}

public void sethandlename(String handlename){
try{
	if (handlename.length()>=4){
	this.handlename=handlename;
}
else{
	System.out.println("word is short");
}

	catch ( MismatchException e){

	System.out.println("error");
}
}

