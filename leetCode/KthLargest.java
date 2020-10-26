package leetCode;

import java.util.PriorityQueue;

public class KthLargest {
     PriorityQueue<Integer> PriorityQueue;
     int fixed_k;

    // KthLargest 创建一个最小堆，写入k个大的元素
    public KthLargest(int k, int[] nums) {
        fixed_k = k;
        PriorityQueue = new PriorityQueue<>(k);
        for (int val : nums) add(val);
    }

    public int add(int val) {
        // size小于k，直接放入
        if (PriorityQueue.size() < fixed_k) {
            PriorityQueue.add(val);
        } else if (val > PriorityQueue.peek()) {
            // val大于队首元素，则删除队首 添加val
            PriorityQueue.poll();
            PriorityQueue.add(val);
        }
        // PriorityQueue中保存k个大的元素，PriorityQueue中队首元素就是第k个元素
        return PriorityQueue.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = new int []{4,5,8,2};
        KthLargest kthLargest = new KthLargest(k, arr);
        System.out.println(kthLargest.PriorityQueue.peek());
        System.out.println(kthLargest.add(3));// returns 4
        System.out.println(kthLargest.add(5));// returns 5
        System.out.println(kthLargest.PriorityQueue.peek());
        System.out.println(kthLargest.add(10)); // returns 5
        System.out.println(kthLargest.add(9));// returns 8
        System.out.println(kthLargest.add(4));// returns 8

    }

}
