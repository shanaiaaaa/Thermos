package prac;

public class thermos {
	String Brand="Godrej";
	String Liquid="Orange Juice";

	thermos(){
		this.Brand=Brand;
		this.Liquid=Liquid;
	}
	 void addliquid(){
		 
		 Liquid="Tea";
		 
	 }
	 
	 void addbrand() {
		 Brand="Milton";
	 }
	 
	 void display() {
		 System.out.println("The Brand of thermos is "+Brand);
		 System.out.println("The Liquid in the thermos is "+Liquid);
	 }
}
