package zhaoqi.sort;

public class QuickSort {
	
    public List<Integer> sortArray(int[] nums) {
        if(nums.length<0){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        quicksort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        return list;
    }

    public void quicksort(int[] nums,int left,int right){
        if(left > right){
            return;
        }
        int i=left;
        int j = right;
        int key=nums[left];

        while(i<j){
            while(i<j && nums[j]>=key){
                j--;
            }

            while(i<j && nums[i]<=key){
                i++;
            }
            if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        nums[left] = nums[i];
        nums[i] = key;        

        quicksort(nums,left,i-1);
        quicksort(nums,i+1,right);
    }
}