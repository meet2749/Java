package LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(2);
        list.insert(6);
        list.insert(7);
        list.insert(58);
        list.deleteAt(2);

        list.show();
    }
}