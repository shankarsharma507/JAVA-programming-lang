/*public class JavaArrayreverse {
    public static void reverse(int numbers[]){
        int First = 0;
        int End = numbers.length - 1;

        while(First<End){
            int temp = numbers[End];
            numbers[End] = numbers[First];
            numbers[First] = temp;

            First++;
            End--;

        }

        


    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7};
        reverse(numbers);
        for(int i = 0; i <= numbers.length; i++){
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        
    }
}
*/

public class JavaArrayreverse {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  
