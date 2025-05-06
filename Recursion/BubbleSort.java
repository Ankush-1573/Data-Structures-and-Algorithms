import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={4,36,76,2,1};
        //bubble(arr, arr.length-1, 0);
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int arr[],int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            if(arr[col]>arr[col+1]){
                //swap
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
                bubble(arr, row, col+1);
            }
        }else{
            bubble(arr, row-1, 0);

        }

    }
    static void selection(int arr[],int row,int col,int max){
        if(row==0){
            return;
        }
        if(row>col){
            if(arr[col]>arr[max]){
                selection(arr, row, col+1,col);
            }else{
                selection(arr, row, col+1, max);
            }
        }else{
            //swap
            int temp=arr[row-1];
            arr[row-1]=arr[max];
            arr[max]=temp;

            selection(arr, row-1, 0, 0);
        }
    }
    
}
