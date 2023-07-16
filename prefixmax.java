public class prefixmax {
    int prefixMax(int[] arr) {
        int maxSum = 0, currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    
}
