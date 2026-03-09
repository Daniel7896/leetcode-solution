class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int seen = target - nums[i];
            if(check.containsKey(seen)){
                return new int[]{check.get(seen),i};
            }
            check.put(nums[i],i);
        }
        return new int[]{};
    }
}
