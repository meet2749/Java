public class Ll {
    public static void main(String[] args) {
        
        int i = 8;
        
        if( i%5 >2  ){
            i+=(5 - i%5);
        }
        System.out.println(i);

    }

}