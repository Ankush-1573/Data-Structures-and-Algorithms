import java.util.ArrayList;

public class LinearSvariation {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,5,6};
        int target=5; 
        search(arr, target);
        System.out.println(list);  
    }
    static void search(int arr[],int target){
        helper(arr,target,0);
    }
    static ArrayList<Integer>list=new ArrayList<>();
    static void helper(int arr[],int target,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        helper(arr, target, idx+1);
    }
}
