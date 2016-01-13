package code_iq;

/**
 * https://codeiq.jp/challenge_answer/343092
 * @author imamura
 *
 */
public class FizzBuzzGame {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			boolean threeMultiple = false;
			boolean fiveMultiple = false;
			threeMultiple = ((i % 3) == 0);
			fiveMultiple = ((i % 5) == 0);
			if (threeMultiple && fiveMultiple) {
				System.out.println("FizzBuzz");
			} else if (threeMultiple) {
				System.out.println("Fizz");
			} else if (fiveMultiple) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
