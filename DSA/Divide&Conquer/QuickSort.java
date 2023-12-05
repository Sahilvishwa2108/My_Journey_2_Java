
public class QuickSort {
    public static void sorting(int arr[], int si, int ei ){
        //base case
        if(si >= ei){
            return;
        }

        //kaam
        int pivotIdx = partition(arr, si, ei);
    }
    public static void partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;

        for(int j = 0; j <= arr.length; j++){
            i++;

        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
    }
}
