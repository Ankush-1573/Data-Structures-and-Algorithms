public class BinaryS {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,67,85};
        int target=85;
        search(arr,target, 0, arr.length-1);
        System.out.println(search(arr, target, 0, arr.length));

    }
    static int search(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return search(arr, target, mid+1, e);
        }
            return search(arr, target, s, mid-1);

    }
}
