package ws2l.mrdemo;

import ws2l.mrdemolib.Hello;

/**
 * Created by herman on 13/9/15.
 */
public class HelloClient {

    public String helloWithName() {

        Hello hello = new Hello();
        return hello.hello("John");

    }

}
