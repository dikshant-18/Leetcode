class Solution {
    PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> large = new PriorityQueue<>();
    Map<Integer, Integer> delayed = new HashMap<>();

    int k, smallSize = 0, largeSize = 0;

    public double[] medianSlidingWindow(int[] nums, int k) {
        this.k = k;
        int n = nums.length;
        double[] res = new double[n - k + 1];

        for (int i = 0; i < n; i++) {
            
            if (small.isEmpty() || nums[i] <= small.peek()) {
                small.offer(nums[i]);
                smallSize++;
            } else {
                large.offer(nums[i]);
                largeSize++;
            }

            
            if (i >= k) {
                int outNum = nums[i - k];
                delayed.put(outNum, delayed.getOrDefault(outNum, 0) + 1);
                if (outNum <= small.peek()) smallSize--;
                else largeSize--;
            }

            
            balanceHeaps();

            
            prune(small);
            prune(large);

        
            if (i >= k - 1) {
                if (k % 2 == 1) res[i - k + 1] = (double) small.peek();
                else res[i - k + 1] = ((long)small.peek() + (long)large.peek()) / 2.0;
            }
        }
        return res;
    }

    private void balanceHeaps() {
        while (smallSize > largeSize + 1) {
            large.offer(small.poll());
            smallSize--;
            largeSize++;
        }
        while (largeSize > smallSize) {
            small.offer(large.poll());
            largeSize--;
            smallSize++;
        }
    }

    private void prune(PriorityQueue<Integer> heap) {
        while (!heap.isEmpty() && delayed.getOrDefault(heap.peek(), 0) > 0) {
            int num = heap.poll();
            delayed.put(num, delayed.get(num) - 1);
        }
    }
}
