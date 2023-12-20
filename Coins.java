/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here
		int c=Integer.parseInt(args[0]);;
        int q=25; // 1 quarters=25 cents
    
         System.out.println("use " + c/q +" quarters and "+ c%q +" cents");
	}
}