class A {
    void f() {
        System.out.print("A.f() ");
    }

    A() {
        System.out.print("BeforeA.f() ");
        f();
        System.out.print("AfterA.f() ");
    }
}

class B extends A {
    B() {
        System.out.print("ConsB ");
    }

    void f() {
        System.out.print("B.f() ");
    }
}

public class L53_inheritance {
    public static void main(String[] args) {
        new B();
    }
}
