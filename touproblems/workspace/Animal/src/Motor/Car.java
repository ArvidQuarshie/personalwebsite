package Motor;

public class Car {
	private int doors,wheels,seats;
	private char color;


	public int getDoors()
	{ return doors;

	}

public int setDoors(int doors){
	this.doors=doors;
	return doors;

}


public int getColor()
{ return color;

}

public int setColor(char color){
this.color=color;
return color;

}

public int getSeats()
{ return seats;

}

public int setSeats(int seats){
this.seats=seats;
return seats;

}

public int getWheels()
{ return wheels;

}

public int setWheels(int wheels){
this.wheels=wheels;
return wheels;

}

	public static void main(String[] args) {

		Car toyota=new Car();

		int y=	toyota.setDoors(4);

		System.out.println("This vehicle has: " +y);

	}

}
