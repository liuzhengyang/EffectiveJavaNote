package com.extra;

import org.junit.Test;

import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.Socket;

/**
 * Created by liuzhengyang on 2015/3/24.
 */
public class StringBuilderTest {

    @Test
    public void appendNull() throws IOException {
        StringBuilder sb = new StringBuilder();
        System.out.println("a" + null);
        System.out.println(Integer.valueOf("12", 3));
        System.out.println(Integer.parseInt("10", 2));
        Socket socket = new Socket("http://www.baidu.com",80);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        BigDecimal bigDecimal = new BigDecimal(3);
        System.out.println();

    }
}
