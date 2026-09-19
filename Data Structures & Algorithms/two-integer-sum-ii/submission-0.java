class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0;
        int h = n-1;
        for(int i = 0; i<n; i++){
            int sum = numbers[l] + numbers[h];
            if(sum == target){
                return new int[]{l + 1, h + 1};
            }
            else if(sum>target){
                h--;
            }
            else{
                l++;
            }
        }
        return new int[]{};
    }
}
