import java.util.HashMap;
import java.util.Map;

public class UnnecessarySetDefault {
  public void test() {
    Map<String,String> map = new HashMap<>();
    map.putIfAbsent("a","a"); // UnnecessarySetDefault: value already absent by default
  }
}
