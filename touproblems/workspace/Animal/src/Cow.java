
public class Cow extends Animal  {
	public static void sounding(){
		System.out.println("I am mooing");
	}

	public static void laugh(){
		System.out.println("I am chekaring");
	}
	public static void milk(){
		System.out.println("I am maziwaring fresha");
	}
	public static void main(String[] args) {

		Cow blacky =new Cow();

		Animal dingo=new Animal();

		Cow daisy= new Cow();

blacky.sounding();
dingo.walk();
blacky.laugh();
daisy.milk();


	}

}
