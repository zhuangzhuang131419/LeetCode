package Q26;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int i=1, store=1;
        while(i<nums.length){
            if (nums[i]!=nums[i-1]){
                nums[store++]=nums[i++];
            }
            else{
                ++i;
            }
        }
        return (store);
    }
}
