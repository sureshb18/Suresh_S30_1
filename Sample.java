// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

// Approach

// 1) create boolean array of given size
// 2) add true to boolean array if adding an element
// 3) add false to boolean array if deleting
// 4) return value of the key

class MyHashSet {

    private boolean[] data;

    public MyHashSet() {
        data = new boolean[1000001];
        
    }
    
    public void add(int key) {
        data[key] = true;
    }
    
    public void remove(int key) {
        data[key] = false;
    }
    
    public boolean contains(int key) {
        return data[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */