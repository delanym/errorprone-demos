public class UnnecessaryBoxedAssignment {
  public void test() {
    Integer x = 5; // unnecessary boxing
    x = 10;        // UnnecessaryBoxedAssignment
  }
}
