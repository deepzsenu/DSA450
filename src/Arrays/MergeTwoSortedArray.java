package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static  void mergeSort(int[] arr1,  int[] arr2, int m,int n) {
        int  i = m-1;
        int j =0;
        while(i>=0 && j<n){
            if(arr1[i] >arr2[j]){
                swap(arr1, arr2, i, j);
            }
            i--;
            j++;
        }
        //n+m
        Arrays.sort(arr1);
        Arrays.sort(arr2); //nlog(n)


    }
    public static void mergeSortGAP(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int i =0,j;
        int g = n+m;
        while (g>=1){
            for(i =0 ; i+g<n; i++){
                if(a[i]>a[i+g]){
                    swap(a,a,i,i+g);
                }
            }
            for(j = g>n?g-n:0;i<n&&j<m;i++,j++){
                if(a[i]>b[j]){
                    swap(a,b,i,j);
                }
            }
            if(j<m){
                for(j = 0; j+g<m; j++){
                    if(b[j]>b[j+g])
                    {
                        swap(b,b,j,j+g);
                    }
                }
            }
            g = nextGap(g);
        }

    }
    private static int nextGap(int gap)
    {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }
    public static void swap(int[] a, int[] b, int i, int j){
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
    public static void print(int[] a, int[] b){
        for (int i =0 ; i<a.length; i++) System.out.print(a[i] + " ");
        int i =0 ;
        while (i<b.length) {
            System.out.print(b[i]+" ");
            i++;
        }
    }
    public static void main(String[] args) {
        int[] a = {3,5,6,7,9,10,13, 14,19,100,112};
        int[] b = {1, 10, 11, 12, 15, 17,18};
        int m = a.length;
        int n = b.length;
        mergeSortGAP(a,b);
        print(a,b);
    }
}
