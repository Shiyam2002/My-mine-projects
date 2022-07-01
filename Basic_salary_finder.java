package corejava;

import java.util.Scanner;

public class Basic_salary_finder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salary,tax,bal;
		float gst=(float) 7.5;
		System.out.println("enter your monthly salary: " );
	    salary = sc.nextFloat();
	   //Monthly
	    tax = salary*gst/100;
	    bal = salary - tax;
	    System.out.println("your monthly balance will be : "+ bal);
	    System.out.println("your monthly tax will be : "+ tax);
	    System.out.println();
	   //quarterly
	    salary*=3;
	    tax = salary*gst/100;
	    bal = salary - tax;
	    System.out.println("your quarterly balance will be : "+ bal);
	    System.out.println("your quarterly tax will be : "+ tax);
	    System.out.println();
	   //Half-year
	    salary*=2;
	    tax = salary*gst/100;
	    bal = salary - tax;
	    System.out.println("your Half-yearly balance will be : "+ bal);
	    System.out.println("your Half-yearly tax will be : "+ tax);
	    System.out.println();
	   //yearly
	    salary*=2;
	    tax = salary*gst/100;
	    bal = salary - tax;
	    System.out.println("your yearly balance will be : "+ bal);
	    System.out.println("your yearly tax will be : "+ tax);
	}

}
