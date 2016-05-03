
public class MaxMin {

	public static void main(String args[]){
		int array[]=new int[]{1,45,67,7,8};

		//calling the getMax()method for getting the max value

		int maximum =get.max(array);

		System.out.println("Maximum value is:"+maximum);

		//calling the get minmethod
		 int minimum=get.min(array);
		 System.out.println("Minimum value is:"+minimum);

		 //method used to get the maximum value

		 public static int getMax(int[] input)
		 {
			int maxvalue = input[0];
			for(int i=1;i<input.length;i++){
				if (input[i]>maxvalue){
					maxvalue=input[i];
				}
			}
			return maxvalue;
		 }

		 //method for getting minimum value

		 public static int getMin(int[] input){
			 int minvalue=input[0];
			 for(int i=1;i<input.length;i++)
			 {
				 if (input.length[i]<minvalue){
					 minvalue=input[i];
				 }
			 }
			 return minvalue;
		 }
	}
}
