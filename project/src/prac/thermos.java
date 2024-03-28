package prac;

public class thermos {
	String Brand="Godrej";
	String Liquid="Orange Juice";
	int Capacity= 1000;
	int volume;

	thermos(){
		this.Brand=Brand;
		this.Liquid=Liquid;
		this.volume=0;
	}

	 void addliquid() {
		 
		 
		 int c=200; //enter capacity in m
		 
		 if(Capacity>c) {
			 Capacity=Capacity-c;
			 System.out.println(Capacity+"ml of "+Liquid+" added to the thermos");
		 }else if(Capacity==0) {
			 System.out.println("Thermos is full");
		 }
		 else {
			 System.out.println("liquid will overflow"); 
		 }
		 
		 
	 }
	 
	 void display() {
		System.out.println("Brand: "+Brand);
	 }
}
