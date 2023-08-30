import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1,0,-1};
        for(int i =0;i<arr.length;i++){
            int last = arr.length-i-1;
            int mIndex = maxIndex(arr, 0,last);
            swap(arr,mIndex,last);
        }
        System.out.println(Arrays.toString(arr));
    }

    static int maxIndex(int[] arr, int start, int end){
        int max = 0;
        for(int i = start;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int last){
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
    }
}
