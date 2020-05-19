public class sum {
        public static int[] twoSum(int[] nums, int target) {
            
            int sum = 0;
            int ans[] = {0,0};
            for(int i = 0; i<nums.length; i++){
                for(int j=i; j<nums.length-1; j++){
                    
                    sum = nums[i] + nums[j+1];
                    
                    if(sum == target){
                        ans[0] = i;
                        ans[1] = j+1;
                        return ans;
                    }
                }
            }
            return ans;
        }
    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
        int ans[] = {0,0};
        ans = twoSum(nums, target);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}