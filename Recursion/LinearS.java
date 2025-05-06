public class LinearS {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        int target=8;
        System.out.println(search(arr, target));
    }
    static int search(int arr[],int target){
        return helper(arr,target,0);
    }
    static int helper(int arr[],int target,int idx){
        //base case
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return helper(arr, target, idx+1);
    }
}
