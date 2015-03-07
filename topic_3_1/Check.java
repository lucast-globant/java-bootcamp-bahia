package topic_3_1;

public class Check {

	private double amount;
	private static float max = 1000000;
	private static final String[] ones = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private static final String[] tens ={"","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	public Check(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return 0;
	}

	public String toText() {
		if (amount < 0)
			return "The amount has to be positive";
		if (amount >= max)
			return "The amount has to be minor to 1000000";
		String num = Double.toString(amount);
		String[] parts = num.split("\\.",2);
		String ent_part = parts[0];
		String dec_part = parts[1];
		String result = convertNumToText (ent_part)+cents(dec_part)+" dollars";
		return result;
	}

	private String convertNumToText (String ent_part) {
		int ent = Integer.parseInt(ent_part);
		String result = null;
		if(ent>999 && ent<max) {
			String ent_part1 = ent_part.substring(0, ent_part.length()-3);
			String ent_part2 = ent_part.substring(ent_part.length()-3, ent_part.length());
			result = convertNumToText (ent_part1)+" thousand "+convertNumToText (ent_part2);
		}
		else {
			if(ent<1000 && ent>99) {
				int index = Integer.parseInt(""+ent_part.charAt(0));
				String rest_ent_part = ent_part.substring(1);
				int ent_p = Integer.parseInt(rest_ent_part);
				if(ent_p>0)
					result = ones[index]+" hundred "+convertNumToText(rest_ent_part);
				else
					result = ones[index]+" hundred"+convertNumToText(rest_ent_part);
			}
			else {
				if(ent<100)
					if(ent<20)
						result = lessThan20(ent_part);
					else {
						int index = Integer.parseInt(""+ent_part.charAt(0));
						if(index!=0)
							index --;
						String rest_ent_part = ent_part.substring(1);
						int ent_p = Integer.parseInt(rest_ent_part);
						if(ent_p>0)
							result = tens[index]+" "+convertNumToText(ent_part.substring(1)); 
						else
							result = tens[index]+convertNumToText(ent_part.substring(1));
					}
			}
		}
		return result;
	}

	private String lessThan20 (String ent_part) {
		String result;
		int index = Integer.parseInt(ent_part);
		result = ones[index];
		return result;
	}

	private String cents (String dec_part) {
		int dec = Integer.parseInt(dec_part);
		if (dec==0) 
			return "";
		else
			return " and "+dec_part+"/100"; 
	}
}