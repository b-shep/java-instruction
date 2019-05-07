
public class Dice {
	private int die1;
	private int die2;
	private int sum;
	
	public Dice() {
		die1 = 0;
		die2 = 0;
		sum = 0;
	}
	public Dice(int die1, int die2) {
		this.die1 = die1;
		this.die2 = die2;
		this.sum = die1 + die2;
	}
	
	public int getDice1() {
		return die1;
	}
	
	public int getDice2() {
		return die2;
	}
	
	public int getSum() {
		sum =  die1 + die2;
		return sum;
	}
	
	public void roll() {
		Die dice1 = new Die();
		Die dice2 = new Die();
		dice1.roll();
		dice2.roll();
		this.die1 = dice1.getValue();
		this.die2 = dice2.getValue();
		sum = getSum();
	}
	
	public void printRoll() {
		System.out.println("Die 1: " + die1);
		System.out.println("Die 2: " + die2);
		System.out.println("Total: " + sum);
		if(die1 == 1 && die2 == 1 ) {
			System.out.println("Snake Eyes!");
		} else if (die1 == 6 && die2 == 6) {
			System.out.println("Box Cars!");
		} else if (sum == 7) {
			System.out.println("Craps!");
		}
	}
}
