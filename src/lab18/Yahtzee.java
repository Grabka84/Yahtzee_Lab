package lab18;

public class Yahtzee {
	
	public static int yahtzee(int[] roll, String cat) {
		
		switch (cat){
		case "Ones":
			return getCount(roll, 1);
		case "Twos":
			return getCount(roll, 2);
		case "Threes":
			return getCount(roll, 3);
		case "Fours":
			return getCount(roll, 4);
		case "Fives":
			return getCount(roll, 5);
		case "Sixes":
			return getCount(roll, 6);
		default:
			return 0;
		}
		
	}
	
	public static int getCount(int[] roll, int cat) {
		int score = 0;
		for (int i = 0; i < roll.length; i++) {
			if(roll[i] == cat) {
				score += cat;
			}
		}
		return score;
	}
	
	
}
