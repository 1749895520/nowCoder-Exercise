public class Test {
    public static void main(String[] args) {
    }
}

class A {
    public A() {
        System.out.println("class A");
    }

    {
        System.out.println("I'm A class");
    }

    static {
        System.out.println("class A static");
    }
}

class B extends A {
    public B() {
        System.out.println("class B");
    }

    {
        System.out.println("I'm B class");
    }

    static {
        System.out.println("class B static");
    }

    public static void main(String[] args) {
        new B();
    }
}
