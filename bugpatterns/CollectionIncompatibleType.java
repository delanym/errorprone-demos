import java.util.Set;
import java.util.HashSet;

public class CollectionIncompatibleType {
    public static void main(String[] args) {
        Set<Short> s = new HashSet<>();
        s.add((short) 1);
        s.add((short) 2);
        s.add((short) 3);

        int i = 2;
        s.remove(i - 1);
    }
}

