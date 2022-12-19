public class Test implements In {
    public static void main(String[] args) {
    }

    void fermin(int i) {
        i++;
    }

    @Override
    public void f() {

    }
}

class StaticStuff {
    static int x = 10;

    static {
        x += 5;
    }

    public static void main(String args[]) {
        System.out.println("x=" + x);
    }

    static {
        x /= 3;
    }
}
