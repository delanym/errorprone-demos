import java.util.Optional;

public class UnnecessaryOptionalGet {
  public void test() {
    Optional<String> o = Optional.of("x");
    String s = o.get(); // UnnecessaryOptionalGet: use orElse or ifPresent
  }
}
