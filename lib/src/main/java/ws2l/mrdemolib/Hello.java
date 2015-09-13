package ws2l.mrdemolib;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * Created by herman on 13/9/15.
 */
public class Hello {

    public String hello(String name) {

        String template = getString();
        return template.replaceAll("%", name);
    }

    private String getString() {

        try {

            InputStream is = getClass().getClassLoader().getResourceAsStream("template.properties");

            Properties prop = new Properties();
            prop.load(is);

            return prop.getProperty("hello");

        }
        catch (IOException e) {
            return "";
        }

    }

}
