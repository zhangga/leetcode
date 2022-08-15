/*
 * @lc app=leetcode.cn id=641 lang=java
 *
 * [641] 设计循环双端队列
 */

// @lc code=start
class MyCircularDeque {

    private int[] items;
    private int head;
    private int tail;
    private int size;

    public MyCircularDeque(int k) {
        this.items = new int[k];
        this.size = 0;
        this.head = k - 1;
        this.tail = 0;
    }
    
    public boolean insertFront(int value) {
        if (this.isFull()) {
            return false;
        }
        this.head++;
        this.head = this.head % this.items.length;
        this.items[this.head] = value;
        this.size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if (this.isFull()) {
            return false;
        }
        this.tail--;
        if (this.tail < 0) {
            this.tail = this.items.length - 1;
        }
        this.items[this.tail] = value;
        this.size++;
        return true;
    }
    
    public boolean deleteFront() {
        if (this.isEmpty()) {
            return false;
        }
        this.head--;
        if (this.head < 0) {
            this.head = this.items.length - 1;
        }
        this.size--;
        return true;
    }
    
    public boolean deleteLast() {
        if (this.isEmpty()) {
            return false;
        }
        this.tail++;
        this.tail = this.tail % this.items.length;
        this.size--;
        return true;
    }
    
    public int getFront() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.items[this.head];
    }
    
    public int getRear() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.items[this.tail];
    }
    
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    public boolean isFull() {
        return this.size == this.items.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
// @lc code=end

