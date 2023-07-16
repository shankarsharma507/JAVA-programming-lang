public class JAVAtrappingrainwater {
    
        public static int trap(int[] height) {
            int n = height.length;
            int left = 0, right = n - 1;
            int leftMax = 0, rightMax = 0;
            int trappedWater = 0;
    
            while (left < right) {
                if (height[left] < height[right]) {
                    if (height[left] >= leftMax) {
                        leftMax = height[left];
                    } else {
                        trappedWater += leftMax - height[left];
                    }
                    left++;
                }
                
                else {
                    if (height[right] >= rightMax) {
                        rightMax = height[right];
                    } else {
                        trappedWater += rightMax - height[right];
                    }
                    right--;
                }
            }
    
            return trappedWater;
        }

        public static void main(String[] args) {
            int[] height = {3, 5, 4, 2, 2, 6};
            
            System.out.println("Trapped water: " + trap(height));
    }
}
    
