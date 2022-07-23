package bridgelabz.LineComparisionProblem;

import java.util.Scanner;

public class UC3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("x1");
		System.out.println("x2");
		System.out.println("y1");
		System.out.println("y2");
		System.out.println("p1");
		System.out.println("p2");
		System.out.println("q1");
		System.out.println("q2");
		float x1 =scan.nextInt();
		float x2 =scan.nextInt();
		float y1 =scan.nextInt();
		float y2 =scan.nextInt();
		float p1 =scan.nextInt();
		float p2 =scan.nextInt();
		float q1 =scan.nextInt();
		float q2 =scan.nextInt();
		
		float a =((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		float b= (float) Math.sqrt(a);
		System.out.println("Length of the line = " +b);
		float c =((p2-p1)*(p2-p1))+((q2-q1)*(q2-q1));
		float d= (float) Math.sqrt(c);
		System.out.println("Length of the line = " +d);
		
		if(Float.compare(b, d) == 0) {
		System.out.println("Lines are equal");
		}
		else if (Float.compare(b, d) > 0) {
		System.out.println("First line is grater than second line");
		}
		else {
		System.out.println("Second line is grater than first line");
		}
	}

}
