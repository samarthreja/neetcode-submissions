class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num : nums){
        map.put(num, map.getOrDefault(num, 0) + 1);
       }
       int[] res = new int[k];
       for(int i = 0; i<k; i++){
        int maxFreq = 0;
        int key = 0;
        for(int n : map.keySet()){
            if(map.get(n) > maxFreq){
                maxFreq = map.get(n);
                key = n;
            }
        }
        res[i] = key;
        map.remove(key);
       }
       return res;
    }
}
