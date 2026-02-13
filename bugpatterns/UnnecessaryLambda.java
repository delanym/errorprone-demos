import java.util.function.Consumer;

public class UnnecessaryLambda {
  public void test() {
    Consumer<String> c = s -> System.out.println(s); // UnnecessaryLambda: could use method reference
  }
}
