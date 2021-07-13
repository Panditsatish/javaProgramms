package StringProblems;

import java.io.IOException;


public class TestClass {
    void Method() throws IOException {
        throw new IOException("Device Error");
    }
}

class ThrowsTest {
    public static void main(String[] args) {
        try {
            TestClass t = new TestClass();
            t.Method();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception Handle");
        }
    }
}
