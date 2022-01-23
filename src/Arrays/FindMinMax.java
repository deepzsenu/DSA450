package Arrays;

import jdk.dynalink.beans.StaticClass;

public class FindMinMax {
    static class Pair{
        int min;
        int max;
    }
    public static Pair MinMax(int arr[]){
        Pair minmax = new Pair();
        if(arr.length == 1){
            minmax.min = arr[0];
            minmax.max = arr[0];
        }
        if(arr[0]>arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }
        else{
            minmax.min = arr[0];
            minmax.max = arr[1];
        }
        for (int i = 2; i<arr.length; i++){
            if(arr[i]> minmax.max){
                minmax.max = arr[i];
            }
            else if(arr[i]< minmax.min){
                minmax.min = arr[i];
            }
        }
        return minmax;

    }

    public static void main(String[] args) {
        int arr[] = {10,9 ,3,4,5,6,7};
        Pair minmax = MinMax(arr);
        System.out.println(minmax.min+" "+ minmax.max);
    }
}
