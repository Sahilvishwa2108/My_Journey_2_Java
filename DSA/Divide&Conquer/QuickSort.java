
public class QuickSort {
    public static void sorting(int arr[], int si, int ei ){
        //base case
        if(si >= ei){
            return;
        }

        //kaam
        int pivotIdx = partition(arr, si, ei);
        sorting(arr, si, pivotIdx - 1); //left
        sorting(arr, pivotIdx, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;

        for(int j = si; j < ei; j++){
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        sorting(arr, 0, 5);
        printArr(arr);
    }
}
