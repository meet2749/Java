import java.util.ArrayList;

public class Heap {

    ArrayList<Integer> heap = new ArrayList<>();


    private void shiftUp(){
        int k = heap.size() -1;
        while(k>0){
            int p = (k-1)/2;
            int child = heap.get(k);
            int parent = heap.get(p);

            if(child>parent){
                heap.set(p, child);
                heap.set(k, parent);
                k = p;
            }else{
                break;
            }
        }
    }

    private void shiftDown(){
        int k = 0;
        int l = 1;
        while(l<heap.size()){
            int max = l, r = l+1;
            if(r<heap.size()){
                if(heap.get(l)<heap.get(r)){
                    max++;
                }
            }
            if(heap.get(k)<heap.get(max)){
                int temp = heap.get(k);
                heap.set(k, heap.get(max));
                heap.set(max, temp);
                k = max;
                l = 2*k+1;
            }
            else{
                break;
            }
        }
    }

    public void insert(int data){
        heap.add(data);
        shiftUp();
    }

    public int delete(){
        if(heap.size() == 0){
            return -1;
        }
        int first = heap.get(0);
        int last = heap.size()-1;
        heap.set(0, heap.get(last));
        heap.remove(last);
        if(last > 1){
            shiftDown();
        }
        return first;
    }

    public static void main(String[] args) {
        Heap m = new Heap();
        m.insert(0);
        m.insert(4);
        m.insert(1);
        m.insert(3);
        m.insert(6);
        m.insert(9);

        while(m.heap.size()>0){
            System.out.println(m.delete());
        }
    }
}