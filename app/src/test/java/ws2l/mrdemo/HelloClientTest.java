package ws2l.mrdemo;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by herman on 13/9/15.
 */
public class HelloClientTest {

    @Test
    public void testHelloClient() {

        HelloClient client = new HelloClient();
        Assert.assertEquals("Hello, John!", client.helloWithName());

    }

}
