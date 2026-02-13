interface A { void run(); }

public class UnnecessaryAnonymousClass {
  public void test() {
    A a = new A() { // UnnecessaryAnonymousClass: could be lambda
      public void run() {}
    };
  }
}
