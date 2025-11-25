package assignment;

public class NumberToFigure {
	public static String converter(long n) {
	
	String[] ones= {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"};
	
	String tens[]= {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	long nunit[]= {10000000l,100000l,1000l,100l,1
	};
	 String sunit[] ={"crores","lakhs","thousand","hundred","only"
	 };
	 String word="";
	 for(int i=0;i<nunit.length;i++) {
		 int x=(int)(n/nunit[i]);
		 n=n%nunit[i];
		 
		 if(x>0) {
			 if(x>19) {
				 word =word+tens[x/10]+ones[x%10]+sunit[i];
			 }
			 
			 else {
				 word=word+ones[x]+sunit[i];
			 }
		 }
	 }
		 return word;
	 }
	 
	public static void main(String[] args) {
		System.out.println(new NumberToFigure().converter(11111));

	}

}
