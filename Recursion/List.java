import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        int target=3;
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(search(arr, target, list));
    }
    static ArrayList<Integer> search(int arr[],int target, ArrayList<Integer>list){
        return helper(arr,target,0,list);
    }
    static ArrayList<Integer> helper(int arr[],int target,int idx,ArrayList<Integer>list){
        if(idx==arr.length){
            return list;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        return helper(arr, target, idx+1, list);
    }
}
