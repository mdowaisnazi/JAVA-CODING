package methods;

public class MethodNaming {

    // Method names should almost always start with a verb (get, do, verify, etc)

    public static void main(String[] args) {
        int x = getSum();
    }

    static int getSum() {
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        return a + b;
    }

    void printDifference() {
        int a = 10;
        int b = 20;

        System.out.println(b - a);
    }

}
