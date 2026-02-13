public class UnnecessaryMethodInvocationMatcher {
  public void test(String s) {
    s.equals(s); // UnnecessaryMethodInvocationMatcher: redundant call
  }
}
