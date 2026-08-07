import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // How to write al file using Java (4 popular options)

        String filePath = "/Users/hteinlynnaung/Downloads/text.txt";
        String textContent = """
                Hello! My name is Ezra.
                And I'm studying Bachelor of Software Engineering
                at North Chiang Mai University.
                Chiang Mai is beautiful and peaceful place at Northern Thailand.
                Welcome from Chiang Main Thailand!
                """;

        try(FileWriter writer = new FileWriter("/Users/hteinlynnaung/Downloads/test.txt")) {
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file location");
        }
        catch(IOException e) {
            System.out.println("Could not write file");
        }

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)


    }
}
