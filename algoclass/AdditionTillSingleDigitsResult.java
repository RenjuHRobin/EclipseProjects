package algoclass;

public class AdditionTillSingleDigitsResult {

	public int addSingleDigits(int value) {
		int temp = value;
		if (temp / 10 == 0) {
			return value;
		}

		return addSingleDigits((value / 10) + (value % 10));
	}
}
