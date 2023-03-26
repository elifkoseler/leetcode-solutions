import java.util.*;

public class DesignAnOrderedStream {
    int ptr;
    String [] result;

    public DesignAnOrderedStream(int n) {
        ptr = 0;
        result = new String [n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();

        result[idKey - 1] = value;
        while(ptr < result.length && result[ptr] != null) {
            list.add(result[ptr]);
            ptr++;
        }
        return list;
    }
}
