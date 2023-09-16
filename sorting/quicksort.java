package sorting;
// Use pivot and partition
// using a pivot in the array to sort the whole array
// splitting the array around the pivot
// Many ways to select pivot : 1.Random ; 2.Median ; 3.First Element ; 4.Last Element (most used);
// Time complexity (worse case) = o(n2) {when pivot is smallest or largest element} ; (average case) = o(nlogn)
// No space complexity because using the same array and creating no new array

public class quicksort {

        public static int partition(int arr[] , int low , int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j=low;j<=high-1;j++){ // going for high-1 because pivot = high
            if(arr[j]<pivot){
                i++;
                //swapping elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swapping last element and pivot and returning the correct value of pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void sorting(int arr[] , int low , int high){
        if (low < high){
            int pivot = partition(arr , low , high);
            sorting(arr , low , pivot-1);
            sorting(arr, pivot , high);
        }
    }
    public static void main(String[] args) {
    int arr[] = {6,3,9,2,5,8};
    int n = arr.length;

    sorting(arr,0,n-1);

    for(int i = 0 ; i<n;i++){
        System.out.print(" "+arr[i]);
    }
    System.out.println();

    }
}
