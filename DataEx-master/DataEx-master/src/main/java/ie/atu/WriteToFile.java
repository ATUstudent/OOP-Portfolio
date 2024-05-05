package ie.atu;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {


        String fileName = "File12.txt";;

        File myFile = new File(fileName);

        try {
            if (myFile.createNewFile()) {
                System.out.println("File created successfully at " + myFile.getAbsolutePath());
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write("This is the first sentence of the text");
                myWriter.close();

            } else {
                System.out.println("File already exists at " + myFile.getAbsolutePath());
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write("\nThis is the fourth sentence of the text\n");
                myWriter.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file");
            e.printStackTrace();
        }
    }
}
