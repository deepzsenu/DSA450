package Arrays;

public class NegativeAtLeftSide {
    public static void siftNegativeToLeft(int[] arr, int n){


    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-3,1,2,3,4,-2,3};
        siftNegativeToLeft(arr,arr.length);
        PrintArray(arr);

    }


}
