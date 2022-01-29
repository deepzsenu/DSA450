package Arrays;

public class CyclicallyRotateArrayByOne {
    public static void RotateByNByOneMethod(int[] arr, int d){
        d = d%arr.length;
        for(int i =0; i<d; i++){
            RotateByOne(arr);
        }
    }
    public static void RotateByNReverseMethod(int[] arr, int d){
        int k = d%arr.length;
        Reverse(arr, 0, arr.length-1);
        Reverse(arr, 0, k-1);
        Reverse(arr, k, arr.length-1);


    }
    public static void RotateByOne(int[] arr){
        int n = arr.length;
        int k = arr[n-1];
        for (int i = n-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = k;

    }
    public static void Reverse(int[] arr, int l, int h){
        while(l <= h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
    public static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,2 ,3,4,5,6,7};
//        RotateByOne(arr);
        //RotateByNReverseMethod(arr, 2);
        RotateByNByOneMethod(arr,2);
        PrintArray(arr);
    }
}
