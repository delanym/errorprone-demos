public class UnnecessaryAssignment {
  public void test() {
    int x = 0;
    x = 5; // UnnecessaryAssignment: initial assignment is useless
  }
}
