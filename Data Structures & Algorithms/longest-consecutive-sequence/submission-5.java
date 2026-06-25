class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 0  ){
            return 0;
        }
        int longest = 0;
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int x = num;
                int count = 1;
                while(set.contains(x+1)){
                    x++;
                    count++;
                    
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
