// Java code to compute distance

import java.util.Scanner;

public class LineCopmarisonProblemUC1 {

	public static void main(String args[]){

		int x1=6,y1=4,x2=7,y2=2;

		//Calculating distance

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);

		System.out.println(distance);

	}

}
