package iot.lviv.lab2_3_4.manager;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCheck {
    public String validateImage(String str, String setWord) {

        String regex = "\\b"+setWord+"\\b+\\.(png|jpg|gif|bmp|jpeg)";

        ArrayList images = new ArrayList<>();

        Pattern valid = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher matcher = valid.matcher(str);
        while(matcher.find()) {
            images.add(str.substring(matcher.start(), matcher.end()).toLowerCase());
        }
        return images.toString().replace("[", "").replace("]", "");
    }
}
