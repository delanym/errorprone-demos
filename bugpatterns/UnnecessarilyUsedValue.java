public class UnnecessarilyUsedValue {
  public void test() {
    int x = 5;
    int y = x; // UnnecessarilyUsedValue: using x just to assign
  }
}
