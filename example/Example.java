// Example from http://web.cs.ucla.edu/~palsberg/tba/papers/dean-grove-chambers-ecoop95.pdf

public class Example {
    public void main() {
      H h = new H();
      h.m();
  
      A a = new C();
      a.m();

      bruh1();
    }

    void bruh1() {
      bruh2();
    }

    void bruh2() {
      bruh3();
    }

    void bruh3() {
      bruh1();
    }

    void hello() {
      
    }
  }
  
  class H extends F {}
  
  class G extends F {}
  
  class F extends C {
    @Override
    void p() {
    }
  }
  
  class E extends C {
    @Override
    void m() {
    }
  }
  
  class D extends B {
  }
  
  class C extends A {
    static { final A G = new G(); }
    @Override
    void m() {
    }
  }
  
  class B extends A {
    @Override
    void m() {
    }
  }
  
  class A {
    void m() {
      hello("asd", 2);
    }
  
    void p() {
      
    }

    public void hello(String a, int b) {

    }
  }