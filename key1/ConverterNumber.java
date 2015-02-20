package topic3.key1;

public class ConverterNumber implements ConvertNumber {
	
	private double number; 

	public ConverterNumber(double number) {
		this.number = number;
	}

	public String getLetters() {
		return ConvertionEnglishProcess.convertNumberToWords(number);
	}

	public void setNumber(double number) {
		this.number = number;
	}

}
