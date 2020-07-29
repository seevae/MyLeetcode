//O（n^2） O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}

//O（n）  O（n）
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = target - nums[i];
            if(hash.containsKey(num)){
                return new int[]{hash.get(num),i};
            }
            hash.put(nums[i],i);
        }
        return null;
    }
}