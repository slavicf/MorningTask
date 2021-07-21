public class L4H_final {

    static void b (boolean y) {
        System.out.println(y);
    }

    private static String getMessage() {
        try {
            return "Line 1";
        } finally {
            return "Line 2";
        }
    }

    public static void main(String[] args) {
        boolean y = false;

        b(!y);

        System.out.println(getMessage());
    }
}
