package Arrays;

public class TrappingRainWater {
    public static long waterTrapping(int[] arr, int n){
        int water =0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        rmax[n-1] = arr[n-1];
        for( int i = 1; i<n; i++){
            int temp = Math.max(lmax[i-1], arr[i]);
            lmax[i] = temp;
        }
        for(int i = n-2; i>=0; i--){
            int temp = Math.max(rmax[i+1], arr[i]);
            rmax[i] = temp;
        }
        for (int i = 0; i<n-1; i++){
            water += (Math.min(lmax[i], rmax[i]) - arr[i]);

        }
        return water;

    }
    public static void main(String[] args) {
        int[] arr = {7,4,0,9};
        System.out.println(waterTrapping(arr, 4));

    }
}
