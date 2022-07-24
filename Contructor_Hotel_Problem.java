package corejava;
import java.util.Scanner;

public class Contructor_Hotel_Problem {
	Scanner sc = new Scanner(System.in);
	public Contructor_Hotel_Problem() {
		int total,amount,food,no_day,no_food,per_day=200,per_food=100,cgst,sgst;
		System.out.println("The Charge for Per Day check-in is : "+per_day+"\nAnd, The Charge for per-food is : "+per_food);
      	System.out.println("How many days did you stayed here ?");
      	no_day = sc.nextInt();
      	amount = no_day * per_day;
      	System.out.println("The total amount for check-in is : "+amount);
      	System.out.println("How many times did you ordered food in "+no_day+" days ?" );
      	no_food = sc.nextInt();
      	food = no_food * per_food;
      	System.out.println("The total amount for food is : "+food);
      	total = amount + food ;
      	System.out.println("The Total charge for staying is : "+ total);
      	cgst = total *18/100;
      	sgst = total *18/100;
      	System.out.println("The GST for the Charge is :\nThe CGST is : "+cgst+"\nThe SGST is : "+sgst);
      	total = total - cgst - sgst;
      	System.out.println("The Grand Total is : "+total);
	}
  public static void main(String[] args) {
	Contructor_Hotel_Problem fguy = new Contructor_Hotel_Problem();
	Contructor_Hotel_Problem sguy = new Contructor_Hotel_Problem();
} 
}
