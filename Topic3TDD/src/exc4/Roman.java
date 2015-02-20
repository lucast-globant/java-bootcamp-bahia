package exc4;

public class Roman {

	private String number;

	public Roman(String string) {
		number = string;
	}

	public int toInt() {
		return RomanDigit.valueOf(number).number;
	}

	enum RomanDigit {

		I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);

		private final int number;

		RomanDigit(int number) {
			this.number = number;
		}
	}

}
