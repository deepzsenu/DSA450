package Arrays;


public class Sort120 {

    public static void sort(int[] arr){
        int l =0;
        int m =0;
        int h =arr.length -1;
        while (m<=h){
            if(arr[m]==0){
                int temp = arr[m];
                arr[m] = arr[l];
                arr[l] = temp;
                m++;
                l++;
            }
            else if (arr[m] ==1){
                m++;
            }
            else if(arr[m] ==2){
                int temp = arr[m];
                arr[m] =arr[h];
                arr[h] = temp;
                h--;
            }
        }
    }
    public static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,2,1,0,0};
        sort(arr);
        PrintArray(arr);

    }
}
