public class RotatedAndSorted {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 1, 2, 3};
        int target = 2;
        int si = 0;
        int ei = arr.length - 1;
        System.out.println(search(arr, target, si, ei));
    }

    static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1; // Base condition fixed
        }

        int mid = si + (ei - si) / 2; // Prevents integer overflow

        if (arr[mid] == target) {
            return mid;
        }

        // Left half is sorted
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target < arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                return search(arr, target, mid + 1, ei);
            }
        }
        
        // Right half is sorted
        if (arr[mid] < arr[ei]) {
            if (arr[mid] < target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                return search(arr, target, si, mid - 1);
            }
        }

        return -1; // This handles cases where no condition matches
    }
}
