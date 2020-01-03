import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		Random randnumber = new Random();
		int x = randnumber.nextInt(6) + 1;
		// TODO Auto-generated method stub
		System.out.println("You rolled a: " + x);
	}

}
