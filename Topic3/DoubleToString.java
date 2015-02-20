import java.text.DecimalFormat;


public class DoubleToString {

	static String[] stringNumber = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX",
        "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE",
        "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
        "EIGHTEEN", "NINETEEN" };
	static String[] decades = { "", "", "TWENTY ", "THIRTY ", "FOURTY ", "FIFTY ",
        "SIXTY ", "SEVENTY ", "EIGHTY ", "NINETY " };
	
	static String[] hundreds = { "", "ONE HUNDRED ", "TWO HUNDRED ", "THREE HUNDRED ", "FOUR HUNDRED ", "FIVE HUNDRED ",
        "SIX HUNDRED ", "SEVEN HUNDRED ", "EIGHT HUNDRED ", "NINE HUNDRED " };
	
	static String[] thousands = { "", "ONE THOUSAND ", "TWO THOUSAND ", "THREE THOUSAND ", "FOUR THOUSAND ", "FIVE THOUSAND ",
        "SIX THOUSAND ", "SEVEN THOUSAND ", "EIGHT THOUSAND ", "NINE THOUSAND " };
	
	public String getText(double amount) {
		
		String str = "";
		int intAmount;
		String stringAmount;
		int intDecades;
		int intHundreds;
		DecimalFormat df;
		
		intAmount=(int)amount;
		df = new DecimalFormat("#.00");
		
		stringAmount=df.format(amount);
		
		
		if (amount<10){
			str += stringNumber[ intAmount ];
			str+=" AND "+stringAmount.substring(2, 4)+"/100 DOLLARS";
		}
		else
			if (amount<20){
				str += stringNumber[ intAmount ];
				str+=" AND "+stringAmount.substring(3, 5)+"/100 DOLLARS";
			}else
				if (amount<100){
					str += decades[ intAmount/10 ];
					str += stringNumber[intAmount % 10];
					str+=" AND "+stringAmount.substring(3, 5)+"/100 DOLLARS";
				}else
					if (amount<1000){
						str += hundreds[ intAmount/100 ];
						
						intDecades=(intAmount % 100);
						str += decades[intDecades/10];
						str += stringNumber[ intDecades%10 ];						
						str+=" AND "+stringAmount.substring(4, 6)+"/100 DOLLARS";
						
					}else{
						str += thousands[ intAmount/1000 ];
						intHundreds=(intAmount%1000);
						str += hundreds[ intHundreds/100 ];						
						intDecades=(intHundreds % 100);
						str += decades[intDecades/10];
						str += stringNumber[ intDecades%10 ];						
						str+=" AND "+stringAmount.substring(5, 7)+"/100 DOLLARS";
					}
				
		return str;
	}

}
