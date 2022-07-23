package bridgelabz.LineComparisionProblem;

import java.util.Scanner;

public class UC1 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("x1");
	System.out.println("x2");
	System.out.println("y1");
	System.out.println("y2");
	
	float x1 =scan.nextInt();
	float x2 =scan.nextInt();
	float y1 =scan.nextInt();
	float y2 =scan.nextInt();
	
	float a =((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
	float b= (float) Math.sqrt(a);
	System.out.println("Length of the line = " +b);
}
}
