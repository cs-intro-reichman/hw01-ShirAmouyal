/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
     int a=Integer.parseInt(args[0]);
     int b=Integer.parseInt(args[1]);
     int min=a;
     int max=b;
     int m=0;
     
     if (a>b)
     {
     max=a;
     min=b;
     }

     else if(a==b) {System.out.println("there are not numbers between a and b"); }

    Random random=new Random();
    while (m<3)
    {
     int rnd=random.nextInt(max-min)+min;
     System.out.println(rnd);
     m++;
    }
     
    System.out.println("the minimum number is:"+min);	
	}
}
