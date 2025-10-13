// try-with-resources example in Java

import java.io.*;

public class TryWithResourceExample {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        // The resource (BufferedReader) will automatically be closed
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            
            // Use 'br' based on your requirement
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle I/O exception
            System.err.println("I/O Error:");

        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
        }
    }
}
