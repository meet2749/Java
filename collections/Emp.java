package collections;

public class Emp implements Comparable<Emp> {
    int eid;
    String ename;

    public Emp(int id, String name) {
        this.eid = id;
        this.ename = name;
    }

    @Override
    public int compareTo(Emp o) {
        
        if(eid>o.eid){
            return 1;
        }
        if(eid<o.eid){
            return -1;
        }
        else
            return 0;
    }
}