class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for (int num : freq.keySet()) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }

        return res;
    }

    // public int[] topKFrequent(int[] nums, int k) {
    //     Map<Integer, Integer> freq = new HashMap<>();

    //     // Count frequency
    //     for (int num : nums) {
    //         freq.put(num, freq.getOrDefault(num, 0) + 1);
    //     }

    //     // Bucket: index = frequency
    //     List<Integer>[] bucket = new List[nums.length + 1];

    //     for (int num : freq.keySet()) {
    //         int frequency = freq.get(num);

    //         if (bucket[frequency] == null) {
    //             bucket[frequency] = new ArrayList<>();
    //         }

    //         bucket[frequency].add(num);
    //     }

    //     // Get top k
    //     int[] res = new int[k];
    //     int index = 0;

    //     for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
    //         if (bucket[i] != null) {
    //             for (int num : bucket[i]) {
    //                 res[index++] = num;

    //                 if (index == k) {
    //                     break;
    //                 }
    //             }
    //         }
    //     }

    //     return res;
    // }
}

