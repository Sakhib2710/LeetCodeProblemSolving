import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,1,4,7,9,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            boolean swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
