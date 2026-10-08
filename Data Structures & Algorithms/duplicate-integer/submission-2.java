class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set<Integer> uniqset=new HashSet<Integer>();
         for(int num : nums){
            if(uniqset.contains(num)){
                return true;
            }
            uniqset.add(num);
         }
         return false;
        }
    }