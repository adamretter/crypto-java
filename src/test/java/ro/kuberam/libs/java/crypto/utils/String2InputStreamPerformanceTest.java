package ro.kuberam.libs.java.crypto.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.BeforeClass;
import org.junit.Test;

import ro.kuberam.tests.junit.BaseTest;

public class String2InputStreamPerformanceTest extends BaseTest {

    private static String tempString;

    @BeforeClass
    public static void initialize() throws IOException {
        tempString = generate5MbTempString();
    }

    @Test
    public void test() throws IOException {
        try (final InputStream is = new ByteArrayInputStream(tempString.getBytes(StandardCharsets.UTF_8))) {

        }
    }

}
