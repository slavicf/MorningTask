public class L4N_result {
    static {
        i = 10;
    }

    static int i = 0;

    static {
        ++i;
    }

    public static void main(String[] args) {
        new L4N_result();
        System.out.println(i);
    }
}
