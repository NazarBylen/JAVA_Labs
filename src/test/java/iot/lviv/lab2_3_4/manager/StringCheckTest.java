package iot.lviv.lab2_3_4.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckTest {

    String str = "today, text is about different images, for example image seaside.png , which is re" +
            "presenting sea sights , also here is image called just seaside.jpeg , wchich is a black sea image" +
            "and as the last image we have is called seaside.gif , which is a picture of sea waves moving";

    String word = "seaside";

    String res = "seaside.png, seaside.jpeg, seaside.gif";

    @Test
    void strCheck() {
        StringCheck strCheck = new StringCheck();
        assertEquals(res , strCheck.strCheck(str, word));
    }
}