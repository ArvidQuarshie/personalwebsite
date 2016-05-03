
public class SelectionSort {
    public static int[] doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) //ensures the numbers are increasing
        {
            int index = i; //index of the selected number
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) //selected number compared to the furthest left
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    public static void main(String a[]){

        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
