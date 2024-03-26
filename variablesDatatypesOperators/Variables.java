public class Variables{
	public static void main(String[] args){
		//create a byte variable and set it to any valid byte number. So a byte ranges from -128 to 127.
		byte myByte = 10;

		//create a short variable and set it to any valid short number.So a short ranges from -32,768 to 32,767.
		short myShort = 20;

		//create an int variable and set it to any valid int number. So int variable range from -2billion to positive 2billion.
		int myInt = 50;
		
		//crate a variable of type long, and make it equal to 50_000 + 10 times the sum of the byte, plus the short plus the int.
		long myLong = 50_000 + (10 *(myByte + myShort + myInt));

		System.out.println(myLong);
	}
}
