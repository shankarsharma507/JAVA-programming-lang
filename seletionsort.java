public class seletionsort {
   /* public static void selectionSort(int[] arr) {

        int n = arr.length; // store the length of the array in a variable for convenience
        for (int i = 0; i < n - 1; i++) {
             // iterate through the array up to the second-to-last element
            int minIdx = i; // assume the minimum element is the current element
            for (int j = i + 1; j < n; j++) {
                 // iterate through the rest of the array to find the actual minimum element
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swap the minimum element with the current element
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
} */

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
