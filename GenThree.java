/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
     int a=Integer.parseInt(args[0]);
     int b=Integer.parseInt(args[1]);
     int m=0;
     int min=0;

    Random random=new Random();
    while (m<3)
    {
     int rnd=random.nextInt(max-min)+min;
     if(rnd<min){min=rnd;}
     System.out.println(rnd);
     m++;
    }
     
    System.out.println("the minimum number is:"+min);	
	}
}
