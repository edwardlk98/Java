package ReadingFiles;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class home2 {
    public static void main(String[] args) throws IOException {
        Scanner file, lineScan;
        String line;
        file = new Scanner(new File("ReadingFiles/sample_story.txt"));
        int lineNumber = 1;
        while (file.hasNext()) {
            line = file.nextLine();
            lineScan = new Scanner(line);
            while (lineScan.hasNext()) {
                if (line.length()>20) {
                    System.out.println("Line " + lineNumber + " is greator than 20 ");
                }
                else{
                    System.out.println("Line " + lineNumber + " is less than 20 ");
                }
                lineScan.nextLine();
                lineNumber+=2 ;
            }
        }
    }
}
