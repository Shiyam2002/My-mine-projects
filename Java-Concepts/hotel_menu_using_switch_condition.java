package corejava;

import java.util.Scanner;
public class hotel_menu_using_switch_condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String food;
        int loop ;
        System.out.println("----------Food Menu----------\n");
        System.out.println("******Morning Menu******");
        System.out.println("1.Idly\n2.dosa\n3.pongal\n4.chappati\n5.puri\n");
        System.out.println("******Afternoon Menu******");
        System.out.println("1.white rice\n2.saambar\n3.rasam\n4.curd rice\n5.lemon rice\n");
        System.out.println("*******Dinner Menu******");
        System.out.println("1.Butter nan \n2. panner butter masala\n3.fried rice\n4.noodles\n5.momos");
        System.out.println("How many food items you need : ");
        loop = sc.nextInt();
        while(loop>0) {
        	 System.out.print("\nEnter your desired food item : ");
             food = sc.next();
             switch(food){
             case "Idly":
             case "Dosa":
             case "Pongal": 
             case "Chappati":
             case "Puri":
            	         System.out.println(food + " is ready now,you can order it");
            	         loop--;
            	         break;
             case "white rice": 
             case "saambar":
             case "rasam":
             case "curd rice":
             case "lemon rice":
            	         System.out.println(food + " is ready now,you can order it");
    	                 loop--;
    	                 break;
             case "Butter nan": 
             case "panner butter masala":
             case "fried rice":
             case "noodles":
             case "momos":
            	         System.out.println(food + " is ready now,you can order it");
    	                 loop--;
    	                 break;
             }
        }
	}

}
