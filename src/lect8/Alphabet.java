package lect8;

import com.company.Person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alphabet {
    public static void main(String[] args) {
        String username1 = "AlinaMiroshnik";
        String username2 = "lollaa";
        String username3 = "Vowaaa_3333";
        String username4 = "MolliO88";
        String username5 = "kris_kris_100";
        Pattern pattern = Pattern.compile("[a-zA-Z_0-9]+");

        Matcher matcher1 = pattern.matcher(username1);
        Matcher matcher2 = pattern.matcher(username2);
        Matcher matcher3 = pattern.matcher(username3);
        Matcher matcher4 = pattern.matcher(username4);
        Matcher matcher5 = pattern.matcher(username5);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());
        System.out.println(matcher4.matches());
        System.out.println(matcher5.matches());
    }
}
