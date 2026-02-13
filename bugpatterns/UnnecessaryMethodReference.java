import java.util.function.Consumer;

public class UnnecessaryMethodReference {
  public void test() {
    Consumer<String> c = System.out::println; // may be flagged if simpler form exists
  }
}
