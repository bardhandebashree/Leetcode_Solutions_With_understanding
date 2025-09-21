class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int n:nums)
        {
            pq.add(n);
            if(pq.size>k)
            {
                pq.poll();
            }
        }
        return pq.peek();
    }
}

//here we are keeping the queue size as the k value so time to make the heap is log k
//and total will be nlog k

// lets try with Quick sort as the best case will be On and worst will be O(n^2)