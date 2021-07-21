import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L6J_regex {

    public static void main(String[] args) {
        String s = "datadata dataa";
        Pattern p = Pattern.compile("data{2}");
        Matcher m = p.matcher(s);
        while (m.find())
            System.out.println(m.group() + " ");

    }
}
