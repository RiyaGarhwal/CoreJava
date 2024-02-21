package in.co.rays.constructor;

public class ConstructorCall {
     public String name=null;
     public String lastname=null;
     public String address=null;
     public String Car;
     public String Cycle;
     public String Bike;
     public String Indore;
     public String Pune;
     public String Bangalore;
     int Age;
     
     public ConstructorCall() {
    	 System.out.println("default constructor");
     }
     public ConstructorCall(String name,String lastname) {
    	 
    	 this.lastname=name;
    	this.name=name;
    	System.out.println("two parameter constructor");
    	System.out.println(name+" "+lastname);
     }
     public ConstructorCall(String Car,String Cycle,String Bike) {
    	 this.Car=Car;
    	 this.Cycle=Cycle;
    	 this.Bike=Bike;
     }
    	 
//    	 System.out.println("three parameters constructor");
//    	 System.out.println(Car+" "+Cycle+" "+Bike);
//    	 
     
     public ConstructorCall(String Indore,String Pune,String Bangalore,int Age) {
     this.Indore=Indore;
     this.Pune=Pune;
     this.Bangalore=Bangalore;
     this.Age=Age;
     }
     public void displaydetails() {
    	 System.out.println(this.Indore+" "+this.Pune+" "+this.Bangalore+" "+this.Age);
     }
}
