public class codeblock{
	public static void main(String[] args){
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		if (gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);

			/* print out second score on the screen with the following
			 * score set to 10_000
			 * levelCompleted set to 8
			 * bonus set to 200
			 * but make sure the first printout above still displays as well */
		}
		if (gameOver){
		score = 10_000;
		levelCompleted = 8;
		bonus = 200;
		int secondScore = score + (levelCompleted * bonus);

		System.out.println("Your Second score was " + secondScore);
		}
	}
}
	


