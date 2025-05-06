import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6};
        int target=4;
        int index=0;
        System.out.println(search(arr, target, index));
    }
    static ArrayList<Integer> search(int arr[],int target,int index){
        ArrayList<Integer>list=new ArrayList<>(); //every fun call new list is formed

        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer>ansOfbelowFunCall = search(arr, target, index+1);
        //executed while clearing the fun cell
        list.addAll(ansOfbelowFunCall);
        return list;
    }
}
