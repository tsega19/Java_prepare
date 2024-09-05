package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Generate the fileTest.java file
            BufferedWriter writer = new BufferedWriter(new FileWriter("fileTest.java"));
            writer.write("package IO;\n" +
                    "\n" +
                    "import java.io.BufferedWriter;\n" +
                    "import java.io.FileWriter;\n" +
                    "import java.io.IOException;\n" +
                    "\n" +
                    "public class fileTest {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        try {\n" +
                    "            BufferedWriter writer = new BufferedWriter(new FileWriter(\"fileTest.java\"));\n" +
                    "            writer.write(\"Test\");\n" +
                    "            writer.close();\n" +
                    "        } catch (IOException e) {\n" +
                    "            throw new RuntimeException(e);\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n");
            writer.close();
            System.out.println("fileTest.java has been created.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
