
public class String2 {

    public static int[] checkS(String[] Strings, String[] Queries){
        int result[] = new int[Queries.length];

        for(int i=0; i<Queries.length; i++){
            for(int j=0; j<Strings.length; j++){
                if(Strings[j].equals(Queries[i])){
                    result[i]++;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {

        String[] s = {
            "aba","baba","aba","xzxb"
        };

        String[] q = {
            "aba","xzxb","ab"
        };

        int res[] = checkS(s,q);

        for (int i : res) {
            System.out.println(i);
        }
    }
}