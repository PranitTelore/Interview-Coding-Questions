public class SwapNumber {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.err.println("Before Swap");
        System.err.println("x=" + x + "  y=" + y);

        System.err.println("After Swap ");

        y = y - x;
        x = x + y;
        System.err.println("x=" + x + "  y=" + y);

    }
}