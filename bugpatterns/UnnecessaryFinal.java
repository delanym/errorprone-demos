public class UnnecessaryFinal {
  public void test() {
    final int x = 5; // UnnecessaryFinal: no need for final
  }
}
