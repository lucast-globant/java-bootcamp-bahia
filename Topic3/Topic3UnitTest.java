import static org.junit.Assert.*;

import org.junit.Test;


public class Topic3UnitTest {

	@Test
	public void testDoubleToString() {
		
		DoubleToString doubleToString=new DoubleToString();
		assertEquals("FIVE AND 60/100 DOLLARS", doubleToString.getText(5.6));
		assertEquals("FIFTEEN AND 60/100 DOLLARS", doubleToString.getText(15.6));
		assertEquals("TWENTY THREE AND 60/100 DOLLARS", doubleToString.getText(23.6));
		assertEquals("ONE HUNDRED TWENTY THREE AND 60/100 DOLLARS", doubleToString.getText(123.6));
		assertEquals("ONE THOUSAND TWO HUNDRED THIRTY FOUR AND 60/100 DOLLARS", doubleToString.getText(1234.6));
	}
	@Test
	public void testWordWrapping() {
		String[] result;
		WordWrapping wordWrapping=new WordWrapping();
		
		result=wordWrapping.getWords(60,"Tex shorter than row-length");
		assertEquals("Tex shorter than row-length", result[0]);
		
		/*
		for(int i=0;i<result.length;i++){
			if(result[i]!=null)
				System.out.println(result[i]);
		}
		*/
		result=wordWrapping.getWords(3,"a b c d e f");
		assertEquals("a b", result[0]);
		assertEquals("c d", result[1]);
		assertEquals("e f", result[2]);
		/*
		for(int i=0;i<result.length;i++){
			if(result[i]!=null)
				System.out.println(result[i]);
		}
		*/
		result=wordWrapping.getWords(5,"Excelent");
		assertEquals("Excel", result[0]);
		assertEquals("ent", result[1]);
	/*	
		for(int i=0;i<result.length;i++){
			if(result[i]!=null)
				System.out.println(result[i]);
		}
		*/

	}
	@Test
	public void bumpedTest() {
		RecentItems recentItems =new RecentItems();
		recentItems.openFile("C:/ZERO");
		recentItems.openFile("C:/ONE");
		recentItems.openFile("C:/TWO");
		recentItems.openFile("C:/ONE");
		assertEquals("C:/ONE", recentItems.get(0));
		assertEquals("C:/TWO", recentItems.get(1));
		assertEquals("C:/ZERO", recentItems.get(2));
		//recentItems.showItems();
		recentItems.updateFile();
	}
	@Test
	public void getsFullTest() {
		RecentItems recentItems =new RecentItems();
		recentItems.openFile("C:/ZERO");
		recentItems.openFile("C:/ONE");
		recentItems.openFile("C:/TWO");
		recentItems.openFile("C:/THREE");
		recentItems.openFile("C:/FOUR");
		recentItems.openFile("C:/FIVE");
		recentItems.openFile("C:/SIX");
		recentItems.openFile("C:/SEVEN");
		recentItems.openFile("C:/EIGHT");
		recentItems.openFile("C:/NINE");
		recentItems.openFile("C:/TEN");
		recentItems.openFile("C:/ELEVEN");
		recentItems.openFile("C:/TWUELVE");
		recentItems.openFile("C:/THIRTEEN");
		recentItems.openFile("C:/FOURTEEN");
		recentItems.openFile("C:/FIVETEEN");
		recentItems.openFile("C:/SIXTEEN");
		assertEquals("C:/TWO", recentItems.get(14));
		//recentItems.showItems();
		recentItems.updateFile();
	}
	
	@Test
	public void romanArabicConverterTest() {
		int result;
		result=RomanArabicConverter.getArabic("XXXI");
		assertEquals(31, result);
		System.out.println(result);
		System.out.println(RomanArabicConverter.getRoman(result));
		assertEquals("XXXI", RomanArabicConverter.getRoman(result));
	}
	
}
