
public class Animal {
public static void walk(){
	System.out.println("i am walking");
}
public static void sounding(){

	System.out.println("i am sounding");
}

public static void sounding(String sound){
	System.out.println(sound);

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

walk();
sounding();
sounding("err");
	}

}
