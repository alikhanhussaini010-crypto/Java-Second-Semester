
package Inheritance_polymorphism;

class A {
    int age;
  public A(int x) {
      age = x;
  }
}
class B extends A {
  public B() {
      super(23);
  }
}
public class C {
  public static void main(String[] args) {
    B b = new B();
      System.out.println(b.age);
  }
}
