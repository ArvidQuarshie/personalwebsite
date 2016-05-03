
public class Vehicle {
int wheels,seats,doors;
String color,transmission;
	public Vehicle(String color, int seats, int doors, int wheels, String transmission) {
this.wheels=wheels;
this.doors=doors;
this.seats=seats;
this.color=color;
this.transmission=transmission;
	}


	public static int main(String[] args) {

Vehicle bus =new Vehicle("red",4,4,4,"manual");
Vehicle saloon= new Vehicle("green",4,4,4,"Automatic");

bus.display();
saloon.display();

public int getwheels(){
	return wheels;
}
}

	}


private void display() {
		System.out.println();
		//getters and setters for the functions

		//change them to private


	}


}
