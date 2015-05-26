package uk.gov.justice.digital.atet.factories;



public class FakeDataFactory {
	
	public static String getATETStartPageUrl(){
        return "https://staging.et.dsd.io/apply";
	}
	
	public static String getATETMemorableWord(){
		return "memorable word";
	}

	public static String getClaimantTitle() {
		return "Mrs";
	}
	
	public static String getClaimantFirstName() {
		return "Minnie";
	}
	
	public static String getClaimantLastName() {
		return "Mouse";
	}

	public static String getClaimantBuilding() {
		return "234";
	}

	public static String getClaimantStreet() {
		return "yellow brick road";
	}

	public static String getClaimantLocality() {
		return "Stevenage";
	}

	public static String getClaimantCounty() {
		return "Hertfordshire";
	}

	public static String getClaimantPostcode() {
		return "SG80LT";
	}

	public static String getRespondentName() {
		return "Donald Duck";
	}
	
	public static String getRespondentBuilding() {
		return "Some Building";
	}

	public static String getRespondentStreet() {
		return "french street";
	}

	public static String getRespondentLocality() {
		return "bishop stortford";
	}

	public static String getRespondentCounty() {
		return "Hertfordshire";
	}

	public static String getRespondentPostcode() {
		return "cm233fe";
	}
	
	public static String getAcasNumber(){
		return "R000000/00/00";
	}
	
	public static String getCreditCardName(){
		return "name on credit card";
	}
	
	public static String getCreditCardNumber(){
		return  "4111111111111111";
	}
	
	public static String getCreditCardVerificationNumber(){
	
		return "111";
	}
	
	public static  String getCreditCardExpiryMonth(){
		return "02";
	}
	
	public static  String getCreditCardExpiryYear(){
		return "2021";
	}
	
	
	public static String generateRandomLines(int number_of_lines, int number_of_characters_per_line) throws Exception{
		StringBuilder builder = new StringBuilder();
		for (int index=1;index <= number_of_lines; index++ ){
			if (number_of_lines == index)
			  builder = builder.append(generateRandomString(number_of_characters_per_line, Mode.ALPHANUMERIC));
			else
			  builder = builder.append(generateRandomString(number_of_characters_per_line, Mode.ALPHANUMERIC)+"\r");
		}
		return builder.toString();
	}

	
	public static enum Mode {
	    ALPHA, ALPHANUMERIC, NUMERIC 
	}
	
	
	public static String generateRandomString(int length, Mode mode) throws Exception {

		StringBuffer buffer = new StringBuffer();
		String characters = "";

		switch(mode){
		
		case ALPHA:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;
		
		case ALPHANUMERIC:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			break;
	
		case NUMERIC:
			characters = "1234567890";
		    break;
		}
		
		int charactersLength = characters.length();

		for (int i = 0; i < length; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(characters.charAt((int) index));
		}
		return buffer.toString();
	}

	public static String getClaimDetailDescription() {
		return "description";
	}
	
	public static String creditcardName(){
		return "cardname";
	}
	
	public static String masterCardNumber(){
		return "5555555555554444";
	}
	
	public static String jcbCardNumber(){
		return  "5555555555554444";
	}
	
	public static String visaCardNumber(){
		return "5555555555554444";
	}
	
	public static String maestroCardNumber(){
		return "5555555555554444";
	}

	public static String getEmailAddress() {
		return "ugstester+atet@gmail.com";
	}
	
}
