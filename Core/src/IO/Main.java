package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Generate the fileTest.java file
            BufferedWriter writer = new BufferedWriter(new FileWriter("IO/fileTest.java"));
            writer.write("package IO;\n" +
                    "\n" +
                    "import java.io.BufferedWriter;\n" +
                    "import java.io.FileWriter;\n" +
                    "import java.io.IOException;\n" +
                    "\n" +
                    "public class fileTest {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        try {\n" +
                    "            BufferedWriter writer = new BufferedWriter(new FileWriter(\"IO/fileTest.java\"));\n" +
                    "            writer.write(\"Test\");\n" +
                    "            writer.close();\n" +
                    "        } catch (IOException e) {\n" +
                    "            throw new RuntimeException(e);\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n");
            writer.close();
            System.out.println("fileTest.java has been created.");

            // Step 2: Compile the generated fileTest.java file
            Process compileProcess = Runtime.getRuntime().exec("javac IO/fileTest.java");
            compileProcess.waitFor(); // Wait for the compilation to finish
            System.out.println("fileTest.java has been compiled.");

            // Step 3: Run the compiled fileTest class
            Process runProcess = Runtime.getRuntime().exec("java IO.fileTest");
            runProcess.waitFor(); // Wait for the execution to finish
            System.out.println("fileTest.class has been executed.");

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
