class Solution {
    public boolean containsDuplicate(int[] nums) {
        
//         // check distinct one first
//         int[] array = new int[1000000001];
//         for(int i = 0; i<nums.length; i++){
//             if(array[nums[i]] != 0){
//                 // value appears at least twice
//                 return true;
//             }
//             array[nums[i]] ++;
//         }
        
//         return false;
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])) return true;
            else{
                map.put(nums[i], true);
            }
            
        }
        return false;
    }
}