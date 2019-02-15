package lab18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//requirement is get 12 working tests

class YahtzeeTester {

	@Test
	void onesCategory1() {
	int roll[] = {1,2,3,4,5};
	String cat = "Ones";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(1,score);
	}
	
	@Test
	void twosCategory1() {
	int roll[] = {1,2,3,4,5};
	String cat = "Twos";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(2,score);
	}
	
	@Test
	void threesCategory1() {
	int roll[] = {1,2,3,4,5};
	String cat = "Threes";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(3,score);
	}
	
	@Test
	void foursCategory1() {
	int roll[] = {1,2,3,4,5};
	String cat = "Fours";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(4,score);
	}
	
	@Test
	void fivesCategory1() {
	int roll[] = {1,2,3,4,5};
	String cat = "Fives";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(5,score);
	}
	
	@Test
	void sixesCategory1() {
	int roll[] = {1,2,3,4,5};
	String cat = "Sixes";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(0,score);
	}
	
	@Test
	void onesCategory2() {
	int roll[] = {1,2,1,3,5};
	String cat = "Ones";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(2,score);
	}
	
	@Test
	void twosCategory2() {
	int roll[] = {1,2,3,2,5};
	String cat = "Twos";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(4,score);
	}
	
	@Test
	void threesCategory2() {
	int roll[] = {1,2,3,4,3};
	String cat = "Threes";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(6,score);
	}
	
	@Test
	void foursCategory2() {
	int roll[] = {4,2,3,4,5};
	String cat = "Fours";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(8,score);
	}
	
	@Test
	void fivesCategory2() {
	int roll[] = {1,2,5,4,5};
	String cat = "Fives";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(10,score);
	}
	
	@Test
	void sixesCategory2() {
	int roll[] = {1,2,6,4,6};
	String cat = "Sixes";
	int score = Yahtzee.yahtzee(roll,cat);
	
	assertEquals(12,score);
	}
}