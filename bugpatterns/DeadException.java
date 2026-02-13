public class DeadException {
  public void test() {
    new Exception(); // DeadException: created but never thrown or used
  }
}
