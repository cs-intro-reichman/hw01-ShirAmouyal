/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.lang.*;
import java.util.Random;
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
     int a=Integer.parseInt(args[0]);
     int b=Integer.parseInt(args[1]);
     int m=0;
     int min=Math.min(a,b);
     int max=Math.max(a,b);
     int currentMin=max;

    Random random=new Random();
    while (m<3)
    {
     int rnd=random.nextInt(max-min)+min;
     if(rnd<currentMin){currentMin=rnd;}
     System.out.println(rnd);
     m++;
    }
     
    System.out.println("the minimum number is:"+currentMin);	
	}
}
