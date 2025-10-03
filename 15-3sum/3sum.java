class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }

        //sort the array
        Arrays.sort(nums);

        //create a set of typ list integer
        Set<List<Integer>> result = new HashSet<>();

        //Now fix the first element and find the other two elements
        for(int i = 0; i < nums.length - 2; i++){
            //find the two other elements
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                //find the sum
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    //add result to the set
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if(sum < 0){
                    left++;
                } else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}