
public class Euclids {
	int a,b,c ,result;
	public int gcd(int a,int b){
		c=a%b;


		if (c==0){
			return b;
		}
			else if(c!=0){
		result=	gcd(b,c);
		return result;
		}

	}


	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

}
}
