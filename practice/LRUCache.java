import java.util.LinkedList;
import java.util.ListIterator;

class LRUCache {

    
    
    
    class Pair {
        int Key, Data;

        Pair(int key, int data) {
            Key = key;
            Data = data;
        }
    }

    int Capacity = 0;
    LinkedList<Pair> queue;

    public LRUCache(int capacity) {
        queue = new LinkedList<>();
        Capacity = capacity;
    }

    public int get(int key) {
        ListIterator<Pair> i = queue.listIterator();

        while (i.hasNext()) {
            Pair temp = i.next();
            if (key == temp.Key) {
                i.remove();
                queue.addFirst(temp);
                return temp.Data;
            }
        }
        return -1;
    }

     public void put(int key, int value) {

        int size = queue.size();

        Pair temp = new Pair(key, value);
        ListIterator<Pair> i = queue.listIterator();

        while (i.hasNext()) {
            Pair temp2 = i.next();
            if (key == temp2.Key) {
                temp2.Data = value;
                
                i.remove();
                queue.addFirst(temp);
                return;
            }
        }
        if (size == Capacity) {
            queue.removeLast();
        }
        
        queue.addFirst(temp);
    }


    public static void main(String[] args) {
        LRUCache a = new LRUCache(2);

        a.put(1, 1);
        a.put(2, 2);
        // a.put(3, 3);
        
        ListIterator<Pair> i = a.queue.listIterator();
        
        while(i.hasNext()){
            Pair temp = i.next();
            System.out.println(temp.Data);
        }
        // System.out.println(a.get(1));
        // System.out.println(a.get(3));
        // System.out.println(a.get(2));
    }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */