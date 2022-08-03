package corejava;

// There is an ATM where we can take amount upto 2000 and using 200 and 500 notes only

class ATM {
	 
}

public class ATM_Withdrawer {
	 int two_hund_note = 200,five_hund_note=500;
	  void see_available(int amount) {
		  if(amount<two_hund_note) {
			  System.out.println(amount+" can not be withdrawn");
			  System.out.println("Minimum amount 200 should be withdrawn ");
		  }
		  else if(amount> two_hund_note && amount< five_hund_note) {
			  System.out.println(amount+" can not be withdrawn");
		  }
		  else if(amount == two_hund_note || amount == five_hund_note) {
			  System.out.println(amount+" can be withdrawn");
		  }
		  else {
			  int tnotes=0,fnotes=0,t2notes=0,f2notes=0;
			  tnotes = amount / two_hund_note;
			  fnotes = amount / five_hund_note;
			  t2notes = amount % two_hund_note;
			  f2notes = amount % five_hund_note;
			  
			  
		  }
	  }

	public static void main(String[] args) {
		

	}

}
