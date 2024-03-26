public class Operators2{
	public static void main(String[] args){
		/*1. Create a double variable with the value 20
		 *2. Create a second variable of type double with the value 80
		 *3. Add both numbers up and multiply by 25
		 *4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
		 *5. Write an "if" statement that displays a message "Total was over the limit" if the remaining total (#4) is equal to 20 or less. */

		double myDouble1 = 20;
		double myDouble2 = 80;
		double myDouble3 = (myDouble1 + myDouble2) * 25;
		double myDouble4 = myDouble3 % 40;

		System.out.println(myDouble4);

		if (myDouble4 <= 20)
			System.out.println("Total was over the limit");
	}
}
