public class ThrowsUncheckedException {
  public void test() throws RuntimeException { // ThrowsUncheckedException: runtime exception declared
    throw new RuntimeException();
  }
}
