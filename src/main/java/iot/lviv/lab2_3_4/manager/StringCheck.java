package iot.lviv.lab2_3_4.manager;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCheck {
    public String strCheck(String str, String setWord) {

        String regex = "\\b"+setWord+"\\b+\\.(png|jpg|gif|bmp|jpeg)";

        ArrayList images = new ArrayList<>();

        Pattern valid = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m= valid.matcher(str);

        int count = 0;
        while(m.find()) {
            count++;
            //System.out.println(str.substring(m.start(), m.end()));
            images.add(str.substring(m.start(), m.end()).toLowerCase());
        }
        return images.toString().replace("[", "").replace("]", "");
    }
}
