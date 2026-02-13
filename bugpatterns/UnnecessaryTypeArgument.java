import java.util.Collections;
import java.util.List;

public class UnnecessaryTypeArgument {
  public void test() {
    List<String> l = Collections.<String>emptyList(); // UnnecessaryTypeArgument
  }
}
