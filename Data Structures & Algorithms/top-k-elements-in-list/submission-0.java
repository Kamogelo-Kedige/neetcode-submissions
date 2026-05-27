class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Count frequencies of each number  using a hashMap: key = number, value = frequency
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Build a max-heap (PriorityQueue) based on frequency
        // The Comparator compares entries by value (frequency), highest first
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue())
            );

       // Add all map entries into the heap
        maxHeap.addAll(freq.entrySet());

        // Extract the top k elements from the heap
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            // poll removes the entry with highest frequency
            result.add(maxHeap.poll().getKey());
        }

        // Convert result list into an array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
