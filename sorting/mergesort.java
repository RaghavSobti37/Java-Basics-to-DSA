package sorting;
// using divide and conquer method
// diving the problem in small parts
// then "merging" the small sorted parts and sorting the array

// time complexity = O(nlogn)
// space complexity = O(n)

public class mergesort {
    public static void conquer(int arr[],int si,int ei,int mid){
        int merged[]= new int[ei-si+1];

        int index1 = si; // creating 2 pointers for the sorted array
        int index2 = mid+1;
        int mergeidx = 0;

        while(index1 <= mid && index2<= ei ){ // running the loop for both the arrays
            if(arr[index1]<= arr[index2]){ // comparing the elements on both pointers
                merged[mergeidx] = arr[index1];
                mergeidx++ ; index1++; // incrementing the one which is true and then comparing it with next element
            } else {
                merged[mergeidx]= arr[index2];
                mergeidx++ ; index2++;
            }
        }

        //creating 2 while loops to copy the rest of the elements in the other array
        while(index1 <= mid){
            merged[mergeidx++] = arr[index1++]; // can be written in same line
        }

        while(index2 <= ei){
            merged[mergeidx++] = arr[index2++];
        }

        for (int i=0 , j=si;i<merged.length;i++, j++){ // inputting elements of merged in original array
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[],int si , int ei){
        if (si>=ei) return;

        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr , mid+1 , ei);
        conquer(arr, si, ei, mid);
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr,0, n-1);
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
