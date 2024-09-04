package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("fileTest.java"));
              writer.write("Test");
              writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
