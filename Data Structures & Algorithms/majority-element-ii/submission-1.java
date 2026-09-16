class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
           
        }
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                li.add(key);
            }
        }
        return li;

    }
}