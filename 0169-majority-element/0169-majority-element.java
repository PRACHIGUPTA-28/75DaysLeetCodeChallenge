class Solution {
    public int majorityElement(int[] nums) {
        
        int ele=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
        int count=0;
            for(int j=i;j<n;j++){
                if(nums[i]==nums[j]){
                
                    count++;
                    }
                }  if(count>n/2){
                    ele=nums[i];
              
            }
        }   
        return ele;
        
    }
}