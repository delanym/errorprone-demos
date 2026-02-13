public class UnnecessarilyFullyQualified {
  public void test() {
    java.util.List<String> list; // UnnecessarilyFullyQualified: import and use List instead
  }
}
