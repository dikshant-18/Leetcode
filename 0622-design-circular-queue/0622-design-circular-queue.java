class MyCircularQueue {
    int[] queue;
    int fr = 0;
    int rr = -1;
    int len = 0;

    public MyCircularQueue(int k) {
        queue = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(!isFull()) {
            rr = (rr + 1) % queue.length;
            queue[rr] = value;
            len += 1;
            return true;
        }
        return false;
        
    }
    
    public boolean deQueue() {
        if(!isEmpty()) {
            fr = (fr + 1) % queue.length;
            len -= 1;
            return true;
        }
        return false;
        
    }
    
    public int Front() {
        return isEmpty() ? -1 : queue[fr];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : queue[rr];
    }
    
    public boolean isEmpty() {
        return len == 0;
    }
    
    public boolean isFull() {
        return queue.length == len;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */