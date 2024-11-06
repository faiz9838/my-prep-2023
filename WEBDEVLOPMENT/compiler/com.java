import java.io.*;

public class com {
    public static void main(String[] args) {
        String cppCode = "#include <iostream>\n" +
                "\n" +
                "int main() {\n" +
                "    std::cout << \"Hello, world!\" << std::endl;\n" +
                "    return 0;\n" +
                "}";
        runCppCode(cppCode);
    }

    public static void runCppCode(String code) {
        try {
            // Write the C++ code to a temporary file
            File tempCppFile = new File("temp.cpp");
            FileWriter writer = new FileWriter(tempCppFile);
            writer.write(code);
            writer.close();

            // Compile the C++ code using g++
            ProcessBuilder compileProcessBuilder = new ProcessBuilder("g++", "temp.cpp", "-o", "temp");
            Process compileProcess = compileProcessBuilder.start();
            compileProcess.waitFor();

            // Run the compiled executable
            ProcessBuilder runProcessBuilder = new ProcessBuilder("./temp");
            Process runProcess = runProcessBuilder.start();

            // Read output from the process
            BufferedReader outputReader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(runProcess.getErrorStream()));

            String line;
            System.out.println("Output:");
            while ((line = outputReader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("Error:");
            while ((line = errorReader.readLine()) != null) {
                System.out.println(line);
            }

            // Clean up temporary files
            tempCppFile.delete();
            File tempExecutable = new File("temp");
            tempExecutable.delete();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
