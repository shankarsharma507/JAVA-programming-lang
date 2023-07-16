public class suffixmax {
    int suffixMax(int[] arr) {
        int maxSum = 0, currentSum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    
}
