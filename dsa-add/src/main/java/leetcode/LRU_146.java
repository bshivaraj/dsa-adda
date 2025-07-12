package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LRU_146 {
    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(10);

    }
}
class LRUCache {

    private int capacity;

    HashMap<Integer,Integer> map=new HashMap();
    Stack<Map<Integer,Integer>> stack=new Stack();

    public LRUCache(int capacity) {
        this.capacity=capacity;
    }

    public int get(int key) {
        if(map.containsKey(key) && stack.search(map)!=-1){
            return key;
        }
        return -1;
    }

    public void put(int key, int value) {
        map.put(key,value);
        if(stack.size()<=this.capacity){
            stack.push(map);
        }else{
            stack.pop();
            stack.push(map);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
