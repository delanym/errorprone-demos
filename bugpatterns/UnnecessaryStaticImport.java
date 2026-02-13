import static java.util.Collections.emptyList; // unnecessary static import

import java.util.List;

public class UnnecessaryStaticImport {
    public static void main(String[] args) {
        // Using the static import triggers the check
        List<String> list = emptyList();
        System.out.println(list);
    }
}

