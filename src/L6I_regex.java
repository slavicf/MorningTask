import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L6I_regex {

    public static void main(String[] args) {
        String s = "1 2 3 4 5 6 7 8 9 10 11";
        Pattern p = Pattern.compile("[1-11]");
        Matcher m = p.matcher(s);
        while (m.find())
            System.out.print(m.group()+ " ");
    }
}
