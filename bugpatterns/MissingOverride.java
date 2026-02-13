class Base {
  void foo() {}
}

class MissingOverride extends Base {
  void foo() {} // MissingOverride: should have @Override
}
