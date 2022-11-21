package ua.lviv.iot.manager;

import java.util.regex.Pattern;
public class Text {
    public String pattern = "\\b(.[a-zA-Z]\\d{0,5}\\d.[a-zA-Z])\\b";

    public void deleteWordsWithDigitsNumberLessThen5(String text) {
        Pattern pattern1 = Pattern.compile(pattern);
        String replaced = pattern1.matcher(text).replaceAll("");
        System.out.println(replaced);
    }

}

