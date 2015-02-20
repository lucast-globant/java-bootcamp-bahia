
public class RomanArabicConverter {
 

 private static final String ROMAN_SIMBOLS[] = 
   { "M", "CM", "D", "CD", "C","XC", "L", "XL", "X", "IX", "V", "IV", "I" };


 private static final int ARABIC_ROMAN_VALUE[] = { 1000, 900, 500, 400,
   100, 90, 50, 40, 10, 9, 5, 4, 1, 0 };

 private static final int n = 13; 

 
 private static String getRomanValue(int number) {
  
  if (number == 0){
   return "";
  } 
  int i;//Index of value or simbol
  

  for (i = 0; i < n; i++){
   if (number >= ARABIC_ROMAN_VALUE[i]){
    break;
   } 
  }
  int v = ARABIC_ROMAN_VALUE[i];
  String romanVlue = ROMAN_SIMBOLS[i];


  for (; ((v < number) && ((ROMAN_SIMBOLS[i] == "V")
    || (ROMAN_SIMBOLS[i] == "L") || (ROMAN_SIMBOLS[i] == "D") 
    || (ROMAN_SIMBOLS[i].length() > 1))); i++);
  while (v < number) {
   v = v + ARABIC_ROMAN_VALUE[i];
   romanVlue = romanVlue + ROMAN_SIMBOLS[i];
  }
  return romanVlue;
 }

 public static String getRoman(int arabicN) {
  

  if (arabicN > 3999 || arabicN < 1) {
   return null;
  }


  String result = "";
  int base = 10; 
  do {
   int num = arabicN % base;
   result = getRomanValue(num) + result;
   arabicN = arabicN - num;
   base = base * 10;
  } while (arabicN != 0);
  return result;
 }

 public static int getArabic(String romanN) {
  

  int arabicValue = 0; 
  int before; 
  int actual; 

  for (actual = 0; actual < n; actual++)
   if (ROMAN_SIMBOLS[actual].compareTo(romanN.charAt(romanN
     .length() - 1)
     + "") == 0) {
    arabicValue = ARABIC_ROMAN_VALUE[actual];
    break;
   }
  before = actual;
  

  for (int i = romanN.length() - 2, j = 0; i >= 0; i--) {
   for (actual = 0; actual < n; actual++) {
    if (ROMAN_SIMBOLS[actual].compareTo(romanN.charAt(i) + "") == 0) {
     break;
    }
   }
   if (ARABIC_ROMAN_VALUE[actual] < ARABIC_ROMAN_VALUE[before]) {
    arabicValue = arabicValue - ARABIC_ROMAN_VALUE[actual];
   } else {
    arabicValue = arabicValue + ARABIC_ROMAN_VALUE[actual];
   }
   before = actual;
  }
  return arabicValue;
 }
}
