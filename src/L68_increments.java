public class L68_increments {

    public static void main(String[] args) {
        int i = 0;
        i = i++;
        System.out.println(i);

        int a = 5;
        a = ++a + ++a;
        System.out.println(a);
    }
}
