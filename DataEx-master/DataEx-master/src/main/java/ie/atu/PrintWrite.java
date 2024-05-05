package ie.atu;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class PrintWrite {

    public static void main(String[] args) {


        String fileName = "File12.txt";;

        File myFile = new File(fileName);

        try {
            if (myFile.createNewFile()) {
                System.out.println("File created successfully at " + myFile.getAbsolutePath());
                PrintWriter myPrintWriter = new PrintWriter(myFile);
                myPrintWriter.write("This is my Second printWriter line\n");
                myPrintWriter.close();

            } else {
                System.out.println("File already exists at " + myFile.getAbsolutePath());
                PrintWriter myPrintWriter = new PrintWriter(myFile);
                myPrintWriter.write("This is my Second printWriter line\n");
                myPrintWriter.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file");
            e.printStackTrace();
        }
    }
}

