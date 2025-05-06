import java.util.ArrayList;

public class ReturnList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,6};
        int target=5;
        ArrayList<Integer>list=new ArrayList<>();
        int idx=0;
        System.out.println(search(arr, target, list, idx));

    }
    static ArrayList<Integer> search(int arr[],int target,ArrayList<Integer>list,int idx){
        if(idx==arr.length){
            return list;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        return search(arr, target, list, idx+1);
    }
}
